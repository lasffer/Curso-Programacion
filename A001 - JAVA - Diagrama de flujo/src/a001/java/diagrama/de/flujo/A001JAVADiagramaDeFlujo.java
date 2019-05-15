/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a001.java.diagrama.de.flujo;

/**
 *
 * @author lasfferpro
 */
public class A001JAVADiagramaDeFlujo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declaración de todas las variables que vamos a usar.
        */
        int balanceBanco;
        
        /*
        Inicialización, de ser necesario, de las variables.
        */
        balanceBanco = 500;
        
        // Sumar 250 al contenido de la variable "balanceBanco".
        balanceBanco += 250;
        
        // Restar 100 al contenido de la variable "balanceBanco".
        balanceBanco -= 100;
        
        System.out.println(balanceBanco);
    }
    
}
