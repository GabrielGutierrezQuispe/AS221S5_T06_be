package pe.edu.vallegrande.speech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.speech.model.History;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
