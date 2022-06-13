package com.herencia;

public class Hija extends Padre{

    public Hija(int edad, String nombre) {
        super(edad, nombre);
    }
    // Overwrite
    public void trabajar(){
        System.out.println("Los hijos no pueden trabajar.");
    }

    //Override (en una misma clase)

    public void trabajar(int edadmin){
        System.out.println("Los hijos no pueden trabajar, hasta que cumplan los " + edadmin);
    }

    //Override (en diferentes clases)
    public void beber(int litros){
        System.out.println("Esta bebiendo " + litros + "l de agua.");
    }
}
