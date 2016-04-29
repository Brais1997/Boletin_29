/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_29;

import java.util.ArrayList;

/**
 *
 * @author balva
 */
public class Boletin_29 {

  
    public static void main(String[] args) {
     ArrayList<Barco> barcos = new ArrayList();
        Barco vel = new Veleros(15,2);
        Barco dep = new Deportivos(14,30);
        Barco yat = new Yate(20,2,35);
        
        barcos.add(vel);
        barcos.add(dep);
        barcos.add(yat);
        
       for(Barco b:barcos){
           b.factura(3);
       }
    }
    
}
