package com.jose.Rest.sala;




public class Sala {

	private Integer numero;
	private Integer capacidad;
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	@Override
	public String toString() {
		return "Sala [numero=" + numero + ", capacidad=" + capacidad + "]";
	}
	
	
	
	
}
