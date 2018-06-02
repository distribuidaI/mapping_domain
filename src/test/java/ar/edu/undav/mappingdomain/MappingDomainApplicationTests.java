package ar.edu.undav.mappingdomain;

import ar.edu.undav.mappingdomain.domain.Bowler;
import ar.edu.undav.mappingdomain.domain.Cricketer;
import ar.edu.undav.mappingdomain.domain.Footballer;
import ar.edu.undav.mappingdomain.repository.BowlerRepository;
import ar.edu.undav.mappingdomain.repository.CricketerRepository;
import ar.edu.undav.mappingdomain.repository.FootballerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MappingDomainApplicationTests {

	@Autowired
	private FootballerRepository footballerRepository;

	@Autowired
	private CricketerRepository cricketerRepository;

	@Autowired
	private BowlerRepository bowlerRepository;

	@Test
	public void saveFootballer() {
		footballerRepository.save(new Footballer("juan", "qac"));
	}

	@Test
	public void saveCricketer() {
		cricketerRepository.save(new Cricketer("jose", 7.2f));
	}

	@Test
	public void saveBowler() {
		bowlerRepository.save(new Bowler("ricard", 2.4f, 5.5f));
	}

}
