/**
 * Programa: Factorial.
 * 
 * Metodología: Contador descendente.
 * 
 * Estrategia: 
 * 1 -  Se usará la variable "numIngresado" para almacenar el valor que 
 *      ingresará el usuario por teclado.
 * 
 * 2 -  Se usará la variable "contador" para poder ir multiplicando este valor
 *      contra la variable "resultado".
 * 
 * 3 -  Se usará la variable "resultado" para almacenar el valor de las
 *      operaciones matemáticas que haremos.
 *      El valor inicial de esta variable será 1. Ésto se hará porque en caso
 *      que el usuario ingrese el valor 0, éste mostrará el valor por defecto
 *      que es 1. Recordar que el valor de 0! = 1.
 */

package a007.java.factorial;

import java.util.Scanner;

/**
 *
 * @author Caron Lucas Javier
 */
public class A007JAVAFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Lo primero que hay que hacer es declarar todas las variables que vamos
        a estar utilizando en nuestro programa.
        */
        
        // Declaración de variables.
        int numIngresado; // No sabemos el valor que ingresa. No lo inicializamos.
        int contador; // No sabemos el valor que el usuario ingresa.
        int resultado; // Es donde vamos a guardar el resultado a mostrar.
        // Declaramos la variable para poder ingresar valores desde el teclado.
        Scanner teclado = new Scanner(System.in);
        
        
        /*
        Luego de las declaraciones de las variables, van todas las
        inicializaciones.
        */
        resultado = 1;
        
        /*
        El método que vamos a usar es el "Descendente".
        */
        
        // Mostramos al usuario un mensaje de bienvenida.
        System.out.println("Bienvenidos a Factorilandia.");
        System.out.print("Por favor, ingrese un número entre 0 y 14: ");
        
        // Esperamos que el usuario ingrese un número.
        numIngresado = teclado.nextInt();
        
        // Igualamos el valor del contador con el número ingresado.
        // Lo hacemos para saber desde que valor debemos empezar a disminuir
        // el valor de la variable "contador".
        
        contador = numIngresado;
        
        // El tipo de bucle utilizado es while.
        // Preguntamos si el valor de contador es mayor o igual a 1.
        // Recordar que 1 es el último valor que queremos multiplicar.
        while ( contador >= 1){
            // Asignamos el valor de la multiplicación a "resultado"
            resultado = resultado * contador;
            
            // Hay que disminuir el valor de contador.
            contador--;
        }
        
        // Mostramos el resultado final.
        System.out.println(numIngresado +"! = "+ resultado);
    }
    
}
