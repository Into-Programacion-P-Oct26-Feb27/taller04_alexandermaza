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
public class problema02 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double area;

        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextDouble();

        // Calculo del area
        area = (base * altura) / 2;

        System.out.printf("==========================================\n"
                + "AREA DE UN TRIANGULO\n"
                + "==========================================\n"
                + "Base: %.2f\n"
                + "Altura: %.2f\n"
                + "------------------------------------------\n"
                + "AREA: %.2f\n"
                + "==========================================\n",
                base, altura,
                area);
    }
}
