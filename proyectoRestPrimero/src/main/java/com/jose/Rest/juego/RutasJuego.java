package com.jose.Rest.juego;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RutasJuego {

	
	@GetMapping("/juego")
	public ResponseEntity<Juego> UnJuego(){
		
		Juego juego = new Juego();
		juego.setNombre("league of legends");
		juego.setPrecio(0);
		juego.setTipo("rol");
		
		return new ResponseEntity<>(juego , HttpStatus.OK);
		
	}
	
	@PostMapping("/addJuego")
	public ResponseEntity<Juego> AddJuego(@RequestBody Juego juego){
		
		return new ResponseEntity<>(juego , HttpStatus.OK);
	}
	
	@PutMapping("/UpdateJuego/{id}")
	public void updateJuego(@RequestBody Juego juego, @PathVariable int id){
		
		
		System.out.println(juego);
		System.out.println(id);
		
		//me aseguro de guardar el id
		//juego.setId(id);
		//guardo
		//juegoDAO.save(juego);
		
	}
	
	@PutMapping("/DeleteJuego/{id}")
	public void deleteJuego(@RequestBody Juego juego, @PathVariable int id){
		
		
		System.out.println("borrar juego ("+id+")");
		
		
		//me aseguro de guardar el id
		//juego.setId(id);
		//guardo
		//juegoDAO.save(juego);
		
	}
	
}
