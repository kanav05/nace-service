package com.hcl.dbclm;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.hcl.dbclm.entity.Nace;
import com.hcl.dbclm.repository.NaceRepository;
import com.hcl.dbclm.service.NaceService;

@ExtendWith(MockitoExtension.class)
public class ServiceTests {
	
	@InjectMocks
	private NaceService naceService;
	@Mock 
	private NaceRepository naceRepository;
	
	 @Test
	    public void testFindAllEmployees()
	    {
	        List<Nace> list = new ArrayList<Nace>();
	       // Nace nace1 = new Nace(1L, "Java", "205","HCL","It is testing for Spring Applcation","Spring Applcation","Spring Applcation2","34","Spring Applcation6","Spring Applcation8");
	      //  Nace nace2 = new Nace(2L, "Spring", "205","HCL","It is testing for Spring Applcation","Spring Applcation","Spring Applcation2","34","Spring Applcation6","Spring Applcation8");
	        //Nace nace3 = new Nace(3L, "Boot", "205","HCL","It is testing for Spring Applcation","Spring Applcation","Spring Applcation2","34","Spring Applcation6","Spring Applcation8");
	          
	       // list.add(nace1);
	       // list.add(nace2);
	        //list.add(nace3);
	          
	       // when(naceRepository.findAll()).thenReturn(list);
	          
	        //test
	        List<Nace> empList = naceService.getAllNace();
	          
	        assertEquals(3, empList.size());
	        //verify(naceRepository, times(1)).findAll();
	    }
	 
	 
	 
	 

	
}
