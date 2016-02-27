/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ejer3;

/**
 *
 * @author Cristian Diaz
 */

/*
    En este programa se declara dos funciones las cueles retornan
    un arreglo, en el main se imprime un mensaje que dice primera 
    funcion, luego se hace el llamado a las dos funciones establecidas
    con anterioridad, para que de esta manera en pantalla se muestre
    los mensajes en un debido orden.
*/

public class Lab_ejer3 {
    
    public static String func1(){
        return "Segunda funcion.";
    }
    
    public static String func2(){
        return "Tercera funcion.";
    }
        
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Primera funcion en main.");
        System.out.println(func1());
        System.out.println(func2());
        System.out.println("Se termina main.");
    }
}