package com.grupo05.poo.problema02;

import java.util.Scanner;

public class pd_0101_01 {

    static double pulgadas = 39.37;
    static double pie = 3.28;

    static double conviertePulgadas(double metros){
        return metros*pulgadas;
    }

    static double conviertePies(double metros){
        return metros*pie;
    }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double medida, resultado;
        String escala, mensaje, simbolo;

        System.out.println("Introduce la medida en metros: ");
        String entrada = dato.nextLine();
        medida = Double.parseDouble(entrada);

        System.out.println("A que escala quiere convertir ? (Pies / Pulgadas)");
        escala = dato.nextLine().trim().toLowerCase();

        if(escala.equals("pies")){
            resultado = conviertePies(medida);
            mensaje = "medida en pies: " + resultado + "Pies";
        }else if(escala.equals("pulgadas")){
            resultado = conviertePulgadas(medida);
            mensaje = "medida en pulgadas: " + resultado + "Pulgadas";
        } else {
            resultado = -9999;
            mensaje = "Escala no valida";
        }

        System.out.println(mensaje);
    }
}
