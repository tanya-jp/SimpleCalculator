package com.company;
/**
 * This class matches all calculators together and sets menu.
 * @author Tanya Djavaherpour
 * @vervion 1.0 2020
 */

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

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
        frame.add(normalCalculator.getCalculatorGUI().getScrollPane());

        //Setting menu
        JMenuBar jMenuBar = new JMenuBar();
        JMenu menu = new JMenu("menu");
        jMenuBar.add(menu);
        JMenuItem copyMenu = new JMenuItem("copy");
        JMenuItem exitMenu = new JMenuItem("exit");
        exitMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exitMenu.setMnemonic('e');
        copyMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                normalCalculator.getCalculatorGUI().getDisplay().copy();
                StringSelection str = new StringSelection(normalCalculator.getCalculatorGUI().getDisplay().getText());
                Clipboard cl = Toolkit.getDefaultToolkit().getSystemClipboard();
                cl.setContents(str, null);
            }
        });
        copyMenu.setMnemonic('c');
        copyMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
        menu.add(copyMenu);
        menu.add(exitMenu);
        frame.setJMenuBar(jMenuBar);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
