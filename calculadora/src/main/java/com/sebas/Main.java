package com.sebas;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// --------------------------PEDIR UN TEXTO Y MOSTRAR---------------------------------------------
        // mostrar mensaje pidiendo el nombre
        // System.out.print("Bienvenido, ingresa tu nombre: ");
        // preparar el oido
        // Scanner lector = new Scanner(System.in);
        // escuchar el nombre
        // String nombre = lector.nextLine();
        // Saludar al usuario con su nombre
        // System.out.println("Hola "+nombre+" es un placer saludarte");

// --------------------------SUMAR DOS NUMEROS-------------------------------------------------

        /**

         Calculadora SUMA - pseudocodigo

         Pedir numero A
         Pedir numero B
         Sumar
         Mostrar el resultado



         Scanner lector = new Scanner(System.in);
         System.out.print("Ingrese el primer numero: ");
         int numA = lector.nextInt();
         System.out.print("Ingrese el segundo numero: ");
         int numB = lector.nextInt();
         int totalSuma = numA + numB;
         System.out.print("El resultado de sumar "+numA+ " y "+numB+ " es: "+totalSuma);


         */
// ---------------------------MENU Y 4 OPERACIONES-------------------------------------------------------

        /*
         * MENU PSUDOCODIGO
         *
         * ingresar los numeros a operar
         * mostrar el mensaje con las opciones del menu
         * pedir seleccionar uno digitando el numero identificador de la opcion seleccionada
         * segun la opcion seleccionada, operar
         * mostrar el resultado
         *
         * */

        // Logica de la bienvenida y de pedir los numeros a operar

        System.out.print("Bienvenid@ a la calculadora \n");

        // logica del menu y seleccion de operacion
        Scanner lector = new Scanner(System.in);
        int opcion;
        do{
            System.out.print("Seleccione una de las siguentes opciones: \n 1. Operar \n 2. Salir \n ");
             opcion = lector.nextInt();
            if (opcion == 2){
                break;
            }
            System.out.print("Seleccione una de las siguentes operaciones: \n 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division \n 5. Salir \n");

            int operacion = lector.nextInt();

            if (operacion == 5) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.print("Ingrese el primer numero: ");

            double numA = lector.nextDouble();

            System.out.print("Ingrese el segundo numero: ");

            double numB = lector.nextDouble();

            if (operacion == 1) {
                double total = numA + numB;
                System.out.println("El resultado de: " + numA + " + " + numB + " es: " + total);
            } else if (operacion == 2) {
                double total = numA - numB;
                System.out.println("El resultado de: " + numA + " - " + numB + " es: " + total);
            } else if (operacion == 3) {
                double total = numA * numB;
                System.out.println("El resultado de: " + numA + " * " + numB + " es: " + total);
            } else if (operacion == 4) {
                double total = numA / numB;
                System.out.println("El resultado de: " + numA + " / " + numB + " es: " + total);
            } else {
                System.out.println("Opcion invalida");
            }
        } while (opcion != 2);

    }
}