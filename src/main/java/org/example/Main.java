package org.example;

import org.example.modelos.Herramienta;
import org.example.modelos.Samurai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Samurai samurai= new Samurai();
        Samurai samurai2 = new Samurai();
        Herramienta herramienta = new Herramienta("escopeta",95.5);




        Scanner entrada = new Scanner(System.in);
        System.out.print("digita el nombre del segundo samurai:");
        samurai2.nombres = entrada.nextLine();

        System.out.println("digite la edad del primer samurai:");
        samurai.setEdad(entrada.nextInt());
       




    }

}