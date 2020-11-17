package com.company;
/**
 * This class is a subclass for ManagerialCalculator and makes a managerial calculator type2.
 * @author Tanya Djavaherpour
 * @version 1.0 2020
 */
public class ManagerialCalculator2 extends ManagerialCalculator{
    /**
     * Creates a new managerial calculator type2.
     */
    public ManagerialCalculator2()
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
     * Sets buttons of calculator
     */
    @Override
    public void setButton()
    {
        super.setButton();
        setNewButton("cos");
        setNewButton("cot");
        setNewButton("log");
        setNewButton("e");
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
