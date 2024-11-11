package com.mycompany.p1taller1_maiguae1_roblese2;
//Creaccion de la clase abstracta 

import java.util.Scanner;

public  abstract class Vehiculos {
    
    //encapsulamiento
    private String marca;
    private String color;
    private int tamanio;
    Scanner scanner = new Scanner(System.in);
     //Constructor
    public Vehiculos(String marca, String color, int tamanio) {
        this.marca = marca;
        this.color = color;
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        while (tamanio < 0 ){
            System.out.println("Erro el tamaño no puede ser negativo");
            tamanio = scanner.nextInt();
        }
        this.tamanio = tamanio;
    }
 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    //Metodos abstractos 
    public abstract void IngresarDatos();
    public abstract void MostrarDatos();
}
