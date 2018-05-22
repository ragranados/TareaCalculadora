/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.AbstractFactory;

/**
 *
 * @author LN710Q
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String accion){
        switch(accion){
            case "Operar":
                return new FactoryAritmetica();
                
            case "Convertir":
                return new FactoryConversor();
                
            
        }
        
        return null;
    }
    
}
