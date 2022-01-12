/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.

 */
package ejercicio2;

import java.util.Locale;
import java.util.Scanner;


public class ejerc2 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese un nombre");
        String nombre= entrada.next();
        System.out.println("el nombre ingresado ES: "  +nombre);
    }
    
    
}
