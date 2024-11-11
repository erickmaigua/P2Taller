package com.mycompany.p1taller1_maiguae1_roblese2;
public class P1Taller1_MaiguaE1_RoblesE2 {

    public static void main(String[] args) {
        
       Automovil auto = new Automovil(0, 0, "", "", 0);
       //Polimorfismo
       auto.IngresarDatos();
       auto.MostrarDatos();
       
       Barco barco = new Barco(0, 0, "", "", 0);
       //Polimorfismo
       barco.IngresarDatos();
       barco.MostrarDatos();
    }
}
