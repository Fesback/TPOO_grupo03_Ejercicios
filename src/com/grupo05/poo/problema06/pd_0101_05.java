package com.grupo05.poo.problema06;

import java.util.Random;
import java.util.Scanner;

public class pd_0101_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int filas;
        int columnas;

        System.out.println("=== PROCESAMIENTO DE MATRIZ ===");

        do {
            System.out.print("Ingrese el número de filas (2 - 10): ");
            while (!sc.hasNextInt()) {
                System.out.println("❌ Valor inválido. Debe ser un número entero.");
                System.out.print("Ingrese el número de filas (2 - 10): ");
                sc.next();
            }
            filas = sc.nextInt();

            if (filas < 2 || filas > 10) {
                System.out.println("❌ Valor inválido. Debe estar entre 2 y 10.");
            }
        } while (filas < 2 || filas > 10);

        do {
            System.out.print("Ingrese el número de columnas (2 - 10): ");
            // Aseguramos que se ingrese un entero
            while (!sc.hasNextInt()) {
                System.out.println("❌ Valor inválido. Debe ser un número entero.");
                System.out.print("Ingrese el número de columnas (2 - 10): ");
                sc.next();
            }
            columnas = sc.nextInt();

            if (columnas < 2 || columnas > 10) {
                System.out.println("❌ Valor inválido. Debe estar entre 2 y 10.");
            }
        } while (columnas < 2 || columnas > 10);

        int[][] matriz = new int[filas][columnas];

        int maximo = -1;
        int maxFila = -1;
        int maxColumna = -1;

        System.out.println("\n=== MATRIZ GENERADA ===");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = rand.nextInt(41) + 10;


                System.out.printf("%4d", matriz[i][j]);


                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];

                    maxFila = i + 1;
                    maxColumna = j + 1;
                }
            }
            System.out.println();
        }


        System.out.println("\n=== RESULTADO ===");
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("Se encuentra en la posición: fila " + maxFila + ", columna " + maxColumna);

        sc.close();
    }
}