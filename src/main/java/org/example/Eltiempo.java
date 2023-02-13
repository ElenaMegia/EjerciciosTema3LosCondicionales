package org.example;

import java.util.Scanner;

public class Eltiempo {

    static Scanner sc = new Scanner(System.in);

    public static void Ejercicio1() {

        System.out.println("Introduce la temperatura: ");
        int temperatura = sc.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        } else if (temperatura >= 2 && temperatura < 15) {
            System.out.println("Hace frío");
        } else if (temperatura >= 15 && temperatura < 30) {
            System.out.println("Buena temperatura");
        } else if (temperatura >= 30) {
            System.out.println("Demasiado calor");
        }
    }

}
