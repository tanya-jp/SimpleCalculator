package com.company;
/**
 * This class matches all calculators together.
 * @author Tanya Djavaherpour
 * @vervion 1.0 2020
 */

import javax.swing.*;
public class AllCalculators {
    JFrame frame;
    Calculator calculator = new Calculator();
    NormalCalculator normalCalculator;
    ManagerialCalculator1 managerialCalculator1;
    ManagerialCalculator2 managerialCalculator2;

    /**
     * Creates new constructor
     */
    AllCalculators(){

        normalCalculator = new NormalCalculator();
        managerialCalculator1 = new ManagerialCalculator1();
        managerialCalculator2 = new ManagerialCalculator2();
        frame = calculator.getCalculatorGUI().getCalcFrame();

        normalCalculator.setButton();
        managerialCalculator1.setButton();
        managerialCalculator2.setButton();
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(250,400,300,300);
        tp.add("normal",normalCalculator.getCalculatorGUI().getKeyboardPanel());
        tp.add("managerial",managerialCalculator1.getCalculatorGUI().getKeyboardPanel());
        tp.add("managerial shift",managerialCalculator2.getCalculatorGUI().getKeyboardPanel());
        frame.add(tp);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
