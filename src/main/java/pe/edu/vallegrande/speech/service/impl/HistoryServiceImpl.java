package pe.edu.vallegrande.speech.service.impl;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.SpeechSynthesizer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.speech.model.History;
import pe.edu.vallegrande.speech.repository.HistoryRepository;
import pe.edu.vallegrande.speech.service.HistoryService;
import java.util.concurrent.ExecutionException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoryServiceImpl implements HistoryService {

    private final HistoryRepository historyRepository;
    private final SpeechConfig speechConfig;
    private final SpeechSynthesizer speechSynthesizer;

    @Autowired
    public HistoryServiceImpl(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
        String speechKey = "f04e0f2649624fb1ab3090483a6b2dc0";
        String speechRegion = "eastus";

        speechConfig = SpeechConfig.fromSubscription(speechKey, speechRegion);
        speechSynthesizer = new SpeechSynthesizer(speechConfig);
    }

    @Override
    public List<History> listSpeech() {
        return historyRepository.findAll();
    }

    @Override
    public String generateSpeech(String text) {
        if (text.isEmpty()) {
            throw new RuntimeException("El texto no puede estar vacío.");
        }

        try {
            speechSynthesizer.SpeakTextAsync(text).get();
            History newText = new History();
            newText.setText(text);
            historyRepository.save(newText);
            return "Texto: [" + text + "] sintetizado correctamente.";
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error al sintetizar el texto a voz: " + e.getMessage());
        }
    }
}
