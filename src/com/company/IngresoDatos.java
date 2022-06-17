package com.company;

import java.util.Scanner;

public class IngresoDatos {
    public static void ingresarDatos (){
        String dato="";
        while (!dato.equalsIgnoreCase("cancelar")){
            System.out.println("Ingresar un dato:");
            Scanner sc = new Scanner(System.in);
            dato = sc.nextLine();
            System.out.println("El dato ingresado fue: " + dato);

        }
        System.out.println("Programa finalizado");



    }
}
