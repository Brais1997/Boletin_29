/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_29;

/**
 *
 * @author balva
 */
public class Deportivos extends Barco {
     private int potencia;

    public Deportivos(int eslora,int potencia) {
        super(eslora);
        this.potencia= potencia;
    }
    @Override
    public void factura(int dias) {
        System.out.println("matricula: "+0+" eslora: "+super.getEslora()+" precio: "+((dias*(10*super.getEslora()))+potencia));
    }
}
