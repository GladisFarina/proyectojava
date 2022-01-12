package ejercicio7;


import java.util.Locale;
import java.util.Scanner;

/*
 Crear un programa que dado un numero determine si es par o impar
 */
public class ejerc7 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese un numero");
        int num= leer.nextInt();
        if (num %2==0) {
            System.out.println("el numero es par"); 
    
    }else {
    
        System.out.println("el numero es impar");          
}
    }
}
    
