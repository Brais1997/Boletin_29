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
public class Yate extends Barco {
    private int potencia;
    private int camarotes;

    public Yate(int eslora) {
        super(eslora);
    }
    public Yate(int eslora,int potencia,int camarotes) {
        super(eslora);
        this.camarotes=camarotes;
        this.potencia=potencia;
    }


    @Override
    public void factura(int dias) {
     System.out.println("matricula: "+0+" eslora: "+super.getEslora()+" precio: "+((dias*(10*super.getEslora()))+potencia+camarotes));
    }
}
