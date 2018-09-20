/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.Main;

import ca.qc.bdeb.Classes.MainFrame;
import javax.swing.*;

/**
 *
 * @author 1722807
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {Runnable run = new Runnable(){
            @Override
            public void run(){
                MainFrame mainFrame = new MainFrame();
            }
        };
        
        SwingUtilities.invokeLater(run);
        
        // TODO code application logic here
    }
    
}
