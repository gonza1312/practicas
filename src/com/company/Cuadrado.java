package com.company;

import java.sql.SQLOutput;

public class Cuadrado {
    private static boolean validarLado(int lado){
        return lado>0;
    }

    private static void mostrarMensajeIncorrecto(){
        System.out.println("Ingrese un numero positivo");
    }
    public static int calcularArea(int lado){

        if (validarLado(lado)){
            int area;
            area = lado*lado;
            return area;
        }
        mostrarMensajeIncorrecto();
        return 0;

    }
    public static int calcularPerimetro(int lado){
        if (validarLado(lado)){
            return lado*4;
        }
        mostrarMensajeIncorrecto();
        return 0;

    }
}
