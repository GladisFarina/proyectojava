/*
Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla
 */
package ejercicio6;

import java.util.Locale;
import java.util.Scanner;

public class ejerc6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese el primr numero");   
        int num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = leer.nextInt();

       int mayor=Math.max(num1, num2);
        System.out.println("el numero mayor es " +mayor);
        
        

        
    }
}
