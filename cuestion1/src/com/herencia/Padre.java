package com.herencia;

public class Padre {
    public int edad;
    public String nombre;

    public Padre(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void andar(){
        System.out.println( nombre + " esta andando.");
    }

    public void trabajar(){
        System.out.println("Esta trabajando en el campo.");
    }

    public void beber(){
        System.out.println("Esta bebiendo agua");
    }

}
