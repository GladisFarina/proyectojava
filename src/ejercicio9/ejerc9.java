/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejercicio9;

import java.util.Locale;
import java.util.Scanner;

public class ejerc9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese una palabra");
        String palabra = entrada.next();

        if (palabra.length() == 8) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
    }
}

    

