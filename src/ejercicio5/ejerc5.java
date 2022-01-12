
package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
public class ejerc5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
                
        System.out.println("ingrese un numero"); 
        int num=leer.nextInt();
        System.out.println("el doble de "+num+ " es "+(num*2));
        System.out.println("el triple de "+num+ " es "+(num*3));
        System.out.println("la raiz cuadrada de " +num+ " es "+Math.sqrt(num));
        
    }
    
}
