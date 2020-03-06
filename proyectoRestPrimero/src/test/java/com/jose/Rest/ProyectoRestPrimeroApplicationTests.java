package com.jose.Rest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.jose.Rest.juego.Juego;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ProyectoRestPrimeroApplicationTests {

	@Test
	void pruebaGET() throws URISyntaxException {
		
		URI getUrl = new URI("http://localhost:9090/juego");
		RequestEntity<Juego> request =  new RequestEntity<Juego>(HttpMethod.GET,getUrl);
		
		
		ResponseEntity<Juego> response;
		
		RestTemplate ejecutor = new RestTemplate();
		response = ejecutor.exchange(request, Juego.class);
		
		System.out.println(response.getBody());
		System.out.println(response.hasBody());
		
		assertTrue(response.hasBody());
		
	}
	
	@Test
	void PruebaPost() throws URISyntaxException {

		Juego juego = new Juego();
		juego.setNombre("league of legends");
		juego.setPrecio(0);
		juego.setTipo("rol");
		
		URI postUrl = new URI("http://localhost:9090/addJuego");
		RequestEntity<Juego> request =  new RequestEntity<Juego>(juego,HttpMethod.POST,postUrl);
		
		
		ResponseEntity<Juego> response;
		
		RestTemplate restTemplate = new RestTemplate();
		response = restTemplate.exchange(request, Juego.class);
		
		System.out.println(response.getBody());
		System.out.println(response.hasBody());
		
		assertTrue(response.hasBody());
		assertTrue(request.hasBody());
	}

}
