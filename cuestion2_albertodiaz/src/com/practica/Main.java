package com.practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int posicion=0, acierto=1 ;
	    float fallo=0.5f, puntuacion = 0f;
	    String pregunta ,respuesta, mirespuesta;
	        
	    ArrayList<String> preguntasRespuestas = new ArrayList<>();
	    ArrayList<Integer> random = new ArrayList<>();
	        
	    try {
	            
	        Scanner sc = new Scanner(Main.class.getResourceAsStream("Preguntas.txt"));
	        Scanner lc = new Scanner(System.in);
	        while (sc.hasNext()){
	                
	            preguntasRespuestas.add(sc.nextLine());
	                
	            if(posicion%2 == 0)
	            	random.add(posicion);  
	                posicion++;
	        }

	        Collections.shuffle(random);

	        Iterator <Integer> preguntasRandom = random.iterator();
	            
	        while(preguntasRandom.hasNext()){
	   
	            posicion=preguntasRandom.next();
	            pregunta = preguntasRespuestas.get(posicion);
	            respuesta = preguntasRespuestas.get(posicion + 1);
	            System.out.println(pregunta);
	            mirespuesta = lc.nextLine();
	                
	            if(mirespuesta.equalsIgnoreCase(respuesta)){
	                System.out.println("¡Correcto! +"+acierto+"\n");
	                puntuacion += acierto;
	            }else{
	                System.out.println("¡Casi! -"+fallo+"\n");
	                puntuacion -= fallo;
	            }
	        }
	            
	        System.out.println("Puntos:"+puntuacion);
	            
	        if(puntuacion >= 5)
	            System.out.println("Felicidades. Has aprobado el cuestionario");
	        else
	            System.out.println("Has suspendido.¡Más suerte la próxima vez!");
	        sc.close();
	        lc.close();
	            
	    } catch (NullPointerException ne) {
	        System.out.println("No se ha insertado el archivo de preguntas");
	    }catch (Exception e){
	        System.out.println(e);
	    	}
	        
	        

	        
	    }  
	
}
