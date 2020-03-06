package com.jose.Rest.juego;




public class Juego {
	
	private int id;
	private String nombre;
	private float precio;
	private String tipo;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Juego [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
}
