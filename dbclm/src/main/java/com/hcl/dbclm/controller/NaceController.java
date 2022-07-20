package com.hcl.dbclm.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dbclm.entity.Nace;
import com.hcl.dbclm.service.NaceService;

@RestController
@RequestMapping("/api/v1")
public class NaceController {

@Autowired
private  NaceService naceService;
	
	
	public NaceController(NaceService naceService){
		
		this.naceService = naceService;
	}

	
	
	@PostMapping("/createNace")
	public ResponseEntity<Nace> saveNace(@RequestBody final Nace nace) {
		try {
			
			System.out.println("Hi");
			return new ResponseEntity<Nace>(naceService.create(nace), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/nace")
	 public List<Nace> getAllNace(){
	  return naceService.getAllNace();
	}
	
	@GetMapping("/nace/{id}")
	 public Optional<Nace> getNaceById(@PathVariable ("id") Long id){
	  return naceService.getNaceDetailById(id);
	}
}
