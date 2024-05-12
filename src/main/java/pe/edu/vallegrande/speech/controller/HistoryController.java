package pe.edu.vallegrande.speech.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.speech.model.History;
import pe.edu.vallegrande.speech.service.impl.HistoryServiceImpl;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/speech")
public class HistoryController {

    private final HistoryServiceImpl historyServiceImpl;

    @GetMapping("/list")
    public Flux<History> listSpeech() {
        return historyServiceImpl.listSpeech();
    }

    @PostMapping("/save")
    public Mono<String> generateSpeech(@RequestBody String text) {
        return historyServiceImpl.generateSpeech(text);
    }
}