/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos;

import productos_abstractos.Operar;

/**
 *
 * @author LN710Q
 */
public class Resta implements Operar{

    @Override
    public float operacion (float a, float b) {
        return a-b;
    }
    
}
