/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debugger.en.netbeans.pkgwhile;

/**
 *
 * @author lasfferpro
 */
public class DebuggerEnNetbeansWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declaración de las variables
        */
        
        int numero = 0;
        
        /*
        Utilización del bucle "while" para probar el debugger de Netbeans.
        */
        
        while (numero < 10){ // Compara el contenido de la variable "numero", si es menor a 10, entra en el bucle.
            
            System.out.println(numero); // Se muestra el contenido de la variable "numero".
            
            numero++; // Aumenta, en 1, el contenido de la variable numero.
        }
        
    }
    
}
