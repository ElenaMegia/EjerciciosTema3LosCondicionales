package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Elnombredelmes {
    //Escriba el nombre del mes completo en función de su número (introducido por el usuario).
    static Scanner sc = new Scanner(System.in);
public static void Ejercicio3() {
    int opcion = 0;

    do {
        try {
            int mes = sc.nextInt();
            menuejercicio3();
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Mes no válido");
                break;
             }
        } catch (InputMismatchException e) {
                System.out.println("Introduzca una de las opciones señaladas.");
                  sc.nextLine();
                }
    } while (opcion != 12);
}

    public static void menuejercicio3() {
        System.out.println("1. Enero");
        System.out.println("2. Febrero");
        System.out.println("3. Marzo");
        System.out.println("4. Abril");
        System.out.println("5. Mayo");
        System.out.println("6. Junio");
        System.out.println("7. Julio");
        System.out.println("8. Agosto");
        System.out.println("9. Septiembre");
        System.out.println("10. Octubre");
        System.out.println("11. Noviembre");
        System.out.println("12. Diciembre");
        System.out.println("13. Salir");
    }
}
