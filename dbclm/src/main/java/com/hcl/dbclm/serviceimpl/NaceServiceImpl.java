/**
 * 
 */
package com.hcl.dbclm.serviceimpl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dbclm.entity.Nace;

import com.hcl.dbclm.repository.NaceRepository;
import com.hcl.dbclm.service.NaceService;

/**
 * @author Admin
 *
 */

@Service
public class NaceServiceImpl implements NaceService{

	
	@Autowired
	private NaceRepository naceRepository;
	
	@Override
	@Transactional
	public Nace create(Nace nace) {
		return naceRepository.save(nace);
		
	}

	@Override
	public List<Nace> getAllNace() {
		
		return (List<Nace>) naceRepository.findAll();
	}

	@Override
	public Optional<Nace> getNaceDetailById(Long id) {
		
		return naceRepository.findById(id);
	}

}
