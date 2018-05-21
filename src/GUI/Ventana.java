/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel{
    public int WIDTH = 300, widthTF = 120, widthB = 80;
    public int HEIGHT = 300, heightTF = 30, heightB =30;
    public JTextField textF1, textF2,textF3;
    public JButton buttonS, buttonR, buttonC;

    public Ventana() {
        this.textF1 = new JTextField();
        textF1.setBounds(new Rectangle(100,40,widthTF,heightTF));
        
        this.textF2 = new JTextField();
        textF2.setBounds(new Rectangle(100,100,widthTF,heightTF));
        
        this.textF3 = new JTextField();
        textF3.setBounds(new Rectangle(100,140,widthTF,heightTF));
        
        this.buttonS = new JButton("Sumar");
        buttonS.setBounds(new Rectangle(40,200,widthB-10,heightB));
        
        this.buttonR = new JButton("Restar");
        buttonR.setBounds(new Rectangle(110,200,widthB-10,heightB));
        
        this.buttonC = new JButton("Convertir");
        buttonC.setBounds(new Rectangle(170,200,widthB-10,heightB));
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        
        buttonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer suma = Integer.parseInt(textF1.getText())+Integer.parseInt(textF2.getText());
                
                textF3.setText(suma.toString());
            }
        });
        
        add(textF1);
        add(textF2);
        add(textF3);
        add(buttonS);
        add(buttonR);
        add(buttonC);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
    
    
}
