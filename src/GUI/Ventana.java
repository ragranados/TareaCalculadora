/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import calculadora.Validar;
import fabricas_abstractas.AbstractFactory;
import fabricas_concretas.FactoryProducer;
import java.awt.Dimension;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import static javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
import javax.swing.JPanel;
import javax.swing.JTextField;
import productos_abstractos.Convertir;
import productos_abstractos.Operar;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel {

    public int WIDTH = 380, widthTF = 120, widthB = 100;
    public int HEIGHT = 350, heightTF = 30, heightB = 30;
    public JTextField OperarTF1, OperarTF2, OperarTF3, ConvertTF1, ConvertTF2;
    public JButton buttonS, buttonR, buttonC,buttonM,buttonD;
    private AbstractFactory accion;
    public Validar val = new Validar();
    public Ventana() {
        this.OperarTF1 = new JTextField();
        OperarTF1.setBounds(new Rectangle(20, 15, widthTF, heightTF));

        this.OperarTF2 = new JTextField();
        OperarTF2.setBounds(new Rectangle(20, 65, widthTF, heightTF));

        this.OperarTF3 = new JTextField();
        OperarTF3.setBounds(new Rectangle(20, 125, widthTF, heightTF));

        this.ConvertTF1 = new JTextField();
        ConvertTF1.setBounds(new Rectangle(210, 55, widthTF, heightTF));

        this.ConvertTF2 = new JTextField();
        ConvertTF2.setBounds(new Rectangle(210, 125, widthTF, heightTF));

        this.buttonS = new JButton("Sumar");
        buttonS.setBounds(new Rectangle(35, 185, widthB - 10, heightB));

        this.buttonR = new JButton("Restar");
        buttonR.setBounds(new Rectangle(35, 215, widthB - 10, heightB));
        
        this.buttonM = new JButton("Multiplicar");
        buttonM.setBounds(new Rectangle(35, 245, widthB - 10, heightB));
        
        this.buttonD = new JButton("Dividir");
        buttonD.setBounds(new Rectangle(35, 275, widthB - 10, heightB));

        this.buttonC = new JButton("A binario");
        buttonC.setBounds(new Rectangle(225, 200, widthB - 10, heightB));

        val.soloNumeros(OperarTF1);
        val.soloNumeros(OperarTF2);
        OperarTF3.setEditable(false);
        val.soloNumeros(ConvertTF1);
        ConvertTF2.setEditable(false);

        buttonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Integer suma = Integer.parseInt(textF1.getText())+Integer.parseInt(textF2.getText());
                accion = FactoryProducer.getFactory("Operar");
                Operar suma = accion.Operar("Sumar");
                if (!OperarTF1.getText().equals("") && !OperarTF2.getText().equals("")) {
                    Float a = suma.operacion(Float.parseFloat(OperarTF1.getText()), Float.parseFloat(OperarTF2.getText()));
                    OperarTF3.setText(a.toString());
                }
            }
        });

        buttonR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Integer suma = Integer.parseInt(textF1.getText())+Integer.parseInt(textF2.getText());
                accion = FactoryProducer.getFactory("Operar");
                Operar resta = accion.Operar("Restar");
                if (!OperarTF1.getText().equals("") && !OperarTF2.getText().equals("")) {
                    Float a = resta.operacion(Float.parseFloat(OperarTF1.getText()), Float.parseFloat(OperarTF2.getText()));
                    OperarTF3.setText(a.toString());
                }
            }
        });
        
        buttonM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Integer suma = Integer.parseInt(textF1.getText())+Integer.parseInt(textF2.getText());
                accion = FactoryProducer.getFactory("Operar");
                Operar multiplicar = accion.Operar("Multiplicar");
                if (!OperarTF1.getText().equals("") && !OperarTF2.getText().equals("")) {
                    Float a = multiplicar.operacion(Float.parseFloat(OperarTF1.getText()), Float.parseFloat(OperarTF2.getText()));
                    OperarTF3.setText(a.toString());
                }
            }
        });
        
        buttonM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Integer suma = Integer.parseInt(textF1.getText())+Integer.parseInt(textF2.getText());
                accion = FactoryProducer.getFactory("Operar");
                Operar operar = accion.Operar("Multiplicar");
                if (!OperarTF1.getText().equals("") && !OperarTF2.getText().equals("")) {
                    Float a = operar.operacion(Float.parseFloat(OperarTF1.getText()), Float.parseFloat(OperarTF2.getText()));
                    OperarTF3.setText(a.toString());
                }
            }
        });
        
        
        buttonD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Integer suma = Integer.parseInt(textF1.getText())+Integer.parseInt(textF2.getText());
                accion = FactoryProducer.getFactory("Operar");
                Operar operar = accion.Operar("Dividir");
                if (!OperarTF1.getText().equals("") && !OperarTF2.getText().equals("")) {
                    Float a = operar.operacion(Float.parseFloat(OperarTF1.getText()), Float.parseFloat(OperarTF2.getText()));
                    OperarTF3.setText(a.toString());
                }
            }
        });

        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Integer suma = Integer.parseInt(textF1.getText())+Integer.parseInt(textF2.getText());
                accion = FactoryProducer.getFactory("Convertir");
                Convertir bin = accion.Convertir("Binario");

                if (!ConvertTF1.getText().equals("")) {

                    String a = bin.aBinario((int) Float.parseFloat(ConvertTF1.getText()));
                    ConvertTF2.setText(a);

                }

            }

        });

        add(OperarTF1);
        add(OperarTF2);
        add(OperarTF3);
        add(ConvertTF1);
        add(ConvertTF2);
        add(buttonS);
        add(buttonR);
        add(buttonM);
        add(buttonD);
        add(buttonC);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

}
