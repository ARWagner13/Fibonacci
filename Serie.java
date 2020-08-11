/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Serie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int a=0, b=1, c, n;
        
        System.out.print("Ingrese cantidad de elementos para la serie: ");
        n = tecla.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
    
    
}
