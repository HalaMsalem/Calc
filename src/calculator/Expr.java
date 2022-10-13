package calculator;


import java.util.EmptyStackException;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Expr extends  java.util.Observable {
    private Stack stack;

    public Expr(Stack stack) {
        this.stack = stack;
    }

    public Stack getStack() {
        return stack;
    }
    
    
    public void add(String s) {
        stack.add(s);
        setChanged();
        notifyObservers(s);
    }
    
     public void popp() {
        stack.pop();
        setChanged();
        notifyObservers();
    }
    
    public void empty() throws EmptyStackException {
        stack.removeAllElements();   
        setChanged();
        notifyObservers();
    }
    
    public String top() throws EmptyStackException {
        return (String)stack.peek();
        
    }
    
    public String toString(){
        String expression="";
        for (int i=0;i<stack.size();i++){
            expression= expression+stack.get(i);
        }    
        return expression;
    }
}
