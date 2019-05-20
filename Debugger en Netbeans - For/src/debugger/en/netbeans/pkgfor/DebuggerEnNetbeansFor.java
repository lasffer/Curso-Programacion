/**
 */
package debugger.en.netbeans.pkgfor;

/**
 *
 * @author Caron, Lucas Javier
 */
public class DebuggerEnNetbeansFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declaración de las variables
        */
        
        int numero = 0;
        String [] nombre = {"Lucas", "Martín", "Laura"};
        
        /*
        Utilización del bucle "while" para probar el debugger de Netbeans.
        */
        
        while (numero < 10){ // Compara el contenido de la variable "numero", si es menor a 10, entra en el bucle.
            
            System.out.println(numero); // Se muestra el contenido de la variable "numero".
            
            numero++; // Aumenta, en 1, el contenido de la variable numero.
        }
        
        
        /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        * El bucle "for" es un control de flujo que realiza, una porción de  *
        * código, una determinada cantidad de veces.                         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
        
        /*
        Utilización del bucle "for" para mostrar como aumenta un índice.
        */
        for (int indice = 0; indice < 10; indice++){ 
            
            System.out.println(indice);
            
        }
        
        /*
        Utilización del bucle "for" para mostrar como disminuye un índice.
        */
        
        for (int indice = 10; indice > 10; indice--){
            
            System.out.println(indice);
            
        }
        
        for (String i:nombre){
            System.out.println(i);
        }
        
        
        
    }
    
}
