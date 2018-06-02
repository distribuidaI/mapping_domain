package ar.edu.undav.mappingdomain.repository;

import ar.edu.undav.mappingdomain.domain.Footballer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballerRepository extends JpaRepository<Footballer, Long> {

}
