package com.teoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File myFile = new File("");
        // call the getAbsolutePath() method
        String absolutePath = myFile.getAbsolutePath();
        System.out.println("The Absolute path of the file is: " + absolutePath);

        File doc = new File(absolutePath + "/src/main/java/com/teoria/preguntas.txt");
        //File doc = new File("/target/classes/com/teoria/preguntas.txt");
        Scanner obj = new Scanner(doc);

        File doc2 = new File(absolutePath + "/src/main/java/com/teoria/respuestas.txt");
        //File doc = new File("/target/classes/com/teoria/respuestas.txt");
        Scanner obj2 = new Scanner(doc2);
        double puntos = 0;
        String respuesta, rverdadera;
        //Scanner sc = new Scanner(System.in);
        while (obj.hasNextLine()) {
            System.out.println(obj.nextLine());
            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextLine();
            rverdadera = obj2.nextLine();
            if (respuesta.equals(rverdadera)) {
                System.out.println("Has acertado, llevas un total de " + ++puntos);
            } else {
                System.out.println("Has fallado. La respuesta era: " + rverdadera);
                puntos -= 0.5;
            }
        }
        System.out.println("Fin del test.");
        System.out.println("Puntuacion total de " + puntos + " puntos.");
        if (puntos >= 5 ){
            System.out.println("Has aprobado.");
        }else{
            System.out.println("Has suspendido.");
        }
    }}

