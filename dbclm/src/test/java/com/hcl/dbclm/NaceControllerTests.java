package com.hcl.dbclm;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
 
import java.util.Arrays;
import java.util.List;
 
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.hcl.dbclm.controller.NaceController;
import com.hcl.dbclm.entity.Nace;
import com.hcl.dbclm.service.NaceService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(NaceController.class)
public class NaceControllerTests {
	
	 @MockBean
	  NaceService naceService;
	 
	  @Autowired
	  MockMvc mockMvc;
	  
	  @Test
	  public void testfindAll() throws Exception {
	  //  Nace nace = new Nace(1L, "TEST", "205","HCL","It is testing for Spring Applcation","Spring Applcation","Spring Applcation2","34","Spring Applcation6","Spring Applcation8");
	    //List<Nace> naces = Arrays.asList(nace);
	 
	   // Mockito.when(naceService.getAllNace()).thenReturn(naces);
	 
	    mockMvc.perform(get("/api/v1/nace/1"))
	        .andExpect(status().isOk())
	        .andExpect(jsonPath("$", Matchers.hasSize(1)))
	        .andExpect(jsonPath("$[1].level", Matchers.is("TEST")));
	  }
	 

}
