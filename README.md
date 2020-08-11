# Fibonacci
Serie fibonacci

package Contenido;

import java.util.Scanner;

public class Serie {

   
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int a=0, b=1, c, n;
        
        System.out.print("Ingrese cantidad de elementos para la serie:");
        n = tecla.nextInt();
        
        for (int i = 0; i < n; i++) {
        
            c=a+b;
            a=b;
            b=c;
        }
      System.out.println(a);
    }
    
}
