/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1_2;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Problema1_2 {

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
        int resultado = 0;
 
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
 
        if (op < 1 || op > 6) {
            mensaje = "La opción no es válida.";
        } else {
            if (valor1 <= valor2) {
                mensaje = "No es posible realizar la operación: el primer número debe ser mayor que el segundo.";
            } else {
                if (op == 1) {
                    tipo = "Suma";
                    resultado = valor1 + valor2;
                } else if (op == 2) {
                    tipo = "Resta";
                    resultado = valor1 - valor2;
                } else if (op == 3) {
                    tipo = "Multiplicación";
                    resultado = valor1 * valor2;
                } else if (op == 4) {
                    tipo = "División";
                    if (valor2 == 0) {
                        mensaje = "No es posible realizar la operación: el segundo número no puede ser cero.";
                    } else {
                        resultado = valor1 / valor2;
                    }
                } else if (op == 5) {
                    tipo = "Módulo";
                    if (valor2 == 0) {
                        mensaje = "No es posible realizar la operación: el segundo número no puede ser cero.";
                    } else {
                        resultado = valor1 % valor2;
                    }
                } else {
                    tipo = "Potencia";
                    resultado = (int) Math.pow(valor1, valor2);
                }
            }
        }
 
        if (mensaje.equals("")) {
            System.out.printf("OPERACIONES ARITMÉTICAS\n\n"
                    + "Primer número: %d\n"
                    + "Segundo número: %d\n"
                    + "Operación seleccionada: %s\n\n"
                    + "Resultado: %d\n",
                    valor1, valor2, tipo, resultado);
        } else {
            System.out.println(mensaje);
        }
    }
}
