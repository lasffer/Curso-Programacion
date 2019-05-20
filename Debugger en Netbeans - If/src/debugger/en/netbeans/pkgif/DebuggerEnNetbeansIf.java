/**
 * Programa: Utilización del if-else.
 *
 */
package debugger.en.netbeans.pkgif;

/**
 *
 * @author Caron, Lucas Javier
 */
public class DebuggerEnNetbeansIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Lo primero que hay que hacer es declarar todas las variables que vamos
        a estar utilizando en nuestro programa.
         */

 /*
        Declaración de las variables
         */
        int edad, nota1, nota2;
        float promedio;
        String nombre;

        /*
        Luego de las declaraciones de las variables, van todas las
        inicializaciones.
         */
        
        /*
        Inicialización de las variables para poder utilizar el "if".
         */
        edad = -18;
        nota1 = 10;
        nota2 = 8;

        // Utilización del control de flujo "if" para indicar si es mayor de edad o no.
        if (edad < 0) {
            // Se muestra el mensaje de error si es una edad negativa.
            System.out.println("Ha ingresado una edad incorrecta (" + edad + ").\n"
                    + "No puedo decirle si es mayor o menor de edad.");
        } else if (edad >= 18) {
            // Se muestra el mensaje de que es mayor de edad.
            System.out.println("Usted es mayor de edad");
        } else {
            // Se muestra el mensaje de que es menor de edad.
            System.out.println("Usted es menor de edad");
        }

        
        // Utilización del control de flujo "if" para indicar si el promedio
        // de dos notas es mayor o igual a 7 para saber si aprobó o no.
        
        if ( (nota1+nota2)/2 >= 7 ){
            System.out.println("Aprobaste!");
        } else {
            System.out.println("No aprobaste.");
        }
    }

}
