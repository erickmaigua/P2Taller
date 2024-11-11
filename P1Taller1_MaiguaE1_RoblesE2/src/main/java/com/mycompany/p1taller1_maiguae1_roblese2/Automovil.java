package com.mycompany.p1taller1_maiguae1_roblese2;
import java.util.Scanner;
public class Automovil extends Vehiculos{ //Herencia 
    //encapsulamiento
    private int numPuertas;
    private int numAsientos;    
    Scanner scanner = new Scanner(System.in);
    //Constructor
    public Automovil(int numPuertas, int numAsientos, String marca, String color, int tamanio) {
        super(marca, color, tamanio);
        this.numPuertas = numPuertas;
        this.numAsientos = numAsientos;
    }
    

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
       
        while(numPuertas < 0){
            System.out.println("Error vuelva a ingrese el numero de puertas");
            numPuertas = scanner.nextInt();
        }
        this.numPuertas = numPuertas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        while(numAsientos < 0){
            System.out.println("Error vuelva a ingrese el numero de asientos");
            numAsientos = scanner.nextInt();
        }
        this.numAsientos = numAsientos;
    }
    public void DatosAutomovil(){
        System.out.println("Ingrese el numero de asientos");
        setNumAsientos(scanner.nextInt());
        System.out.println("Ingresa el numero de puertas");
        setNumPuertas(scanner.nextInt());
    }
    //
    @Override
    public void IngresarDatos() {
        System.out.println("Ingrese la marca del vehiculo");
        super.setMarca(scanner.nextLine());
        System.out.println("Ingrese el color del vehiculo");
        super.setColor(scanner.nextLine());
        System.out.println("Ingrese el tamaño del vehiculo");
        super.setTamanio(scanner.nextInt());
        DatosAutomovil();
    }
    
    @Override
    public void MostrarDatos() {
       System.out.println("La marca del vehiculo es " + super.getMarca());
       System.out.println("El color del vehiculo es " + super.getColor());
       System.out.println("El tamaño del vehiculo es " + super.getTamanio());
       System.out.println("El numero de asientos del vehiculo es " + getNumAsientos());
       System.out.println("El numero de puertas del vehiculo es " + getNumAsientos());
    }

}
