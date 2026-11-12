/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here

        int op;
        int valor1;
        int valor2;
        double resultado = 0;
        String nombre = "";
        boolean calculado = false;

        System.out.println("Ingrese el primer valor de la operación");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor de la operación");
        valor2 = entrada.nextInt();

        System.out.println("Seleccione la operación que desea realizar\n"
                + "Ingrese 1 para sumar\n"
                + "Ingrese 2 para restar\n"
                + "Ingrese 3 para multiplicar\n"
                + "Ingrese 4 para dividir\n"
                + "Ingrese 5 para calcular el módulo\n"
                + "Ingrese 6 para calcular la potencia");
        op = entrada.nextInt();
        System.out.println();

        if (valor1 > valor2) {

            if (op == 1) {
                nombre = "Suma";
                resultado = valor1 + valor2;
                calculado = true;
            } else {

                if (op == 2) {
                    nombre = "Resta";
                    resultado = valor1 - valor2;
                    calculado = true;
                } else {

                    if (op == 3) {
                        nombre = "Multiplicación";
                        resultado = valor1 * valor2;
                        calculado = true;
                    } else {

                        if (op == 4) {
                            if (valor2 != 0) {
                                nombre = "División";
                                resultado = (double) valor1 / valor2;
                                calculado = true;
                            } else {
                                System.out.println("No es posible dividir: el"
                                        + " segundo número no puede ser cero.");
                            }
                        } else {

                            if (op == 5) {
                                if (valor2 != 0) {
                                    nombre = "Módulo";
                                    resultado = valor1 % valor2;
                                    calculado = true;
                                } else {
                                    System.out.println("No es posible calcular"
                                            + " el módulo: el segundo número "
                                            + "no puede ser cero.");
                                }
                            } else {

                                if (op == 6) {
                                    nombre = "Potencia";
                                    resultado = Math.pow(valor1, valor2);
                                    calculado = true;
                                } else {
                                    System.out.println("La opción seleccionada"
                                            + " no es válida.");
                                }
                            }
                        }
                    }
                }
            }

        } else {
            System.out.println("No es posible realizar la operación: el"
                    + " primer número debe ser mayor que el segundo.");
        }

        if (calculado) {
            System.out.println("OPERACIONES ARITMÉTICAS");
            System.out.println();
            System.out.printf("Primer número: %d\n", valor1);
            System.out.printf("Segundo número: %d\n", valor2);
            System.out.printf("Operación seleccionada: %s\n", nombre);
            System.out.println();
            System.out.println("Resultado: " + resultado);
        }
    }
}
