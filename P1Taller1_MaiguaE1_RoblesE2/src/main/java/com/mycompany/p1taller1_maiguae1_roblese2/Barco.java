package com.mycompany.p1taller1_maiguae1_roblese2;

public class Barco extends Vehiculos{
     //encapsulamiento
    private int numTripulantes;
    private int numCamarotes;
 //Constructor
    public Barco(int numTripulantes, int numCamarotes, String marca, String color, int tamanio) {
        super(marca, color, tamanio);
        this.numTripulantes = numTripulantes;
        this.numCamarotes = numCamarotes;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public void setNumTripulantes(int numTripulantes) {
        while (numTripulantes < 0){
            System.out.println("El numero de tripulantes no puede ser menor a 0, vuelva a ingresar nuevamente");
            numTripulantes = scanner.nextInt(); 
        }
        this.numTripulantes = numTripulantes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        while (numCamarotes < 0 ){
            System.out.println("El numero de camarotes no puede ser mayor a 0, vuelva a ingresar nuevamente");
            numCamarotes = scanner.nextInt();
        }
        
        this.numCamarotes = numCamarotes;
    }
    
    public void DatosBarco(){
        System.out.println("Ingrese el numero de camarotes");
        setNumCamarotes(scanner.nextInt());
        System.out.println("Ingresa el numero de tripulantes maximo");
        setNumTripulantes(scanner.nextInt());
    }
    @Override
    public void IngresarDatos() {
        System.out.println("Ingrese la marca del barco");
        super.setMarca(scanner.nextLine());
        System.out.println("Ingrese el color del barco");
        super.setColor(scanner.nextLine());
        System.out.println("Ingrese el tamaño del barco");
        super.setTamanio(scanner.nextInt());
        DatosBarco();
    }
    
    @Override
    public void MostrarDatos() {
       System.out.println("La marca del barco es " + super.getMarca());
       System.out.println("El color del barco es " + super.getColor());
       System.out.println("El tamaño del barco es " + super.getTamanio());
       System.out.println("El numero de camarotes del barco es " + getNumCamarotes());
       System.out.println("El numero de tripulantes maximos del barco es " + getNumTripulantes());
    }
    
}
