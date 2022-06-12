package com.cuestion1.clases;

public class Hija extends Padre {
	
	private String CursoEscolar;
	private String ColorFavorito;
	
	
	public Hija(String nombre, String apellidos, int edad, String CursoEscolar, String ColorFavorito ) {
		super(nombre, apellidos, edad);
		this.CursoEscolar=CursoEscolar;
		this.ColorFavorito=ColorFavorito;

		
	}
	
	public void mostrarInfo() {
		System.out.println("Mi nombre es "+getNombre()+" y tengo "+getEdad()+". Estudio "+CursoEscolar+". ");
	}
	
	public static void Sobreescritura() {
		System.out.println("Soy la clase hija");
	}
	
	

}
