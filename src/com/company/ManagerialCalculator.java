package com.company;

import javax.swing.*;
/**
 * This class is a subclass for calculator and makes a managerial calculator.
 * @author Tanya Djavaherpour
 * @version 1.0 2020
 */

public class ManagerialCalculator extends Calculator{
    /**
     * Creates a new managerial calculator
     */
    public ManagerialCalculator()
    {
        super();
    }

    /**
     * Sets makes a new button
     * @param str as button name
     */
    @Override
    public void setNewButton(String str)
    {
        super.setNewButton(str);

    }

    /**
     * Sets keyboard & buttons of calculator
     */
    @Override
    public void setButton()
    {
        calculatorGUI.setKeyboardPanel(6, 3);
        super.setButton();
    }

    /**
     * Gets template of calculator
     * @return calculatorGUI
     */
    @Override
    public CalculatorGUI getCalculatorGUI()
    {
        return super.getCalculatorGUI();
    }

}
