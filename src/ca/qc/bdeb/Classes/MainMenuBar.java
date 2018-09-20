/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.Classes;

import java.awt.Component;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author 1722807
 */
public class MainMenuBar extends JMenu{
    private JMenuBar menu;
    private JMenu menu1;
    private JMenuItem menu2, menu3;
    
    public MainMenuBar(){
        menu = new JMenuBar();
        menu1 = new JMenu("Menu");
        
        menu2 = new JMenuItem("Demarrer");
        menu3 = new JMenuItem("Quitter");
        
        menu1.add(menu2);
        //menu1.addSeparator();
        menu1.add(menu3);
        menu.add(menu1);
        
        menu3.addActionListener(e -> {
        if (e.getActionCommand().equals("Quitter")){
           int reply = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit?", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
        }
        });
    }

    public JMenuBar getMenu() {
        return menu;
    }
}