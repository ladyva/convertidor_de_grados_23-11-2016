
package nueva;

import javax.swing.JOptionPane;


public class seriesita {
    public int numero1;
    public int numero2;
    public int valor;
    public int limite;

    public seriesita(int numero1, int numero2, int valor, int limite) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.valor = valor;
        this.limite = limite;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    public void calcular(){
        int cont=1;
        double alma;
        double nuevo=0.0;
        double div;
        while(cont<=limite){
            alma = numero1 + (valor*numero2);
            valor+=1;
            div=1/alma;
            nuevo = nuevo+div; 
            cont+=1;             
                                    
        }JOptionPane.showMessageDialog(null,"LA respuesta es igual a:"+nuevo);
            
                
    }

    
}
