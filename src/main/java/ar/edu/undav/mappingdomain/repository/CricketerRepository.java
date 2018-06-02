package ar.edu.undav.mappingdomain.repository;

import ar.edu.undav.mappingdomain.domain.Cricketer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CricketerRepository extends JpaRepository<Cricketer, Long> {
}
