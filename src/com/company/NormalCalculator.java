package com.company;
/**
 * This class is a subclass for calculator and makes a normal calculator.
 * @author Tanya Djavaherpour
 * @version 1.0 2020
 */

import javax.swing.*;

public class NormalCalculator extends Calculator{

    /**
     * Creates a new normal calculator
     */
    public NormalCalculator()
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
        calculatorGUI.setKeyboardPanel(4, 3);
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
