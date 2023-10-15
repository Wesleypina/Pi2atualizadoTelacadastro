/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi2semestre;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JTextField;

/**
 *
 * @author DomiU
 */
public class JTextFieldRedondo extends JTextField {

    public JTextFieldRedondo() {
        this.setOpaque(false);
        this.setPreferredSize(new Dimension(660,35));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D gd2 = (Graphics2D) g;        
        gd2.setColor(Color.BLACK);
        gd2.drawRoundRect(0, 0, this.getWidth()-1, this.getHeight()-1, 40, 40);
        
    }
    
    
    
    
    
}
