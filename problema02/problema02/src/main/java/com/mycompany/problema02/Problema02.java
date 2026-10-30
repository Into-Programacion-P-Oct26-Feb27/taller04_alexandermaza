/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema02;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema02 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String titular;
        String direccion;
        double costoMinuto;
        int minutos;
        double valorTotal;

        System.out.println("Ingrese nombre del titular");
        titular = entrada.nextLine();
        System.out.println("Ingrese direccion");
        direccion = entrada.nextLine();

        System.out.println("Ingrese costo por minuto");
        costoMinuto = entrada.nextDouble();
        System.out.println("Ingrese minutos consumidos");
        minutos = entrada.nextInt();

        // Calculo del valor total
        valorTotal = costoMinuto * minutos;

        System.out.printf("==========================================================\n"
                + "PLANILLA DE SERVICIO TELEFÓNICO\n"
                + "==========================================================\n"
                + "Titular: %s\n"
                + "Dirección: %s\n"
                + "----------------------------------------------------------\n"
                + "Costo por minuto: $%.2f\n"
                + "Minutos consumidos: %d\n"
                + "----------------------------------------------------------\n"
                + "VALOR TOTAL A PAGAR:  $%.2f\n"
                + "==========================================================\n",
                titular, direccion,
                costoMinuto, minutos,
                valorTotal);
    }
}
