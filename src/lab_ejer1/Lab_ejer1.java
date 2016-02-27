/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ejer1;

/**
 *
 * @author Cristian Diaz
 */

/*
    Este programa realiza en primer lugar la solicitud de tres numeros,
    luego los compara a traves de unas sentencias para determinar cual
    es el mayor entre los tres; finalmente imprime un mensaje donde 
    nos dice cual fue le mayor numero entre los ingresados.
*/

public class Lab_ejer1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int mayor;
        int a,b,c;
        System.out.println("Ingrese A.");
        a=lectura.nextInt();
        System.out.println("Ingrese B.");
        b=lectura.nextInt();
        System.out.println("Ingrese C.");
        c=lectura.nextInt();
        if(a>b&&b>c){
            mayor=a;
            System.out.println("El mayor es A " + mayor);
        }
        else if(b>a&&a>c){
            mayor=b;
            System.out.println("El mayor es B " + mayor);
        }
        else {
            mayor=c;
            System.out.println("El mayor es C " + mayor);
        }
    }
}