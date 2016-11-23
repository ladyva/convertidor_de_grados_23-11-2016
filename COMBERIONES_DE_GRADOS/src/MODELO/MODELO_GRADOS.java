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
public class MODELO_GRADOS {
    public int op;

    public MODELO_GRADOS(int op) {
        this.op = op;
    }
    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }
     public void grados(){
        String salida="";
        double R;
        double C=0;
        double F=0;
        switch(op){
            case 1:
                salida="GRADOS CENTIGRADOS";
                F=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Fahrenheit: "));
                R=(F-32)*5/9;
                
                JOptionPane.showMessageDialog(null,F+" °Fahrenheit son: "+R+" °C");
                break;
            case 2:
                salida="GRADOS Fahrenheit";
                C=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Centigrados: "));
                R=(C*9/5)+32;
                JOptionPane.showMessageDialog(null,C+" °CENTIGRADOS son: "+R+" °F");
                break;
            default:
                salida= "La opción es incorrecta";
                JOptionPane.showMessageDialog(null,salida);
                

        }
     }
 
}
