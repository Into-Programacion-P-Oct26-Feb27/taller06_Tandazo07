/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        
        String empleado;
        int tipo;
        int anios;
        double sueldo;
 
        double porcentaje = 0;
        double incremento = 0;
        double bonificacion = 0;
        double nuevoSueldo = 0;
 
        System.out.println("Ingrese el nombre del empleado");
        empleado = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado");
        tipo = entrada.nextInt();
        System.out.println("Ingrese los años de servicio");
        anios = entrada.nextInt();
        System.out.println("Ingrese el sueldo inicial");
        sueldo = entrada.nextDouble();
        System.out.println();
 
        
        switch (tipo) {
            case 1:
                porcentaje = 5;
                break;
            case 2:
                porcentaje = 7;
                break;
            case 3:
                porcentaje = 9;
                break;
            case 4:
                porcentaje = 12;
                break;
            default:
                porcentaje = 15;
        }
 
        
        if (anios < 2) {
            bonificacion = 0.00;
        } else if (anios < 5) {
            bonificacion = 30.00;
        } else if (anios < 10) {
            bonificacion = 60.00;
        } else {
            bonificacion = 100.00;
        }
 
        incremento = sueldo * porcentaje / 100;
        nuevoSueldo = sueldo + incremento + bonificacion;
 
        System.out.printf("REPORTE DE INCREMENTO SALARIAL\n\n"
                + "Empleado: %s\n"
                + "Tipo de empleado: %d\n"
                + "Años de servicio: %d\n\n"
                + "Sueldo inicial: $%.2f\n"
                + "Porcentaje de incremento: %.0f%%\n"
                + "Incremento salarial: $%.2f\n"
                + "Bonificación por antigüedad: $%.2f\n\n"
                + "Nuevo sueldo: $%.2f\n",
                empleado, tipo, anios, sueldo, porcentaje, incremento, bonificacion, nuevoSueldo);
    }
}