package com.principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;




public class Preguntas {

	public static void main(String[] args) throws Exception {
       
        List<String> listapreguntas = new ArrayList<String>();

       
        BufferedReader r = new BufferedReader(new FileReader("Preguntas.txt"));

       
        for (String texto = r.readLine(); texto != null; texto = r.readLine()) {
        	listapreguntas.add(texto);
        }
        r.close();
        
        Scanner sc = new Scanner(System.in);

        
        Random random = new Random();

       
        for (int i = 0; i < 10; i++) {
            System.out.println( listapreguntas.get(random.nextInt(listapreguntas.size() - 1)));
            String resp = sc.nextLine();
        }
        sc.close();
        System.out.println("Has terminado");
    }

}
		       


			   
			


