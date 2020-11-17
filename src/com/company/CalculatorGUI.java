package com.company;

/**
 * This class makes a new template.
 * @author Tanya Djavaherpour
 * @version 1.0 2020
 */

import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    JFrame calcFrame;
    JPanel keyboardPanel;

    /**
     * Constructor of this class which makes a new GUI
     */
    public CalculatorGUI()
    {
        calcFrame = new JFrame();
        keyboardPanel = new JPanel();
        calcFrame.setTitle("Calculator");
        calcFrame.setSize(800,800);
        calcFrame.setLocation(200,100);
        calcFrame.setLayout(null);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Sets keyboard
     * @param xGrids as number of x cells
     * @param yGrids as number of y cells
     */
    public void setKeyboardPanel(int xGrids, int yGrids)
    {
        keyboardPanel.setSize(300,300);
        keyboardPanel.setLocation(100,100);
        keyboardPanel.setLayout(new GridLayout(xGrids,yGrids));

        calcFrame.add(keyboardPanel);
    }

    /**
     *Returns keyboard pannel
     * @return keyboardPanel
     */
    public JPanel getKeyboardPanel()
    {
        return keyboardPanel;
    }

    /**
     * Adds buttons to keyboard pannel
     * @param btn
     */
    public void setButton(JButton btn)
    {
        keyboardPanel.add(btn);
    }

    /**
     * Adds a window with scroller to the main window.
     */
    public void displayGUI()
    {
        JTextArea display = new JTextArea();
        display.setEditable(false);
        display.setFont(new Font("Arial", 14,14));
        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setSize(200, 100);
        scrollPane.setLocation(50,20);
        for (int i = 0; i < 100; i++)
            display.append("I= "+ i);
        calcFrame.add(scrollPane);
    }

    /**
     * Returns the frame of calculator
     * @return calcFrame
     */
    public JFrame getCalcFrame()
    {
        return calcFrame;
    }



}
