package pe.edu.vallegrande.speech.service;

import com.microsoft.cognitiveservices.speech.SpeechSynthesisResult;
import pe.edu.vallegrande.speech.model.History;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface HistoryService {

    List<History> listSpeech();

    String generateSpeech(String text);



}
