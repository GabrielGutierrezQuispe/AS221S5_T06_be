package com.service.cognitive.speech.service;
import com.service.cognitive.speech.repository.SpeechRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class TextToSpeech {

    private final SpeechRepository speechRepository;

}