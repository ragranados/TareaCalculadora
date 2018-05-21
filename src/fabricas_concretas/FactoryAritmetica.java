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
public class FactoryAritmetica implements AbstractFactory{

    @Override
    public int Convertir(String conversion) {
        return 0;
    }

    @Override
    public int Operar(String operacion) {
        switch(operacion){
            case "sumar": 
                
                break;
            case "restar":
                break;
            case "multiplicar":
                break;
            case "dividir":
                break;
        }
        return 0;
    }

    
    
}
