package com.company;
/**
 * This Class makes a calculator
 * @author Tanya Djavaherpour
 * @version 1.0 2020
 */

import javax.swing.*;

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
        JButton btn = new JButton();
        btn.setText(str);
        calculatorGUI.setButton(btn);

    }

    /**
     * Sets buttons of calculator
     */
    public void setButton()
    {
        for (int i = 1; i <= 9; i++)
            setNewButton("" + i);
        setNewButton("+");
        setNewButton("0");
        setNewButton("=");
    }

    /**
     * Gets template of calculator
     * @return calculatorGUI
     */
    public CalculatorGUI getCalculatorGUI()
    {
        calculatorGUI.displayGUI();
        return calculatorGUI;
    }

}
