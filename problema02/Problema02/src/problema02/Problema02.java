/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here

        String propietario;
        String descripcion = "";
        int tipo;
        double avaluo;
        double porcentaje = 0;
        double valorFijo = 0;
        double valorBase;
        double recargo = 0;
        double total;
        int tipoValido = 0;

        System.out.println("Ingrese el nombre del propietario");
        propietario = entrada.nextLine();

        System.out.println("Seleccione el tipo de vehículo\n"
                + "Ingrese 1 para vehículo liviano particular\n"
                + "Ingrese 2 para vehículo grande particular\n"
                + "Ingrese 3 para taxi\n"
                + "Ingrese 4 para bus urbano");
        tipo = entrada.nextInt();

        switch (tipo) {

            case 1:
                descripcion = "Vehículo liviano particular";
                porcentaje = 0.01;
                valorFijo = 2.00;
                tipoValido = 1;
                break;

            case 2:
                descripcion = "Vehículo grande particular";
                porcentaje = 0.02;
                valorFijo = 2.50;
                tipoValido = 1;
                break;

            case 3:
                descripcion = "Taxi";
                porcentaje = 0.04;
                valorFijo = 1.50;
                tipoValido = 1;
                break;

            case 4:
                descripcion = "Bus urbano";
                porcentaje = 0.05;
                valorFijo = 2.20;
                tipoValido = 1;
                break;

            default:
                tipoValido = 0;
                break;
        }

        switch (tipoValido) {

            case 1:
                System.out.println("Ingrese el avalúo comercial del vehículo");
                avaluo = entrada.nextDouble();

                valorBase = avaluo * porcentaje / 100 + valorFijo;

                switch (tipo) {
                    case 1:
                    case 2:
                        switch ((int) Math.signum(avaluo - 30000)) {
                            case 1:
                                recargo = 1.50;
                                break;
                            default:
                                recargo = 0;
                                break;
                        }
                        break;
                    default:
                        recargo = 0;
                        break;
                }

                total = valorBase + recargo;

                // Reporte
                System.out.println();
                System.out.println("Peaje \"Buena Vía\"");
                System.out.println("Propietario: " + propietario);
                System.out.println("Tipo: " + descripcion);
                System.out.printf(Locale.US, "    Avalúo: $%.2f\n", avaluo);
                System.out.printf(Locale.US, "    Valor base del peaje: $%.2f\n", valorBase);
                System.out.printf(Locale.US, "    Recargo: $%.2f\n", recargo);
                System.out.println();
                System.out.printf(Locale.US, "    Total a cancelar: $%.2f\n", total);
                break;

            default:
                System.out.println("El tipo de vehículo ingresado no es válido.");
                break;
        }
    }
}
