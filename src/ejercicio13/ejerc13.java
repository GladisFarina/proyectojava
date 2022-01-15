/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial
 */
package ejercicio13;

import java.util.Locale;
import java.util.Scanner;


public class ejerc13 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese un valor limite");
        int valorlimite=entrada.nextInt();
        int suma=0;
        while (suma<valorlimite){
            System.out.println("ingrese un valor");
        
        int num=entrada.nextInt();
        suma=suma+num;        
      
       }
        System.out.println("la suma de los valores ingresados es: "+suma);
    }
    
}
