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
        int tipo;
        double avaluo;
 
        String descripcion = "";
        double porcentaje = 0;
        double fijo = 0;
        double base;
        double recargo = 0;
        double total;
 
        System.out.println("Ingrese el nombre del propietario");
        propietario = entrada.nextLine();
 
        System.out.println("Seleccione el tipo de vehículo\n"
                + "Ingrese 1 para vehículo liviano particular\n"
                + "Ingrese 2 para vehículo grande particular\n"
                + "Ingrese 3 para taxi\n"
                + "Ingrese 4 para bus urbano");
        tipo = entrada.nextInt();
 
        System.out.println("Ingrese el avalúo comercial");
        avaluo = entrada.nextDouble();
        System.out.println();
 
        switch (tipo) {
            case 1:
                descripcion = "Vehículo liviano particular";
                porcentaje = 0.01;
                fijo = 2.00;
                break;
            case 2:
                descripcion = "Vehículo grande particular";
                porcentaje = 0.02;
                fijo = 2.50;
                break;
            case 3:
                descripcion = "Taxi";
                porcentaje = 0.04;
                fijo = 1.50;
                break;
            case 4:
                descripcion = "Bus urbano";
                porcentaje = 0.05;
                fijo = 2.20;
                break;
        }
 
        if (descripcion.equals("")) {
            System.out.println("El tipo de vehículo no es válido.");
        } else {
            base = avaluo * porcentaje / 100 + fijo;
 
            
            if ((tipo == 1 || tipo == 2) && avaluo > 30000) {
                recargo = 1.50;
            }
 
            total = base + recargo;
 
            System.out.printf("Peaje \"BUENA VIA\"\n"
        + "Propietario: %s\n"
        + "Tipo: %s\n\n"
        + "    Avalúo: $%.2f\n"
        + "    Valor base del peaje: $%.2f\n"
        + "    Recargo: $%.2f\n"
        + "    TOTAL A CANCELAR: $%.2f\n",
        propietario, descripcion, avaluo, base, recargo, total);
        }
    }
}
