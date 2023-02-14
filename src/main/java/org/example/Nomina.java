package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nomina {

    static Scanner sc = new Scanner(System.in);

    public static void Ejercicio5() {
        double bruto;
        int horas60 = 0;
        int horas50 = 0;
        String estado;
        int puesto = 0;
        System.out.print("Porfavor introduzca el apellido de la persona: ");
        String apellido = sc.nextLine();

        System.out.print("Porfavor introduzca el nombre de la persona: ");
        String nombre = sc.nextLine();
        do {
            try {
                System.out.println("Puesto: \n1. Agente de servicio.\n2. Empleado de oficina.\n3. Directivo");
                puesto = sc.nextInt();
                sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("La opción introducida no es correcta");
            }
            if (puesto == 1){
                estado = "Agente de servicio";
            }else if (puesto == 2){
                estado = "Empleado de oficina";
            }else {
                estado = "Directivo";
            }
        }while (puesto != 1 && puesto !=2 && puesto != 3);
        System.out.print("Número de horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.print("Tarifa horaria: ");
        double tarifa = sc.nextDouble();
        System.out.print("Número de hijos: ");
        int hijos = sc.nextInt();

        if(horas>180){
            horas60 = horas - 180;
            horas = horas - horas60;
        }
        if(horas > 169){
            horas50 = horas - 169;
            horas = horas - horas50;
        }

        bruto = ((tarifa*horas)+(tarifa*1.5*horas50)+(tarifa*1.6*horas60));

        System.out.println("DATOS DE LA NOMINA: ");

        System.out.print("Nómina de " + nombre + " " + apellido + "\nEstado: " + estado);
        System.out.println("\nSalario bruto: " + Math.round(bruto*100.0)/100.0 + "€");
        System.out.println("Cálculo de deducciones: \n" + "");
        double deudaSocial = bruto * 3.49/100;
        System.out.println("- Contribución para el pago de la deuda social y contingencias comunes imponible:\n" + Math.round(deudaSocial*100.0)/100.0 + "€" );

        double contNoImp = bruto * 6.15/100;
        System.out.println("- Contribución de contingencias comunes no imponible: \n" + Math.round(contNoImp*100.0)/100.0 + "€");

        double seguroMedico = bruto * 0.95/100;
        System.out.println("- Seguro médico: \n" + Math.round(seguroMedico*100.0)/100.0 + "€");

        double fondoPensiones = bruto * 8.44/100;
        System.out.println("- Fondo de pensiones: \n" + Math.round(fondoPensiones*100.0)/100.0 + "€" );

        double seguroDesempleo = bruto * 3.05/100;
        System.out.println("- Seguro de desempleo: \n" + Math.round(seguroDesempleo*100.0)/100.0 + "€" );

        double pensionComplementaria = bruto * 3.81/100;
        System.out.println("- Pensión complementaria (Entidad privada): \n" + Math.round(pensionComplementaria*100.0)/100.0 + "€" );

        double contribJubilacion = bruto * 1.02/100;
        System.out.println("- Contribución de jubilación anticipada: \n" + Math.round(contribJubilacion*100.0)/100.0 + "€" );

        double deduccionesTotales = deudaSocial+contNoImp+seguroMedico+fondoPensiones+seguroDesempleo+pensionComplementaria+contribJubilacion;
        System.out.println("- Deducciones totales de los empleados: \n" + Math.round(deduccionesTotales*100.0)/100.0 + "€" );

        double neto = bruto - deduccionesTotales;
        System.out.println("\nSalario neto: \n" + Math.round(neto*100.0)/100.0 + "€" );

        int primaFamiliar = 0;
        if(hijos == 1){
            primaFamiliar = 20;
        }else if (hijos == 2){
            primaFamiliar = 50;
        }else if (hijos>2){
            primaFamiliar = 70 + (((hijos-2)*20));
        }

        System.out.println("- Prima familiar: " + Math.round(primaFamiliar*100.0)/100.0 + "€");

        double netoAPagar = neto + primaFamiliar;
        System.out.println("\nSalario neto a pagar: \n" + Math.round(netoAPagar*100.0)/100.0 + "€" );
    }


}
