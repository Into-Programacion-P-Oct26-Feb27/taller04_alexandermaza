/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto05;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Proyecto05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cliente;
        double precioNetflix;
        double precioYoutube;
        double precioDropbox;
        double precioSpotify;
        double descuentoNetflix;
        double descuentoYoutube;
        double descuentoDropbox;
        double finalNetflix;
        double finalYoutube;
        double finalDropbox;
        double finalSpotify;
        double totalSinDescuento;
        double ahorroTotal;
        double totalPagar;

        System.out.println("Ingrese nombre del cliente");
        cliente = entrada.nextLine();

        System.out.println("Ingrese precio mensual de Netflix");
        precioNetflix = entrada.nextDouble();
        System.out.println("Ingrese precio mensual de YouTube Premium");
        precioYoutube = entrada.nextDouble();
        System.out.println("Ingrese precio mensual de Dropbox");
        precioDropbox = entrada.nextDouble();
        System.out.println("Ingrese precio mensual de Spotify");
        precioSpotify = entrada.nextDouble();

        descuentoNetflix = precioNetflix * 0.23;
        descuentoYoutube = precioYoutube * 0.23;
        descuentoDropbox = precioDropbox * 0.45;

        finalNetflix = precioNetflix - descuentoNetflix;
        finalYoutube = precioYoutube - descuentoYoutube;
        finalDropbox = precioDropbox - descuentoDropbox;
        finalSpotify = precioSpotify;

        totalSinDescuento = precioNetflix + precioYoutube + precioDropbox + precioSpotify;
        ahorroTotal = descuentoNetflix + descuentoYoutube + descuentoDropbox;
        totalPagar = finalNetflix + finalYoutube + finalDropbox + finalSpotify;

        System.out.printf("PLANILLA DE SERVICIOS DIGITALES\n"
                + "Cliente: %s\n\n"
                + "Netflix (23%%)\n"
                + "Precio original: $ %.2f\n"
                + "Descuento: $ %.2f\n"
                + "Precio final: $ %.2f\n\n"
                + "YouTube Premium (23%%)\n"
                + "Precio original: $ %.2f\n"
                + "Descuento: $ %.2f\n"
                + "Precio final: $ %.2f\n\n"
                + "Dropbox (45%%)\n"
                + "Precio original: $ %.2f\n"
                + "Descuento: $ %.2f\n"
                + "Precio final: $ %.2f\n\n"
                + "Spotify (sin descuento)\n"
                + "Precio final: $ %.2f\n\n"
                + "Costo total sin descuentos: $ %.2f\n"
                + "Ahorro mensual total: $ %.2f\n"
                + "TOTAL A PAGAR MENSUAL: $ %.2f\n",
                cliente,
                precioNetflix, descuentoNetflix, finalNetflix,
                precioYoutube, descuentoYoutube, finalYoutube,
                precioDropbox, descuentoDropbox, finalDropbox,
                finalSpotify,
                totalSinDescuento, ahorroTotal,
                totalPagar);
    }
}
