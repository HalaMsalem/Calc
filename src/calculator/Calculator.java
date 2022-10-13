/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.GridLayout;
import javax.swing.*;
import java.util.Observer;
import java.util.Observable;
import java.util.Stack;

/**
 *
 * @author lenovo
 */
public class Calculator extends JFrame{

    public Calculator() {
        Expr model= new Expr(new Stack());
        Controler2 controler= new Controler2(model);
        View view = new View(model);
        setLayout(new GridLayout(2,2));
        add(view);
        add(controler);
        pack();
        setLocation(100,100);
        setVisible(true);
        setSize(600, 600);
    }

 
    public static void main(String[] args) {
        new Calculator();    }
    
}
