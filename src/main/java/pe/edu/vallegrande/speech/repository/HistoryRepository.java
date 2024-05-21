package pe.edu.vallegrande.speech.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import pe.edu.vallegrande.speech.model.History;
import reactor.core.publisher.Flux;

public interface HistoryRepository extends R2dbcRepository<History, Long> {
    Flux<History> findAll();
}