package ejercicio4;


import java.util.Locale;
import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
 */


public class ej4 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese los valores en grados centigrados");
        double grados=leer.nextDouble();
        double F =(32 + (9 * grados) / 5); 
        System.out.println("la temperatura en farenheit es:"+F);
    }
    
}
