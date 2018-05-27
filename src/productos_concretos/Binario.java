/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos;

import productos_abstractos.Convertir;

/**
 *
 * @author rau3
 */
public class Binario implements Convertir {

    @Override
    public String aBinario(int a) {
        String bin="";
        while(a>=2){
            bin += (a%2);
            a=a/2;
        }
        bin+=a;
        bin=invertir(bin);
        
        return bin;
    }
    
    String invertir(String a){
        a = new StringBuffer(a).reverse().toString();
        
        return a;
    }

    
    
}
