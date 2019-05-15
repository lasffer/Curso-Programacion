/**
 * Programa: A001 - JAVA - Diagrama de flujo.
 * 
 * Descripción:
 * Declaración e inicialización de una variable del tipo int, a la cual le
 * sumaremos y restaremos distintas cantidades, por último, mostraremos el
 * valor final que tiene.
 */
package a001.java.diagrama.de.flujo;

/**
 *
 * @author Caron, Lucas Javier
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
