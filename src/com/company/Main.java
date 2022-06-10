package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //resolverEjercicioPromedio();
        //resolverEjercicioNumeroPositivo();
        resolverAreaCuadrado();
        resolverPerimetroCuadrado();
    }

    public static void resolverPerimetroCuadrado(){
        int lado= -4;
        int perimetro = Cuadrado.calcularPerimetro(lado);
        System.out.println("El perimetro es: " + perimetro);

    }

    public static void resolverAreaCuadrado(){
        int lado = -8;
        int area = Cuadrado.calcularArea(lado);
        System.out.println("El area es: " + area);
    }

    public static void resolverEjercicioNumeroPositivo() {
        // Datos de entrada
        int numero = -6;
        // Llamas a tu funcion
        boolean positivo = Positivo.esPositivo(numero);
        // Mostras por pantalla el resultado de tu funcion
        if (positivo==true){
            System.out.println("El resultado es positivo");
        }
        else {
            System.out.println("El resultado es negativo");
        }

    }

    public static void resolverEjercicioPromedio() {
        // Datos de entrada
        List<Double> listadoDeNotas = new ArrayList<>();
        listadoDeNotas.add(7D);
        listadoDeNotas.add(8.5D);
        listadoDeNotas.add(9D);

        // Llamas a tu funcion
        Double promedio = Promedio.calcular(listadoDeNotas);

        // Mostras por pantalla el resultado de tu funcion
        System.out.println("el promedio es: "+ promedio);
    }

}



/*
String contrasenaCorrecta = "12345";
        String contrasena = "exit";
        int intentos = 0;


        while (!"exit".equalsIgnoreCase(contrasena) && !contrasenaCorrecta.equalsIgnoreCase(contrasena) && intentos < 3) {
            System.out.println("Ingrese contraseña o exit para salir");
            Scanner teclado = new Scanner(System.in);
            contrasena = teclado.nextLine();
            intentos++;
        }



        for (int i = 0; i < 3; i++) {
        System.out.println("Ingrese contraseña o exit para salir");
        Scanner teclado = new Scanner(System.in);
        contrasena = teclado.nextLine();

        if (contrasena.equalsIgnoreCase(contrasenaCorrecta) || contrasena.equalsIgnoreCase("exit")) {
        break;
        }
        }
 */