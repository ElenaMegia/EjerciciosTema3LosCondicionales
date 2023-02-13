package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);

    //Crear metodo principal


    public void ejercicios() {
        int opcion = 0;

        do {
            try {
                menu();
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        Eltiempo ejercicio1 = new Eltiempo();
                        ejercicio1.Ejercicio1();
                        break;
                    case 2:
                        Eltiempo2 ejercicio2 = new Eltiempo2();
                        ejercicio2.Ejercicio2();
                        break;
                    case 3:

                        Elnombredelmes ejercicio3 = new Elnombredelmes();
                        ejercicio3.Ejercicio3();
                        break;
                    case 4:
                        Ejercicio4 ejercicio4 = new Ejercicio4();
                        ejercicio4.Ejercicio4metodo();
                        break;
                    case 5:
                        System.out.println("Gracias.");
                        break;
                    default:
                        System.out.println("Intente otra vez.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduzca una de las opciones señaladas.");
                teclado.nextLine();
            }
        } while (opcion != 5);

    }

    private void menu() {
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1 - Ejercicio1");
        System.out.println("2 - Ejercicio2");
        System.out.println("3 - Ejercicio3");
        System.out.println("4 - Ejercicio4");
        System.out.println("5 - Salir");
    }
}