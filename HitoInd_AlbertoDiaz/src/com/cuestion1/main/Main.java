 package com.cuestion1.main;

import com.cuestion1.clases.Hija;
import com.cuestion1.clases.Padre;


public class Main {

	public static void main(String[] args) {
		
		//Herencia
		System.out.println("HERENCIA");

		Hija hija=new Hija("Natalia", "Díaz", 18, "2ºBachillerato", "Rosa" );
		
		hija.mostrarInfo();
		
		//Sobreescritura
		
		System.out.println("SOBREESCRITURA");
		Padre.Sobreescritura();
		Hija.Sobreescritura();
		
		//Sobrecarga
		System.out.println("SOBRECARGA");

		Padre padre1=new Padre("Fernando", "Rojas", 32);
		padre1.Correr();
		padre1.Correr(3);
		
		
	}

}
