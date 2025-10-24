package com.grupo05.poo.problema03;

public class ClaseFoco {

    public static void main(String[] args){
        Foco f = new Foco(); //creacion del objeto

        System.out.println("Estado del foco: " + f.imprimeEstado());
        f.setEstado(true);
        System.out.println("Estado del foco: " + f.imprimeEstado());
        f.muestrraDatos();
        f.actualizarFoco(105, "phillips", 12, true );
    }
}
