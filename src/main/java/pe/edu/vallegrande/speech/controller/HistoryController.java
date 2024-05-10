package pe.edu.vallegrande.speech.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.speech.model.History;
import pe.edu.vallegrande.speech.service.HistoryService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/speech")
public class HistoryController {

    private final HistoryService historyService;

    @GetMapping("/list")
    public Flux<History> listSpeech() {
        return historyService.listSpeech();
    }

    @PostMapping("/save")
    public Mono<String> generateSpeech(@RequestBody String text) {
        return historyService.generateSpeech(text);
    }
}