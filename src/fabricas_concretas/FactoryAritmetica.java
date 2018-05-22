/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.AbstractFactory;
import productos_abstractos.Operacion;
import productos_concretos.Resta;
import productos_concretos.Suma;



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
    public Operacion Operar(String operacion) {
        switch(operacion){
            case "Sumar": 
                return new Suma();
                
            case "Restar":
                return new Resta();
            case "Multiplicar":
                break;
            case "Dividir":
                break;
        }
        return null;
    }

    
    
}
