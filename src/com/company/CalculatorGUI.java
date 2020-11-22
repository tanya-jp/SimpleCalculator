package com.company;

/**
 * This class makes a new template.
 * @author Tanya Djavaherpour
 * @version 1.0 2020
 */

import javax.swing.*;
import java.awt.*;
import java.security.PrivateKey;

public class CalculatorGUI {
    JFrame calcFrame;
    JPanel keyboardPanel;
    JTextArea display;
    JScrollPane scrollPane;

    /**
     * Constructor of this class which makes a new GUI
     */
    public CalculatorGUI()
    {
        display = new JTextArea();
        display.setToolTipText("Entered numbers");
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
    public void setScrollPane()
    {
        scrollPane = new JScrollPane(display);
        display.setEditable(false);
        display.setFont(new Font("Arial", 14,14));
        scrollPane.setSize(200, 100);
        scrollPane.setLocation(50,20);
        calcFrame.add(scrollPane);
    }

    /**
     * Adds clicked button to display
     * @param button as clicked button
     */
    public void addByMouse(String  button)
    {
        display.append(button);
    }

    public void addByKey(char button)
    {
        display.append(String.valueOf(button));
    }

    /**
     * Returns Scroll pane
     * @return scroll pane
     */
    public JScrollPane getScrollPane()
    {
        return scrollPane;
    }

    /**
     * Returns the frame of calculator
     * @return calcFrame
     */
    public JFrame getCalcFrame()
    {
        return calcFrame;
    }

    /**
     * Returns display
     * @return display
     */
    public JTextArea  getDisplay()
    {
        return display;
    }



}
