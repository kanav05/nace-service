package com.hcl.dbclm;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.hcl.dbclm.controller.NaceController;
import com.hcl.dbclm.entity.Nace;
  
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class IntegrationNaceTests {
	
	@Autowired
	  NaceController naceController;
	 
	  @Test
	  public void testCreateReadDelete() {
		 // Nace nace = new Nace(1L, "TEST", "205","HCL","It is testing for Spring Applcation","Spring Applcation","Spring Applcation2","34","Spring Applcation6","Spring Applcation8");
	 
	  // ResponseEntity<Nace> naceResult = naceController.saveNace(nace);
	 
	    Iterable<Nace> naces = naceController.getAllNace();
	    Assertions.assertThat(naces).first().hasFieldOrPropertyWithValue("level", "TEST");
	 
	  }

}
