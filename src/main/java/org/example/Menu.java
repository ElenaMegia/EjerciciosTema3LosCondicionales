package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


import static org.example.Elnombredelmes.menuejercicio3;
import static org.example.Eltiempo.Ejercicio1;
import static org.example.Eltiempodecocion.Ejercicio4;

public class Menu {
    static Scanner keyboard = new Scanner(System.in);



    public static void switchOptions() throws InputMismatchException {
        boolean repeat=false;
        do {
            try {

                repeat=false;

                System.out.println("\nMenu:\n"
                        + "1º Tiempo.\n"
                        + "2º Nombre del mes.\n"
                        + "3º Tiempo de cocion.\n"
                        + "4º La nomina.\n"
                        + "0º Salir\n"
                        + "Porfavor escriba la opción deseada: ");

                int choice = keyboard.nextInt();
                if (choice <0||choice>4)
                    throw new OutofRangeException("Error. Tienes que introducir un número entre 0 y 4"); //Excepcion introducida para comprobar que los valores esten entre 0 y 5
                Menu(choice);
            } catch (OutofRangeException exc2) {
                System.out.println(exc2.getMessage());
                repeat=true;
            } catch (InputMismatchException exc3) {
                keyboard.nextLine();
                System.out.println("Error. Tienes que introducir un número."); //Excepcion introducida para comprobar que el valor introducido sea un numero, si no se volvera a pedir un valor
                repeat=true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }while(repeat);
    }

    public static void Menu(int option) throws IOException { //Metodo donde se llaman a las funciones elegidas en el menu

        switch (option) {
            case 1:
                Ejercicio1();
                switchOptions ();
                break;
            case 2:
                menuejercicio3();
                switchOptions ();
                break;
            case 3:
                Ejercicio4();
                switchOptions ();
                break;
            case 4:
                switchOptions ();
                break;

            case 0:
                exit(); //Salida del programa
                break;
        }
    }
    public static void exit() { //Metodo para salir del programa
        System.out.println("Gracias por usar nuestro programa. ¡Hasta pronto!");
    }
}