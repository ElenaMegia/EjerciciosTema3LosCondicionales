package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Elnombredelmes {
    //Escriba el nombre del mes completo en función de su número (introducido por el usuario).
    static Scanner sc = new Scanner(System.in);

    public static void Ejercicio3(int choice) {
        int opcion = 0;
        boolean repetir = false;
        do {
            try {
                repetir = false;

                switch (choice) {
                    case 1:
                        System.out.println("Enero");
                        menuejercicio3();
                        break;
                    case 2:
                        System.out.println("Febrero");
                        menuejercicio3();
                        break;
                    case 3:
                        System.out.println("Marzo");
                        menuejercicio3();
                        break;
                    case 4:
                        System.out.println("Abril");
                        menuejercicio3();
                        break;
                    case 5:
                        System.out.println("Mayo");
                        menuejercicio3();
                        break;
                    case 6:
                        System.out.println("Junio");
                        menuejercicio3();
                        break;
                    case 7:
                        System.out.println("Julio");
                        menuejercicio3();
                        break;
                    case 8:
                        System.out.println("Agosto");
                        menuejercicio3();
                        break;
                    case 9:
                        System.out.println("Septiembre");
                        menuejercicio3();
                        break;
                    case 10:
                        System.out.println("Octubre");
                        menuejercicio3();
                        break;
                    case 11:
                        System.out.println("Noviembre");
                        menuejercicio3();
                        break;
                    case 12:
                        System.out.println("Diciembre");
                        menuejercicio3();
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
        boolean repeat = false;
        do {
            try { //MENU PRINCIPAL
                repeat = false;
                System.out.println("1. Enero\n"
                        + "2. Febrero\n"
                        + "3. Marzo\n"
                        + "4. Abril\n"
                        + "5. Mayo\n"
                        + "6. Junio\n"
                        + "7. Julio\n"
                        + "8. Agosto\n"
                        + "9. Septiembre\n"
                        + "10. Octubre\n"
                        + "11. Noviembre\n"
                        + "12. Diciembre\n"
                        + "13. Salir\n"
                        + "Introduzca el número del mes: ");
                int choice = sc.nextInt();
                if (choice < 1 || choice > 7)
                    throw new OutofRangeException("Error. Tienes que introducir un número entre 1 y 7"); //Excepcion introducida para comprobar que los valores esten entre 0 y 5
                Ejercicio3(choice);
            } catch (OutofRangeException exc2) {
                System.out.println(exc2.getMessage());
                repeat = true;
            } catch (InputMismatchException exc3) {
                sc.nextLine();
                System.out.println("Error. Tienes que introducir un número."); //Excepcion introducida para comprobar que el valor introducido sea un numero, si no se volvera a pedir un valor
                repeat = true;
            }
        } while (repeat);
    }
}
