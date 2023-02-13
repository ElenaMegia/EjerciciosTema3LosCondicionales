package org.example;

import java.util.Scanner;

public class Eltiempodecocion {

    static Scanner sc = new Scanner(System.in);
    
    public static void Ejercicio4(){
        int tipo;
        int modo;
        int resultado = 0;
        System.out.println("Tipo de carne: ");
        System.out.println("1. Vacuno \n2. Cordero ");
        tipo = sc.nextInt();

        System.out.println("Modo de cocción: ");
        System.out.println("1. Casi crudo \n2. Al punto\n3. Bien hecho");
        modo = sc.nextInt();

        System.out.print("Introduzca el peso en gramos: ");
        int peso = sc.nextInt();

        if(tipo == 1){
            switch (modo){
                case 1:
                    resultado = peso*10*60/500;
                    break;
                case 2:
                    resultado = peso*17*60/500;
                    break;
                case 3:
                    resultado = peso*25*60/500;
                    break;
                default:
                    System.out.println("El modo introducido no es correcto");
            }
            System.out.println("El tiempo de cocción es: " + resultado + " segundos.") ;
        }
        else if (tipo == 2){
            switch (modo){
                case 1:
                    resultado = peso*15*60/400;
                    break;
                case 2:
                    resultado = peso*25*60/400;
                    break;
                case 3:
                    resultado = peso*40*60/400;
                    break;
                default:
                    System.out.println("El modo introducido no es correcto");
            }
            System.out.println("El tiempo de cocción es: " + resultado + " segundos.") ;
        }
        else{
            System.out.println("El tipo de carne introducido no es correcto.");
        }
    }

}
