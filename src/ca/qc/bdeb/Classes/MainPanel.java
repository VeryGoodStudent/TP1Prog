/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.Classes;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author 1722807
 */
public final class MainPanel extends JPanel {
//   private JButton helloButton;
//    private JButton goodByeButton;
    private Timer timer1;
    private JPanel panel1;
    private GridLayout g1;
    private JLabel labels[];
    private MainThread thread;
    //private MainPanel textPanel;
    
    public MainPanel(){
        this.g1 = new GridLayout(5 ,5, 1, 1);
        this.panel1 = new JPanel(g1);
        ImageIcon noir = new ImageIcon("noir.png");
        
        labels = new JLabel[25];

        for (int i =  0; i < 25; i++){
              labels[i] = new JLabel(noir);
              panel1.add(labels[i]);
        }
          this.thread = new MainThread();  
          panel1.
//        
//        this.timer1 = new Timer();
//        timer1.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                ImageIcon blanc = new ImageIcon("blanc.png");
//                Random rand = new Random(25);
//                int carre = rand.nextInt();
//            
//                labels[carre] = new JLabel(blanc);
//                panel1.add(labels[carre]);
//            }
//        }, 8000, 4000);
  }
    
    
    
    
    
    
    
//        timer = new Timer(5000, new ActionListener() {
//            
//              
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               timer.stop();
//               Random rand = new Random(25);
//            int carre = rand.nextInt();
//            
//            labels[carre] = new JLabel(blanc);
//              panel1.add(labels[carre]);
//            }
//        });
//        timer.setInitialDelay(3000);
//        timer.start(); 
        
        
        
        
        
//        
//        
//       this.helloButton = new JButton("Hello");
//        goodByeButton = new JButton("Bye");
//        
//        helloButton.addActionListener(this);
//        goodByeButton.addActionListener(this);
//        
//        setLayout(new FlowLayout());
//        
//       add(helloButton);
//        add(goodByeButton);
//    }
//
//    public MainPanel getTextPanel() {
//        return textPanel;
//    }
//    
//    public void setTextPanel(MainPanel textPanel){
//        this.textPanel = textPanel;
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent event) {
//        JButton clicked = (JButton)event.getSource();
//        if (clicked == helloButton){
//            textPanel.appendText("Hello \n");
//            //System.out.println("hello");
//        }
//        else{
//            textPanel.appendText("Bye \n");
//            //System.out.println("bye");
//        }
//        //System.out.println("Les boutons ont ete cliques"); //To change body of generated methods, choose Tools | Templates.
//    }  

//    private void appendText(String bye_) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.


    public JPanel getPanel() {
        return thread.getPanel();
    }


    public TimerTask affichage() {
        ImageIcon blanc = new ImageIcon("blanc.png");
        Random rand = new Random(25);
            int carre = rand.nextInt();
            
            labels[carre] = new JLabel(blanc);
              panel1.add(labels[carre]);
        return null;

}
    
}
    
