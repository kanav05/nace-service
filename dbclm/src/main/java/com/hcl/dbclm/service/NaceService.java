/**
 * 
 */
package com.hcl.dbclm.service;

import java.util.List;
import java.util.Optional;

import com.hcl.dbclm.entity.Nace;

/**
 * @author Admin
 *
 */
public interface NaceService {
	
	Nace create(Nace nace);
	
	List<Nace> getAllNace();
   
	public Optional<Nace> getNaceDetailById(Long id);

}
