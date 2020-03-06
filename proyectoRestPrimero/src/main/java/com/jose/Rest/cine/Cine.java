package com.jose.Rest.cine;

import java.util.List;



import com.jose.Rest.sala.Sala;


public class Cine {
	
	private String nombre;
	
	private String lugar;
	
	private List<Sala> salas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public List<Sala> getSalas() {
		return salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	@Override
	public String toString() {
		return "Cine [nombre=" + nombre + ", lugar=" + lugar + ", salas=" + salas + "]";
	}
	
	

}
