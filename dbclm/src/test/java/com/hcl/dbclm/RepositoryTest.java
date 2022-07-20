package com.hcl.dbclm;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.hcl.dbclm.entity.Nace;
import com.hcl.dbclm.repository.NaceRepository;
 

 
@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class RepositoryTest {
	
	@Autowired
	NaceRepository naceRepository;
	
	@Test
	  public void testCreateRead() {
		//Nace nace = new Nace(1L, "TEST", "205","HCL","It is testing for Spring Applcation","Spring Applcation","Spring Applcation2","34","Spring Applcation6","Spring Applcation8");
	 
		//naceRepository.save(nace);
	 
	    Iterable<Nace> naces = naceRepository.findAll();
	   // Assertions.assertThat(naces).extracting(Nace::getLevel).containsOnly("TEST");
	 
	    naceRepository.deleteAll();
	    Assertions.assertThat(naceRepository.findAll()).isEmpty();
	  }

}
