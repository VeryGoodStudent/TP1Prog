/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.Classes;

import javax.swing.*;

/**
 *
 * @author 1722807
 */
public class MainFrame extends JFrame{
        private MainMenuBar menuBar;  
        private MainPanel panel;

public MainFrame() {
        super("TP1");
        this.menuBar = new MainMenuBar();
        this.panel = new MainPanel();
        setJMenuBar(menuBar.getMenu());
        add(panel.getPanel());
        
        setSize(500,500);
        setLocationRelativeTo(null);
        //pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setVisible(true);
    }  
    
}
