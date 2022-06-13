package com.herencia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Padre padre = new Padre(42, "Pablo");
        Hija hija = new Hija(16, "Manola");

        // Se va a ejecutar en la clase hija por herencia

        padre.andar();
        hija.andar();

        // Se va a ejecutar diferente por sobreescritura

        padre.trabajar();
        hija.trabajar();

        // Sobrecarga en misma clase

        hija.trabajar();
        hija.trabajar(18);

        // Sobrecarga en difrentes clases

        padre.beber();
        hija.beber();
        hija.beber(5);

        // Almacenar datos en colecciones

        // Existen varios tipos de set: mas usados hashset y treeeset
        // Hashset
        HashSet set1 = new HashSet();
        set1.add("a");
        set1.add("b");
        set1.add("d");
        set1.add("c");
        // No se permiten valores duplicados
        set1.add("c");
        System.out.println("El tamaño del Hashset es de " + set1.size());
        System.out.println("Los elementos son: ");
        for (Object a: set1) {
            System.out.println(a.toString());
        }
        // No ofrece ningun mecanismo para eliminar elementos dentro del set
        //TreeSet
        TreeSet set2 = new TreeSet();
        set2.add("a");
        set2.add("b");
        set2.add("d");
        set2.add("c");
        // No se permiten valores duplicados
        set2.add("c");
        System.out.println("El tamaño del TreeSet es de " + set2.size());
        System.out.println("Los elementos son: ");
        for (Object b: set2) {
            System.out.println(b.toString());
        }
        // No ofrece ningun mecanismo para eliminar elementos dentro del set

        //List
        //ArrayList

        ArrayList array1 = new ArrayList();
        array1.add("a");
        array1.add("b");
        array1.add("d");
        array1.add("c");
        // Se permiten valores duplicados
        array1.add("c");
        System.out.println("El tamaño del ArrayList es de " + array1.size());
        System.out.println("Los elementos son: ");
        for (Object b: array1) {
            System.out.println(b.toString());
        }
        // Se permite borrar un valor
        array1.remove(4);
        for (Object b: array1) {
            System.out.println(b.toString());
        }
        // Vaciar array
        array1.clear();



    }
}
