package org.example;

import java.util.Scanner;

public class Eltiempodecocion {
    //Sabiendo que:
    //
    //Para cocinar 500 gramos de carne de vacuno, se necesita:
    //10 minutos si quieres una cocción casi cruda
    //17 minutos si quieres una cocción al punto
    //25 minutos si quieres una cocción bien hecha
    //Para cocinar 400 gramos de cordero se necesita:
    //15 minutos si quieres una cocción casi cruda
    //25 minutos si quieres una cocción al punto
    //40 minutos si quieres una cocción bien hecha
    //El tiempo de cocción es proporcional al peso.
    //Dependiendo de la información introducida por el usuario (tipo de carne, modo de cocción y peso), mostrar el tiempo de cocción de una carne en segundos.

    static Scanner sc = new Scanner(System.in);
    
    private static void tiempoCoccion(){
        int tipo;
        int modo;
        int resultado = 0;
        System.out.println("Tipo de carne: ");
        sc.nextLine();

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
