/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_abstractas;

import productos_abstractos.Convertir;
import productos_abstractos.Operar;

/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    Convertir Convertir(String conversion);
    Operar Operar(String operacion);
}
