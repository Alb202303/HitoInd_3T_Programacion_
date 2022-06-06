package com.principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Respuestas {
	
	public static void main(String[] args) {
      
        String resp1 = "madrid";
        String resp2 = "paris";
        String resp3 = "londres";
        String resp4 = "berlin";
        String resp5 = "bogota";
        String resp6 = "caracas";
        String resp7 = "washington";
        String resp8 = "rio de janeiro";
        String resp9 = "buenos aires";
        String resp10 = "moscu";


        BufferedReader reader;

       
        Scanner sc = new Scanner(System.in);


        try
        {
            reader = new BufferedReader(new FileReader("Preguntas.txt"));
            String line = reader.readLine();

            
                while (line != null)
                {
                    System.out.println(line);
                    line = reader.readLine();
                    String resp = sc.nextLine();
                }
                reader.close();
            System.out.println("Se acabó el juego");
            } catch (IOException e) {
            	
               System.out.println("Error");
            }
    }

}
