/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese frase");
        String frase = leer.next();
        if (frase.equals("eureka")) {

            System.out.println("correcto");

        } else {
            System.out.println("incorrecto");
        }

}

}
