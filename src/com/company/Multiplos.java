package com.company;

import java.util.List;

public class Multiplos {
    public static void mostrarMultiplo(List<Integer> listaNumeros, int multiplo){
        System.out.print("los multiplos de " + multiplo + " son: ");
        for(int i=0; i<listaNumeros.size(); i++){
            int numero = listaNumeros.get(i);
            int resto = numero%multiplo;
            if (resto==0){
                System.out.print(numero+" ");
            }
        }
    }
}
