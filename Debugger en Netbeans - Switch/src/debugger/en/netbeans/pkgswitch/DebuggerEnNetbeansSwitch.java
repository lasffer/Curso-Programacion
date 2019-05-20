/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debugger.en.netbeans.pkgswitch;

import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Caron Lucas Javier
 */
public class DebuggerEnNetbeansSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        /*
        Declaración de las variables
         */
        boolean bandera = true;
        String numero;
        String tipoInfusion = null;
        String mensaje = "Menú\n1-Café\n2-Cappuccino\n3-Lágrima\nEscriba lo que desee";
        

        while (bandera) {
            numero = JOptionPane.showInputDialog(mensaje);

            switch (numero) {
                case "1":
                    tipoInfusion = "Café";
                    break;
                case "2":
                    tipoInfusion = "Cappuccino";
                    break;
                case "3":
                    tipoInfusion = "Lágrima";
                    break;
                default:
                    break;
            }

            if (tipoInfusion != null) {
                JOptionPane.showMessageDialog(null, "Tenés listo tu " + tipoInfusion);
                bandera = false;
            } else {
                JOptionPane.showMessageDialog(null, "No has seleccionado una opción correcta\nVuelve a intentarlo.", "La mini cafetera", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

}
