package com.service.cognitive.speech.repository;

import com.service.cognitive.speech.entity.Speech;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeechRepository extends JpaRepository <Speech, Long> {
}
