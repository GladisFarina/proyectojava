/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;


public class ejerc3 {

   
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);  
     System.out.println("ingrese una frase");
     String frase= entrada.next();
        System.out.println("la frase en minuscula es: " + frase.toLowerCase());
        
        System.out.println("la frase en mayuscula es: "+ frase.toUpperCase());
    }
    
    
}
