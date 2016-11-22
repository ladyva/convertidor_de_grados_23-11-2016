/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class MODELO_FACTORIAL {
    public void factorial(){
        int n=0;
        for (int i=1;i<=10;i++){
            for (int j=1;j<=i;j++){
                n=n*j;
            }
            JOptionPane.showMessageDialog(null, i+"!"+"= "+n);
            n=1;
        }
    }
        
}
