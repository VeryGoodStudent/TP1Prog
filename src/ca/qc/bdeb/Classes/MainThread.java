/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.Classes;

import java.awt.GridLayout;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 1722807
 */
public class MainThread extends Thread{
   private Thread  UnThread ;
   private Timer timer1;
    private JPanel panel1;
    private GridLayout g1;
    private JLabel labels[];
    private MainThread thread;
   
   public MainThread ( ) {
        //....initialisations éventuelles du constructeur de MaClasse
        
        
            
        UnThread = new Thread ( this , "thread secondaire" );
        UnThread.start(); 
   }
   
   public void run ( ) {
       this.panel1 = new JPanel(g1);
       
//       while(true)  {
//           
//       }
        //....actions du thread secondaire ici
        for ( int i =1; i <100; i ++)
            this.g1 = new GridLayout(5 ,5, 1, 1);
            
        
            labels = new JLabel[25];
            ImageIcon noir = new ImageIcon("noir.png");
            for (int i =  0; i < 25; i++){
                labels[i] = new JLabel(noir);
                
                panel1.add(labels[i]);
            }
            this.thread = new MainThread();  
        
            this.timer1 = new Timer();
            timer1.schedule(new TimerTask() {
                @Override
                public void run() {
                    ImageIcon blanc = new ImageIcon("blanc.png");
                    Random rand = new Random(25);
                    int carre = rand.nextInt();
            
                    labels[carre] = new JLabel(blanc);
                    panel1.add(labels[carre]);
                }
            }, 8000, 4000);
   }
   
   public Thread getMainThread(){
       return UnThread;
   }
   
   public JPanel getPanel() {
        return this.panel1;
    }
}



