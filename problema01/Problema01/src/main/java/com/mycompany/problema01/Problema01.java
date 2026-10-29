/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema01;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Problema01 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String proyecto1;
        String proyecto2;
        String proyecto3;
        double gasto1;
        double gasto2;
        double gasto3;
        double gastoMensual;
        
        System.out.println("Ingrese nombre del Proyecto 1");
        proyecto1 = entrada.nextLine();
        System.out.println("Ingrese nombre del Proyecto 2");
        proyecto2 = entrada.nextLine();
        System.out.println("Ingrese nombre del Proyecto 3");
        proyecto3 = entrada.nextLine();
        
        System.out.println("Ingrese gasto 1");
        gasto1 = entrada.nextDouble();
        System.out.println("Ingrese gasto 2");
        gasto2 = entrada.nextDouble();
        System.out.println("Ingrese gasto 3");
        gasto3 = entrada.nextDouble();
        
        gastoMensual = gasto1 + gasto2 + gasto3;
        
        System.out.printf("CONTROL DE GASTOS DE PROYECTOS\nProyectos:\n"
                + "-------------------------------\n1. Desarrollo de software: "
                + "$%.2f\n2. Inteligencia artificial: $%.2f\n"
                + "3. Seguridad informática: $%.2f\n"
                + "-------------------------------\nGASTO MENSUAL TOTAL: "
                + "$%s\n",
                gasto1,
                gasto2,
                gasto3,
                gastoMensual);
        
       
    }
}
// aaaaaa