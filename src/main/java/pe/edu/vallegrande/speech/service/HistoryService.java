package pe.edu.vallegrande.speech.service;

import pe.edu.vallegrande.speech.model.History;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface HistoryService {
    Flux<History> listSpeech();
    Mono<String> generateSpeech(String text);
}
