/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.AbstractFactory;
import productos_abstractos.Convertir;
import productos_concretos.Resta;
import productos_concretos.Suma;
import productos_abstractos.Operar;
import productos_concretos.Dividir;
import productos_concretos.Multiplicar;



/**
 *
 * @author LN710Q
 */
public class FactoryAritmetica implements AbstractFactory{

    @Override
    public Convertir Convertir(String conversion) {
        return null;
    }

    @Override
    public Operar Operar(String operacion) {
        switch(operacion){
            case "Sumar": 
                return new Suma();
                
            case "Restar":
                return new Resta();
            case "Multiplicar":
                return new Multiplicar();
                
            case "Dividir":
                return new Dividir();
                
        }
        return null;
    }

    
    
}
