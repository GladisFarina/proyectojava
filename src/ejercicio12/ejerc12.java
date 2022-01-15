/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta
 */
package ejercicio12;

import java.util.Locale;
import java.util.Scanner;

public class ejerc12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int nota;

        System.out.println("ingrese una nota");
        nota = entrada.nextInt();

        while (nota < 1 || nota > 10) {
            System.out.println(" ERROR! ingrese una nota entre 1 y 10");
            nota = entrada.nextInt();

        }
        System.out.println(" la nota ingresada es correcta: " + nota);

    }

}
