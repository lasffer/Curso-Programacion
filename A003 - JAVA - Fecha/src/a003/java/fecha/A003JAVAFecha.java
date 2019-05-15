/**
 * Programa: A003 - JAVA - Fecha.
 * 
 * Descripción: Se generan 2 variables del tipo String para el día y el mes,
 * luego se muestran por pantalla según el formato "día - mes".
 */
package a003.java.fecha;

/**
 *
 * @author Caron, Lucas Javier
 */
public class A003JAVAFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declaración de las variables que vamos a utilizar.
        */
        String dia;
        String mes;
        /*
        Inicialización, de ser necesario, de las variables.
        */
        dia = "12";
        mes = "01";
        
        // Mostrar por pantalla el mensaje según el formato correspondiente
        System.out.println( dia + " - " + mes );
    }
    
}
