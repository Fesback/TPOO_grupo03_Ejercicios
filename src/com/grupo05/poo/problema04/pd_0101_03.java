package com.grupo05.poo.problema04;

import java.util.Scanner;

public class pd_0101_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double monto, impuesto, totalPagar;

        System.out.println("=== Calculo de Impuesto ===");

        System.out.print("Ingrese monto en soles: ");
        monto = sc.nextDouble();

        if (monto > 100) {
            impuesto = monto * 0.20;
        } else {
            impuesto = monto * 0.15;
        }

        totalPagar = monto + impuesto;

        System.out.print("=== Detalle del Pago ===");
        System.out.printf("Monto ingresado: S/ %.2f%n", monto);
        System.out.printf("Impuesto aplicado: S/ %.2f%n", impuesto);
        System.out.printf("Total a pagar: S/ %.2f%n", totalPagar);
    }

}
