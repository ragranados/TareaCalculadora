/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.AbstractFactory;
import productos_abstractos.Convertir;
import productos_abstractos.Operar;
import productos_concretos.Binario;

/**
 *
 * @author LN710Q
 */
public class FactoryConversor implements AbstractFactory{

    @Override
    public Convertir Convertir(String conversion) {
        switch(conversion){
            case "Binario":
                return new Binario();
                
        }
        return null;
    }

    @Override
    public Operar Operar(String operacion) {
       return null;
    }

    
    
}
