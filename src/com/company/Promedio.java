package com.company;

import java.util.List;

public class Promedio {

    /**
     * Devolvemos el promedio de notas de una lista
     * @param listadoDeNotas
     * @return
     */
    public static Double calcular(List<Double> listadoDeNotas) {
        double acumulador = 0;
        for (Double nota : listadoDeNotas) {
            acumulador = nota + acumulador;

        }
        Double promedio;
        promedio = acumulador/listadoDeNotas.size();
        return promedio;
    }
}
