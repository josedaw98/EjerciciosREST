package com.jose.Rest.cine;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jose.Rest.sala.Sala;



@RestController
public class RutasCine {

	
	@GetMapping("/cine")
	public ResponseEntity<Cine> unCine(){
		
		Cine cine = new Cine();
		cine.setNombre("los prados");
		cine.setLugar("teatinos");
		
		Sala sala1 = new Sala();
		sala1.setNumero(1);
		sala1.setCapacidad(32);
		
		Sala sala2 = new Sala();
		sala2.setNumero(1);
		sala2.setCapacidad(32);
		
		cine.getSalas().add(sala1);
		cine.getSalas().add(sala2);            
		
		
		
		return new ResponseEntity<Cine>(cine, HttpStatus.OK);
		
	}
	
	
	@PostMapping("/addCine")
	public ResponseEntity<Cine> AddCine(@RequestBody Cine cine){
		
		System.out.println(cine);
		
		 		
		return new ResponseEntity<Cine>(cine, HttpStatus.I_AM_A_TEAPOT);

		
	}
}
