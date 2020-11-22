package com.company;
/**
 * This Class makes a calculator
 * @author Tanya Djavaherpour
 * @version 1.0 2020
 */

import javax.swing.*;
import java.awt.event.*;

public class Calculator {
    //main template
    protected CalculatorGUI calculatorGUI;

    /**
     * Creates a new calculator
     */
    public Calculator()
    {
        calculatorGUI = new CalculatorGUI();
    }

    /**
     * Sets makes a new button
     * @param str as button name
     */
    public void setNewButton(String str)
    {
        JButton btn = new JButton(str);
        btn.setToolTipText("This button is: " + str);
        calculatorGUI.setButton(btn);
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                calculatorGUI.addByMouse(str);
            }
        });
        btn.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                calculatorGUI.addByKey(e.getKeyChar());
            }
        });
    }

    /**
     * Sets buttons of calculator
     */
    public void setButton()
    {
        calculatorGUI.setScrollPane();
        for (int i = 1; i <= 9; i++)
            setNewButton("" + i);
        setNewButton("+");
        setNewButton("0");
        setNewButton("-");
        setNewButton("*");
        setNewButton("=");
        setNewButton("/");
    }

    /**
     * Gets template of calculator
     * @return calculatorGUI
     */
    public CalculatorGUI getCalculatorGUI()
    {
        return calculatorGUI;
    }

}
