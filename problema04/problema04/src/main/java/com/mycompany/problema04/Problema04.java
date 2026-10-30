/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema04;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cliente;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double costoBase;
        double costoOperacional;
        double costoFinal;

        System.out.println("Ingrese nombre del cliente");
        cliente = entrada.nextLine();

        System.out.println("Ingrese costo del CPU");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese costo del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese costo del raton");
        raton = entrada.nextDouble();
        System.out.println("Ingrese costo de la pantalla");
        pantalla = entrada.nextDouble();

        costoBase = cpu + teclado + raton + pantalla;
        costoOperacional = costoBase * 0.15;
        costoFinal = costoBase + costoOperacional;

        System.out.printf("Reporte:\n"
                + "Nombres de cliente: %s\n"
                + "Valores iniciales:\n"
                + "CPU: $ %.2f\n"
                + "Teclado: $ %.2f\n"
                + "Raton: $ %.2f\n"
                + "Pantalla: $ %.2f\n\n"
                + "Costo base: $ %.2f\n"
                + "Costo adicional del 15%%: %.2f\n"
                + "Costo final: $ %.2f\n",
                cliente,
                cpu, teclado, raton, pantalla,
                costoBase, costoOperacional,
                costoFinal);
    }
}
