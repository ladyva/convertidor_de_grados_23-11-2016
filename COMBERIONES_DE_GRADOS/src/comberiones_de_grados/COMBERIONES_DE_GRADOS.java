/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comberiones_de_grados;

import MODELO.MODELO_GRADOS;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class COMBERIONES_DE_GRADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("MENÚ\n "+"Ingrese la opción: \n"
                +" 1)Grados centigrados\n"+" 2)Grados Fahrenheit"));
          
        }while(op>=4);
        MODELO_GRADOS o1= new MODELO_GRADOS(op);
        o1.grados();
        
    }
    
}
