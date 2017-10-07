/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresasalones;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Johan Castillo
 */
public class Listar extends JFrame{
    
    
    JTextArea area,area2,area3,area4; 
    JPanel panel;
    public Listar()
    {
    this.setTitle("EMPRESA DE EVENTOS STEVENJET");
    this.setBounds(1000, 10    , 880, 1000);
    this.setVisible(true);    
    
    panel= new JPanel();
    panel.setBackground(Color.orange);
        this.add(panel);
        panel.setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        
        area = new JTextArea("");
        panel.add(area);
        area.setBounds(10, 10, 200, 900);
        
        area2 = new JTextArea();
        panel.add(area2);
        area2.setBounds(220, 10, 200, 900);
        
        area3 = new JTextArea();
        panel.add(area3);
        area3.setBounds(430, 10, 200, 900);
        
        area4 = new JTextArea();
        panel.add(area4);
        area4.setBounds(640, 10, 200, 900);
        
                
   }
}
