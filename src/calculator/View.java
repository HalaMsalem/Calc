/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

public class View extends JPanel implements Observer {

    private JLabel etatStack;
    private Expr expr;

    public View(Expr expr) {
        super();
        this.expr = expr;
        this.etatStack = new JLabel("");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(etatStack);
        setBackground(Color.CYAN);
        // inscription of the model as observater
        expr.addObserver(this);
    }
    
    @Override
    public void update(Observable obs, Object arg) {
        etatStack.setText(expr.toString()); // obs.toString()
        
    }
}
