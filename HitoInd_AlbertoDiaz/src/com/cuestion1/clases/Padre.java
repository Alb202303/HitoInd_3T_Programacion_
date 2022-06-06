package com.cuestion1.clases;

public class Padre {
	private String nombre;
	private String apellidos;
	private int edad;
	public Padre(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static void Sobreescritura() {
		System.out.println("Soy la clase padre");
	}
	
	public void Correr() {
		System.out.println("Soy"+getNombre()+" y estoy corriendo");
	}
	
	public void Correr(int km) {
		System.out.println("He corrido "+km+" km.");
	}
	
	
}
