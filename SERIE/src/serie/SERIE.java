/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

import javax.swing.JOptionPane;
import nueva.seriesita;

/**
 *
 * @author usuario
 */
public class SERIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1,numero2,valor,limite;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de A:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de B:"));
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de N:"));
        limite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de limite:"));
        
        seriesita objeto = new seriesita(numero1,numero2,valor,limite);
        
        objeto.calcular();



    }
    
}
