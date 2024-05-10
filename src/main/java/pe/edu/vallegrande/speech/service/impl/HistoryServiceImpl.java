package pe.edu.vallegrande.speech.service.impl;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.SpeechSynthesizer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.speech.model.History;
import pe.edu.vallegrande.speech.repository.HistoryRepository;
import pe.edu.vallegrande.speech.service.HistoryService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.ExecutionException;

@Service
@RequiredArgsConstructor
public class HistoryServiceImpl implements HistoryService {

    private final HistoryRepository historyRepository;
    private final SpeechConfig speechConfig;
    private final SpeechSynthesizer speechSynthesizer;

    public HistoryServiceImpl(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
        String speechKey = "f04e0f2649624fb1ab3090483a6b2dc0";
        String speechRegion = "eastus";

        speechConfig = SpeechConfig.fromSubscription(speechKey, speechRegion);
        speechSynthesizer = new SpeechSynthesizer(speechConfig);
    }

    @Override
    public Flux<History> listSpeech() {
        return historyRepository.findAll();
    }

    @Override
    public Mono<String> generateSpeech(String text) {
        return Mono.just(text)
                .filter(t -> !t.isEmpty())
                .flatMap(t -> {
                    try {
                        speechSynthesizer.SpeakTextAsync(t).get();
                        History newText = new History(null, t);
                        return historyRepository.save(newText)
                                .thenReturn("Texto: [" + t + "] sintetizado correctamente.");
                    } catch (InterruptedException | ExecutionException e) {
                        return Mono.error(new RuntimeException("Error al sintetizar el texto a voz: " + e.getMessage()));
                    }
                });
    }
}