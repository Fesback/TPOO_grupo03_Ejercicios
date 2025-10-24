package com.grupo05.poo.problema01;

public class pd_0101_00 {
    public static void main(String[] args) {

        // hola mundo
        System.out.println("--------------------------");
        System.out.println("Hola mundo :p");
        System.out.println("--------------------------");

        //declaracion
        int numero = 7;
        int diaSemana = 3;
        int contador = 0;

        //---------------------------------------------------

        // if - else
        System.out.println("\n --- uso de if - else ---");
        if(numero > 10){
            System.out.println("El numero " + numero + " es mayor a 10");
        } else if(numero == 10){
            System.out.println("El numero " + numero + " es exactament 10");
        } else{
            System.out.println("El numero " + numero + " es menor a 10");
        }

        System.out.println("------------------------------------");

        //---------------------------------------------------

        System.out.println("\n--- uso de switch ---");
        switch (diaSemana) {
            case 1:
                System.out.println("hoy es lunes");
                break;

            case 2:
                System.out.println("hoy es martes");
                break;

            case 3:
                System.out.println("Hoy es miercoles");
                break;

            case 4:
            case 5:
                System.out.println("Hoy es dia laborable");
                break;
            default:
                System.out.println("Es fin de semana o valor invalido");
                break;
        }

        System.out.println("------------------------------");

        //---------------------------------------------------

        System.out.println("\n--- uso de while ---");
        while(contador < 3) {
            System.out.println("While: Iteración " + (contador + 1));
            contador++;
        }
        System.out.println("El bucle 'while' ha terminado.");

        System.out.println("-------------------------------");

        //---------------------------------------------------
        System.out.println("\n--- 5. Uso de do - while ---");
        int otroContador = 0;
        do {
            System.out.println("Do-While: Iteración " + (otroContador + 1));
            otroContador++;
        } while (otroContador < 2);
        System.out.println("El bucle 'do-while' ha terminado.");

        System.out.println("------------------------------");
    }
}
