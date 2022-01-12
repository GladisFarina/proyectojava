package ejercicio1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * Escribir un programa que pida dos números enteros por teclado y calcule la
 * suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class ejerc1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese el primer valor");
        int num1 = entrada.nextInt();

        System.out.println("ingrese el segundo valor");

        int num2 = entrada.nextInt();

        System.out.println("la suma de los numeros es: ");
        System.out.println(num1 + num2);

    }

    private static Object useDelimiter(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
