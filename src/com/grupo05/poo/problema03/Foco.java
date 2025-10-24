package com.grupo05.poo.problema03;

public class Foco {
    private int id;
    private String marca;
    private double consumo;
    private boolean estado;

    // Constructor vacio
    public Foco(){

    }

    // Constructor
    public void actualizarFoco(int id, String marca, double consumo, boolean estado) {
        this.id = id;
        this.marca = marca;
        this.consumo = consumo;
        this.estado = estado;
    }

    public Foco(boolean estado, int id) {
        this.estado = estado;
        this.id = id;
    }

    public Foco(int id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    //Funcion
    public String imprimeEstado(){
        String estado = "";
        if (this.estado){
            estado = "Encendido";
        } else {
            estado = "Apagado";
        }
        return estado;
    };

    public void muestrraDatos(){
        System.out.println("\n------------------------");
        System.out.println("ID      : " + this.id);
        System.out.println("Marca   : " + this.marca);
        System.out.println("Consumo : " + this.consumo + " watts");
        String estado;
        if (this.estado) {
            estado ="Encendido";
        } else {
            estado = "Apagado";
        }
        System.out.println("Estado    : " + this.estado);
        System.out.println("\n------------------------");
    }

    // Getters and Setters

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

