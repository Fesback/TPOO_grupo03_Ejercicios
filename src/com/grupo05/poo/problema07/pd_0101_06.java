package com.grupo05.poo.problema07;

import java.util.Scanner;

public class pd_0101_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double parcial1, parcial2, parcial3;
        double examen1, examen2;
        double trabajoFinal;


        double promedioParciales;
        double promedioExamenes;
        double promedioFinal;

        System.out.println("=== CÁLCULO DEL PROMEDIO FINAL ===");

        System.out.print("Ingrese la calificación del parcial 1: ");
        parcial1 = sc.nextDouble();

        System.out.print("Ingrese la calificación del parcial 2: ");
        parcial2 = sc.nextDouble();

        System.out.print("Ingrese la calificación del parcial 3: ");
        parcial3 = sc.nextDouble();


        System.out.print("Ingrese la calificación del examen 1: ");
        examen1 = sc.nextDouble();

        System.out.print("Ingrese la calificación del examen 2: ");
        examen2 = sc.nextDouble();


        System.out.print("Ingrese la calificación del trabajo final: ");
        trabajoFinal = sc.nextDouble();

        promedioParciales = (parcial1 + parcial2 + parcial3) / 3.0;
        promedioExamenes = (examen1 + examen2) / 2.0;

        promedioFinal = (promedioParciales * 0.55) +
                (promedioExamenes * 0.30) +
                (trabajoFinal * 0.15);

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Promedio de parciales: " + String.format("%.2f", promedioParciales));
        System.out.println("Promedio de examen: " + String.format("%.2f", promedioExamenes));
        System.out.println("Trabajo final: " + String.format("%.2f", trabajoFinal));
        System.out.println("\nPromedio final de la materia: " + String.format("%.2f", promedioFinal));

        sc.close();
    }
}