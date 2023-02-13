package org.example;

import java.util.Scanner;

public class Eltiempo {

    static Scanner sc = new Scanner(System.in);

    public static void Ejercicio1() {
        System.out.println("Introduce la temperatura: ");
        int temperatura = sc.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        } else {
            System.out.println("No hay riesgo de hielo");
        }

        sc.close();
    }


}
