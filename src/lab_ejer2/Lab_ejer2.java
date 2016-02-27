/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ejer2;

/**
 *
 * @author Cristian Diaz
 */

/*
    En este programa se determina unas variables a las cuales se
    las inicializa en un valor, luego se llama esas variables y 
    se las somete a una serie de repeticiones donde su valor cambia;
    dependiendo del valor que tomen estas variables, en pantalla 
    se unos simbolos determinados.
*/

public class Lab_ejer2 {
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int cuenta_as=1;
        int contador=1;
        int blan;
        int num=5;
        char ast=42;
        char esp=32;
        while(contador <= num){
            blan=num-contador;
            contador = contador +1;
            while(blan<0){
                System.out.println(esp);
                blan = blan -1;
            }
            while(cuenta_as<(2*contador)){
                System.out.println(ast);
                cuenta_as = cuenta_as +1;
            }
        }
    }
}