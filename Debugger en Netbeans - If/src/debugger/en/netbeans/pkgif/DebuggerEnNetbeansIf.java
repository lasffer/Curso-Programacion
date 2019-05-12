/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debugger.en.netbeans.pkgif;

/**
 *
 * @author lasfferpro
 */
public class DebuggerEnNetbeansIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de las variables que vamos a utilizar.
        int edad, nota1 , nota2;
        float promedio;
        String nombre;
        
        // Inicialización de las variables para poder utilizar el "if".
        edad = -18;
        nota1 = 10;
        nota2 = 8;
        
        
        // Utilización del control de flujo "if" para indicar si es mayor de edad o no.
        
        if (edad < 0){
            // Se muestra el mensaje de error si es una edad negativa.
            System.out.println("Ha ingresado una edad incorrecta ("+ edad +").\n"
                    + "No puedo decirle si es mayor o menor de edad.");
        } else if (edad >= 18){
            // Se muestra el mensaje de que es mayor de edad.
            System.out.println("Usted es mayor de edad");
        } else{
            // Se muestra el mensaje de que es menor de edad.
            System.out.println("Usted es menor de edad");
        }
        
        
        
    }
    
}
