/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import GUI.Ventana;
import javax.swing.JFrame;

/**
 *
 * @author LN710Q
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventana");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
        
        /*String a = "astridraul";
        String [] b = a.split("x");
        for (String s: b){
            System.out.println(s);
            
        }*/
        
        float num1 = 74;
        System.out.println(num1);
        
        
    }
    
}
