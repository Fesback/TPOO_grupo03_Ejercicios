package com.grupo05.poo.problema05;

import java.util.Scanner;

public class pd_0101_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int contador = 0;
        int n;
        int numero = 2;

        System.out.println("=== Numeros Primos ===");
        System.out.print("Ingrese la cantidad de numeros primos que desea mostrar: ");

        n = sc.nextInt();

        System.out.println("\n Los primeros " + n + "numeros primos son: ");

        while(contador<n){
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }

            numero++;
        }

        System.out.println();

        sc.close();
    }


    public static boolean esPrimo(int num) {
        if (num < 2) return false;


        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
