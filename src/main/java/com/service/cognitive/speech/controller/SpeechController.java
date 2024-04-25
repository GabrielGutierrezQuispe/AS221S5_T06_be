package com.service.cognitive.speech.controller;

import com.microsoft.cognitiveservices.speech.ResultReason;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.SpeechSynthesisResult;
import com.microsoft.cognitiveservices.speech.SpeechSynthesizer;
import com.service.cognitive.speech.entity.Speech;
import com.service.cognitive.speech.repository.SpeechRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/speech")
public class SpeechController {

    private final SpeechSynthesizer speechSynthesizer;
    private final SpeechRepository speechRepository;

    @Autowired
    public SpeechController(SpeechRepository speechRepository) {
        String speechKey = "a9cd4778a1684fd3b058c4f230fdbbd6";
        String speechRegion = "eastus";

        SpeechConfig speechConfig = SpeechConfig.fromSubscription(speechKey, speechRegion);
        speechConfig.setSpeechSynthesisVoiceName("en-US-AvaMultilingualNeural");
        this.speechSynthesizer = new SpeechSynthesizer(speechConfig);
        this.speechRepository = speechRepository;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Speech>> listSpeech(){
        return ResponseEntity.ok(speechRepository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<String> generateSpeech(@RequestBody String texto) {
        if (texto.isEmpty()) {
            return ResponseEntity.badRequest().body("Text cannot be empty.");
        }

        try {
            SpeechSynthesisResult speechSynthesisResult = speechSynthesizer.SpeakTextAsync(texto).get();
            if (speechSynthesisResult.getReason() == ResultReason.SynthesizingAudioCompleted) {
                Speech newText = new Speech();
                newText.setText(texto);
                speechRepository.save(newText);
                return ResponseEntity.ok("TextToSpeech synthesized to speaker for text [" + texto + "] and saved to database.");
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error synthesizing text to speech.");
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error synthesizing text to speech: " + e.getMessage());
        }
    }

}
