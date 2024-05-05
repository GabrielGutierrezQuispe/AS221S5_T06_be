package pe.edu.vallegrande.speech.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.speech.model.History;
import pe.edu.vallegrande.speech.service.HistoryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/speech")
public class HistoryController {

    private final HistoryService historyService;

    @GetMapping("/list")
    public ResponseEntity<List<History>> listSpeech() {
        return ResponseEntity.ok(historyService.listSpeech());
    }

    @PostMapping("/save")
    public ResponseEntity<String> generateSpeech(@RequestBody String text) {
        try{
            return ResponseEntity.ok(historyService.generateSpeech(text));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
