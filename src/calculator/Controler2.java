/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Stack;
import structures.MyQueue;
import structures.MyStack;

/**
 *
 * @author lenovo
 */
public class Controler2 extends JPanel {

    private JButton cot, ln, tan, egale, par1, par2, delete, add, sub, mul, div, clear, sin, cos, log, pow, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b10;
    private Expr expr;
    private MyStack<String> stack;
    private MyStack<Double> valeurs;
    private MyQueue<String> calc;

    public Controler2(Expr expr) {
        super();
        clean();
        this.expr = expr;
        this.egale = new JButton("=");
        this.add = new JButton("+");
        this.sub = new JButton("-");
        this.mul = new JButton("*");
        this.div = new JButton("/");
        this.clear = new JButton("clear");
        this.sin = new JButton("sin");
        this.cos = new JButton("cos");
        this.log = new JButton("log");
        this.tan = new JButton("tan");
        this.cot = new JButton("cot");
        this.ln = new JButton("ln");
        this.pow = new JButton("^");
        this.b1 = new JButton("1");
        this.b0 = new JButton("0");
        this.b2 = new JButton("2");
        this.b3 = new JButton("3");
        this.b4 = new JButton("4");
        this.b5 = new JButton("5");
        this.b6 = new JButton("6");
        this.b7 = new JButton("7");
        this.b8 = new JButton("8");
        this.b9 = new JButton("9");
        this.b10 = new JButton(".");
        this.delete = new JButton("del");
        this.par1 = new JButton("(");
        this.par2 = new JButton(")");

        setLayout(new GridLayout(7, 1));
        refresher();
        JPanel boutons1 = new JPanel();
        JPanel boutons2 = new JPanel();
        JPanel boutons3 = new JPanel();
        JPanel boutons4 = new JPanel();
        JPanel boutons5 = new JPanel();
        JPanel boutons6 = new JPanel();
        JPanel boutons7 = new JPanel();
        boutons1.setLayout(new FlowLayout());
        boutons2.setLayout(new FlowLayout());

        class AL implements ActionListener {

            @Override
            @SuppressWarnings("empty-statement")
            public void actionPerformed(ActionEvent ae) {
                if ("clear".equals(ae.getActionCommand())) {
                    try {
                        expr.empty();
                        refresher();

                    } catch (Exception e) {
                    }
                }
                if ("del".equals(ae.getActionCommand())) {
                    try {
                        expr.popp();
                    } catch (Exception e) {
                    }
                }

                if ("=".equals(ae.getActionCommand()) || "(".equals(ae.getActionCommand()) || ")".equals(ae.getActionCommand()) || "+".equals(ae.getActionCommand()) || "-".equals(ae.getActionCommand()) || "*".equals(ae.getActionCommand()) || "/".equals(ae.getActionCommand()) || "sin".equals(ae.getActionCommand()) || "cos".equals(ae.getActionCommand()) || "log".equals(ae.getActionCommand()) || "tan".equals(ae.getActionCommand()) || "cot".equals(ae.getActionCommand()) || "ln".equals(ae.getActionCommand()) || "^".equals(ae.getActionCommand()) || "0".equals(ae.getActionCommand()) || "1".equals(ae.getActionCommand()) || "2".equals(ae.getActionCommand()) || "3".equals(ae.getActionCommand()) || "4".equals(ae.getActionCommand()) || "5".equals(ae.getActionCommand()) || "6".equals(ae.getActionCommand()) || "7".equals(ae.getActionCommand()) || "8".equals(ae.getActionCommand()) || "9".equals(ae.getActionCommand()) || ".".equals(ae.getActionCommand())) {
                    if ("=".equals(ae.getActionCommand())) {
                        String myexpression = fix(expr);
                        String answ = evaluation(myexpression);
                        JOptionPane.showMessageDialog(null, answ);
                        expr.getStack().clear();
                    }
                    if ("(".equals(ae.getActionCommand())) {
                        expr.add("(");
                    }
                    if (")".equals(ae.getActionCommand())) {
                        expr.add(")");
                    }

                    if ("+".equals(ae.getActionCommand())) {
                        expr.add("+");
                    }
                    if ("1".equals(ae.getActionCommand())) {
                        expr.add("1");
                    }
                    if ("0".equals(ae.getActionCommand())) {
                        expr.add("0");
                    }
                    if ("2".equals(ae.getActionCommand())) {
                        expr.add("2");
                    }
                    if ("3".equals(ae.getActionCommand())) {
                        expr.add("3");
                    }
                    if ("4".equals(ae.getActionCommand())) {
                        expr.add("4");
                    }
                    if ("5".equals(ae.getActionCommand())) {
                        expr.add("5");
                    }
                    if ("6".equals(ae.getActionCommand())) {
                        expr.add("6");
                    }
                    if ("7".equals(ae.getActionCommand())) {
                        expr.add("7");
                    }
                    if ("8".equals(ae.getActionCommand())) {
                        expr.add("8");
                    }
                    if ("9".equals(ae.getActionCommand())) {
                        expr.add("9");
                    }
                    if (".".equals(ae.getActionCommand())) {
                        expr.add(".");
                    }
                    if ("-".equals(ae.getActionCommand())) {
                        expr.add("-");
                    }
                    if ("*".equals(ae.getActionCommand())) {
                        expr.add("*");
                    }
                    if ("/".equals(ae.getActionCommand())) {
                        expr.add("/");
                    }
                    if ("sin".equals(ae.getActionCommand())) {
                        expr.add("sin");
                        expr.add("(");
                    }
                    if ("cos".equals(ae.getActionCommand())) {
                        expr.add("cos");
                        expr.add("(");
                    }
                    if ("log".equals(ae.getActionCommand())) {
                        expr.add("log");
                        expr.add("(");
                    }
                    if ("tan".equals(ae.getActionCommand())) {
                        expr.add("tan");
                        expr.add("(");
                    }
                    if ("cot".equals(ae.getActionCommand())) {
                        expr.add("cot");
                        expr.add("(");
                    }
                    if ("ln".equals(ae.getActionCommand())) {
                        expr.add("ln");
                        expr.add("(");
                    }

                    if ("^".equals(ae.getActionCommand())) {
                        expr.add("^");
                    }
                }
                refresher();

            }
        }

        AL al = new AL();

        boutons1.add(clear);
        boutons1.add(delete);

        boutons2.add(b7);
        boutons2.add(b8);
        boutons2.add(b9);
        boutons2.add(par1);
        boutons2.add(par2);

        boutons3.add(b4);
        boutons3.add(b5);
        boutons3.add(b6);
        boutons3.add(add);
        boutons3.add(sub);

        boutons4.add(b1);
        boutons4.add(b2);
        boutons4.add(b3);
        boutons4.add(div);
        boutons4.add(mul);

        boutons5.add(b0);
        boutons5.add(b10);
        boutons5.add(pow);
        boutons5.add(egale);

        boutons6.add(sin);
        boutons6.add(cos);
        boutons6.add(log);

        boutons7.add(cot);
        boutons7.add(tan);
        boutons7.add(ln);

        add.addActionListener(al);
        sub.addActionListener(al);
        mul.addActionListener(al);
        div.addActionListener(al);
        par1.addActionListener(al);
        par2.addActionListener(al);
        sin.addActionListener(al);
        cos.addActionListener(al);
        log.addActionListener(al);
        cot.addActionListener(al);
        tan.addActionListener(al);
        ln.addActionListener(al);
        pow.addActionListener(al);
        clear.addActionListener(al);
        b0.addActionListener(al);
        b1.addActionListener(al);
        b2.addActionListener(al);
        b3.addActionListener(al);
        b4.addActionListener(al);
        b5.addActionListener(al);
        b6.addActionListener(al);
        b7.addActionListener(al);
        b8.addActionListener(al);
        b9.addActionListener(al);
        b10.addActionListener(al);
        delete.addActionListener(al);
        egale.addActionListener(al);

        add(boutons1);
        add(boutons2);
        add(boutons3);
        add(boutons4);
        add(boutons5);
        add(boutons6);
        add(boutons7);

        refresher();

    }

    //tertib klshi bma7alu
    private String next(String exp) {
        int it = 0;
        String str = "";
        char current = exp.charAt(0);

        //to get the whole number
        while (current == '1' || current == '.' || current == '0' || current == '2' || current == '3' || current == '4' || current == '5' || current == '6' || current == '7' || current == '8' || current == '9') {
            str = str + current;
            it++;
            if (it < exp.length()) {
                current = exp.charAt(it);
            } else {
                break;
            }
        }

        //case 1: number
        if (it > 0) {
            calc.enqueue(str);
            return exp.substring(it);
        }

        // case 2 : function
        while (Character.isAlphabetic(current)) {
            str += current;
            it++;
            if (it < exp.length()) {
                current = exp.charAt(it);
            } else {
                break;
            }
        }
        if (it > 0) {
            stack.push(str);
            return exp.substring(it);
        }

        //case 3 : operator
        if (current == '^' ||current == '*' || current == '/' || current == '+' || current == '-') {
            while (!stack.isEmpty() // stack isn't empty
                    /*may need to be fixed*/ && (stack.peek().equals("*") || stack.peek().equals("-") || stack.peek().equals("+") || stack.peek().equals("/")) // item on stack is an operator
                    && ((precedence(((String) stack.peek()).charAt(0)) > precedence(current) // lower or equal precedence and
                    && current == '^'))) {//maskuk b amra
                calc.enqueue(stack.pop()); // move the operator from the stack to the calc
            }
            stack.push(Character.toString(current));// yemken mafi de3i 7awela
            return exp.substring(it + 1);
        }

        // if (
        if (current == '(') {
            stack.push(Character.toString(current));
            return exp.substring(it + 1);
        }

        if (current == ')') {

            while (!stack.peek().equals("(")) { // keep going until we find (
                calc.enqueue(stack.pop()); // move an operator from the stack to the calc
            }

            stack.pop(); // remove (

            if (!stack.isEmpty() && (((String) stack.peek()).equals("cot") || ((String) stack.peek()).equals("tan") || ((String) stack.peek()).equals("ln") || ((String) stack.peek()).equals("sin") || ((String) stack.peek()).equals("cos") || ((String) stack.peek()).equals("log"))) { // if next item is a function call
                calc.enqueue(stack.pop()); // move it to the calc
            }

            return exp.substring(it + 1);
        }
        return "exception dk what";

    }

    private void postfix(String infix_expr) throws Exception {
        while (infix_expr.length() > 0) {
            infix_expr = next(infix_expr);
        }
        while (!stack.isEmpty()) {
            if (stack.peek().equals("(")) {
                throw new Exception("Mismatched Parentheses.");
            }
            if ('+' != (((String) stack.peek()).charAt(0)) && '^' != (((String) stack.peek()).charAt(0)) && '/' != (((String) stack.peek()).charAt(0)) && '*' != (((String) stack.peek()).charAt(0)) && '-' != (((String) stack.peek()).charAt(0))) {
                throw new Exception("Invalid Expression.");
            }

            calc.enqueue(stack.pop());
        }
    }

    private String evaluation(String s) {
        clean();
        try {
            postfix(s);
            return calcul();
        } catch (Exception e) {
            return "exception";
        }
    }

    private String calcul() {
        while (!calc.isEmpty()) {
            String current = (String) calc.dequeue();

            if (current.equals("cot") || current.equals("tan") || current.equals("ln") || current.equals("sin") || current.equals("cos") || current.equals("log")) { // if we just need one number

                // calculer1
                valeurs.push(calculer1(current, (double) valeurs.pop()));
            } else if (current.equals("^") || current.equals("*") || current.equals("/") || current.equals("-") || current.equals("+")) { // if we nned 2 numbers
                // calculer2 //mashkuk b amra
                valeurs.push(calculer2(current, (double) valeurs.pop(), (double) valeurs.pop()));
            } else { // number
                valeurs.push(Double.parseDouble(current));
            }
        }

        return valeurs.pop().toString();
    }

    public void refresher() {

        if (expr.getStack().empty()) {
            b0.setEnabled(true);
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            cot.setEnabled(true);
            tan.setEnabled(true);
            ln.setEnabled(true);
            sin.setEnabled(true);
            cos.setEnabled(true);
            log.setEnabled(true);
            par1.setEnabled(true);
            egale.setEnabled(false);
            delete.setEnabled(false);
            clear.setEnabled(false);
            b10.setEnabled(false);
            add.setEnabled(false);
            div.setEnabled(false);
            pow.setEnabled(false);
            mul.setEnabled(false);
            par2.setEnabled(false);
        } else {
            try {

                String str = (String) expr.top();
               // System.out.print(str);

                //what can we have after (
                if ("(".equals(str)) {
                    cot.setEnabled(true);
                    tan.setEnabled(true);
                    ln.setEnabled(true);
                    b1.setEnabled(true);
                    b0.setEnabled(true);
                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);
                    b7.setEnabled(true);
                    par1.setEnabled(true);
                    sin.setEnabled(true);
                    cos.setEnabled(true);
                    log.setEnabled(true);
                    sub.setEnabled(true);
                    add.setEnabled(false);
                    mul.setEnabled(false);
                    pow.setEnabled(false);
                    div.setEnabled(false);
                    par2.setEnabled(false);

                }
                //what can we have after )

                if (")".equals(str)) {
                    b1.setEnabled(false);
                    b0.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b7.setEnabled(false);
                    par1.setEnabled(true);
                    sin.setEnabled(false);
                    cos.setEnabled(false);
                    log.setEnabled(false);
                    cot.setEnabled(false);
                    tan.setEnabled(false);
                    ln.setEnabled(false);
                    sub.setEnabled(true);
                    add.setEnabled(true);
                    mul.setEnabled(true);
                    pow.setEnabled(true);
                    div.setEnabled(true);
                    par2.setEnabled(true);
                    par1.setEnabled(false);
                }

                //what can we have after operations
                if ( "*".equals(str) || "/".equals(str)  || "^".equals(str)) {
                    div.setEnabled(false);
                    sub.setEnabled(false);
                    add.setEnabled(false);
                    mul.setEnabled(false);
                    pow.setEnabled(false);
                    b10.setEnabled(false);
                    delete.setEnabled(true);
                    clear.setEnabled(true);
                    b1.setEnabled(true);
                    b0.setEnabled(true);
                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);
                    b7.setEnabled(true);
                    egale.setEnabled(false);
                    sin.setEnabled(true);
                    cos.setEnabled(true);
                    log.setEnabled(true);
                    cot.setEnabled(true);
                    tan.setEnabled(true);
                    ln.setEnabled(true);
                    par1.setEnabled(true);
                    par2.setEnabled(false);

                }
                
                 if ("+".equals(str) || "-".equals(str) ) {
                    div.setEnabled(false);
                    sub.setEnabled(true);
                    add.setEnabled(false);
                    mul.setEnabled(false);
                    pow.setEnabled(false);
                    b10.setEnabled(false);
                    delete.setEnabled(true);
                    clear.setEnabled(true);
                    b1.setEnabled(true);
                    b0.setEnabled(true);
                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);
                    b7.setEnabled(true);
                    egale.setEnabled(false);
                    sin.setEnabled(true);
                    cos.setEnabled(true);
                    log.setEnabled(true);
                    cot.setEnabled(true);
                    tan.setEnabled(true);
                    ln.setEnabled(true);
                    par1.setEnabled(true);
                    par2.setEnabled(false);

                }

                //what can we have after functions
                if ("sin".equals(str) || "ln".equals(str) || "tan".equals(str) || "cot".equals(str) || "cos".equals(str) || "log".equals(str)) {
                    div.setEnabled(false);
                    sub.setEnabled(false);
                    add.setEnabled(false);
                    mul.setEnabled(false);
                    pow.setEnabled(false);
                    b10.setEnabled(false);
                    delete.setEnabled(true);
                    clear.setEnabled(true);
                    b1.setEnabled(false);
                    b0.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b7.setEnabled(false);
                    egale.setEnabled(false);
                    sin.setEnabled(false);
                    cos.setEnabled(false);
                    log.setEnabled(false);
                    cot.setEnabled(false);
                    tan.setEnabled(false);
                    ln.setEnabled(false);
                    par1.setEnabled(true);
                    par2.setEnabled(false);

                }

                //what can we have after a number
                if ("1".equals(str) || "2".equals(str) || "3".equals(str) || "4".equals(str) || "5".equals(str) || "6".equals(str) || "7".equals(str) || "8".equals(str) || "9".equals(str) || "0".equals(str)) {
                    b1.setEnabled(true);
                    b0.setEnabled(true);
                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);
                    b7.setEnabled(true);
                    div.setEnabled(true);
                    pow.setEnabled(true);
                    sub.setEnabled(true);
                    add.setEnabled(true);
                    mul.setEnabled(true);
                    b10.setEnabled(true);
                    delete.setEnabled(true);
                    clear.setEnabled(true);
                    b10.setEnabled(true);
                    egale.setEnabled(true);
                    ln.setEnabled(false);
                    tan.setEnabled(false);
                    cot.setEnabled(false);
                    sin.setEnabled(false);
                    cos.setEnabled(false);
                    log.setEnabled(false);
                    par1.setEnabled(false);
                    par2.setEnabled(true);

                }

                //to not allow = if we have ( not closed and not complete expression
                Stack h = expr.getStack();
                if (h.contains("(")) {
                    int n1 = 0;
                    int n2 = 0;

                    for (int i = 0; i < h.size(); i++) {
                        if (h.get(i).equals("(")) {
                            n1++;
                        }
                        if (h.get(i).equals(")")) {
                            n2++;
                        }
                    }

                    if (n1 != n2 || "+".equals(str) || "*".equals(str) || "/".equals(str) || "-".equals(str) || "^".equals(str) || ".".equals(str)) {
                        egale.setEnabled(false);

                    } else {
                        egale.setEnabled(true);
                    }
                }
                //to not allow 00 in the beginning
                if ((("0").equals(str) && expr.toString().length() == 1)) {
                    b1.setEnabled(false);
                    b0.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b7.setEnabled(false);

                }
                //what can we hav after .
                if (".".equals(str)) {
                    b1.setEnabled(true);
                    b0.setEnabled(true);
                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);
                    b7.setEnabled(true);
                    par1.setEnabled(false);
                    sin.setEnabled(false);
                    cos.setEnabled(false);
                    log.setEnabled(false);
                    ln.setEnabled(false);
                    tan.setEnabled(false);
                    cot.setEnabled(false);
                    sub.setEnabled(false);
                    add.setEnabled(false);
                    mul.setEnabled(false);
                    pow.setEnabled(false);
                    div.setEnabled(false);
                    par2.setEnabled(false);
                }

                //to not allow two .. in one number
                String v = expr.toString();
                if (v.contains(".")) {
                    String vv = v.substring(v.indexOf("."));
                    if (!vv.contains("+") && !vv.contains("*") && !vv.contains("/") && !vv.contains("-") && !vv.contains("^")) {
                        b10.setEnabled(false);
                        b1.setEnabled(true);
                        b0.setEnabled(true);
                        b2.setEnabled(true);
                        b3.setEnabled(true);
                        b4.setEnabled(true);
                        b5.setEnabled(true);
                        b6.setEnabled(true);
                        b8.setEnabled(true);
                        b9.setEnabled(true);
                        b7.setEnabled(true);
                    } else {
                        b10.setEnabled(true); //needs fix disable when we don't have a number
                    }
                }

            } catch (Exception e) {
            }
        }

    }

    // source: https://en.wikipedia.org/wiki/Order_of_operations
    public static int precedence(char operator) {
        int pre;
        switch (operator) {
            case '^':
                pre = 7;
                break;
            case '*':
            case '/':
                pre = 6;
                break;
            case '+':
            case '-':
                pre = 5;
                break;

            default:
                pre = 0;
                break;
        }
        return pre;
    }

    public static double calculer1(String fonction, double a) {
        double value = 0;
        switch (fonction) {
            case "sin":
                value = Math.sin(a);
                break;
            case "cos":
                value = Math.cos(a);
                break;
            case "tan":
                value = Math.tan(a);
                break;
            case "cot":
                value = 1.0 / Math.tan(a);
                break;
            case "log":
                value = Math.log10(a);
                break;
            default:
                break;
        }
        return value;
    }

    public static double calculer2(String operator, double b, double a) {
        double value = 0;
        switch (operator) {
            case "^":
                value = Math.pow(a, b);
                break;

            case "*":
                value = a * b;
                break;
            case "/":
                value = a / b;
                break;
            case "+":
                value = a + b;
                break;
            case "-":
                value = a - b;
                break;
            default:
                break;
        }
        return value;
    }

    private void clean() {
        if (stack == null || !stack.isEmpty()) {
            stack = new MyStack<>();
        }
        if (valeurs == null || !valeurs.isEmpty()) {
            valeurs = new MyStack<>();
        }
        if (calc == null || !calc.isEmpty()) {
            calc = new MyQueue<>();
        }
    }

    public String fix(Expr expr) {
        Stack s = expr.getStack();
        if (s.get(0) == "-") {
            s.add(0, "0");
        }
        String n = "";
        for (int i = 1; i < s.size(); i++) {
            n = (String) s.get(i);

            if (n == "-") {
                if (s.get(i - 1) == "(" ||s.get(i - 1) == "+" || s.get(i - 1) == "-") {
                    s.add(i, "0");
                }
            }
        }
        String ret = "";
        for (int j = 0; j< s.size(); j++) {
            ret = ret+(String) s.get(j);
        }

        return ret;
    }

}
