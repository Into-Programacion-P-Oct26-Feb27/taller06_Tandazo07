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
 
        String tipo = "";
        String mensaje = "";
 
        System.out.println("Ingrese el primer valor de la operación");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor de la operación");
        valor2 = entrada.nextInt();
 
        System.out.println("Seleccione la operación que desea realizar\n"
                + "Ingrese 1 para sumar\n"
                + "Ingrese 2 para restar\n"
                + "Ingrese 3 para multiplicar\n"
                + "Ingrese 4 para dividir\n"
                + "Ingrese 5 para obtener el módulo\n"
                + "Ingrese 6 para potencia");
        op = entrada.nextInt();
        System.out.println();
 
        // compare devuelve 1 cuando valor1 es mayor que valor2
        switch (Integer.compare(valor1, valor2)) {
            case 1:
                switch (op) {
                    case 1:
                        tipo = "Suma";
                        resultado = valor1 + valor2;
                        break;
                    case 2:
                        tipo = "Resta";
                        resultado = valor1 - valor2;
                        break;
                    case 3:
                        tipo = "Multiplicación";
                        resultado = valor1 * valor2;
                        break;
                    case 4:
                        tipo = "División";
                        switch (valor2) {
                            case 0:
                                mensaje = "No es posible realizar la operación: el segundo número no puede ser cero.";
                                break;
                            default:
                                resultado = valor1 / valor2;
                        }
                        break;
                    case 5:
                        tipo = "Módulo";
                        switch (valor2) {
                            case 0:
                                mensaje = "No es posible realizar la operación: el segundo número no puede ser cero.";
                                break;
                            default:
                                resultado = valor1 % valor2;
                        }
                        break;
                    case 6:
                        tipo = "Potencia";
                        resultado = (int) Math.pow(valor1, valor2);
                        break;
                    default:
                        mensaje = "La opción no es válida.";
                }
                break;
            default:
                // valor1 no es mayor que valor2
                switch (op) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        mensaje = "No es posible realizar la operación: el primer número debe ser mayor que el segundo.";
                        break;
                    default:
                        mensaje = "La opción no es válida.";
                }
        }
 
        switch (mensaje) {
            case "":
                System.out.printf("OPERACIONES ARITMÉTICAS\n\n"
                        + "Primer número: %d\n"
                        + "Segundo número: %d\n"
                        + "Operación seleccionada: %s\n\n"
                        + "Resultado: %s\n",
                        valor1, valor2, tipo, resultado);
                break;
            default:
                System.out.println(mensaje);
        }
    }
}