/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javax.swing.*;

/**
 *
 * @author lenovo
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();
         obj.setBounds(10,10,700,600);
         obj.setTitle("Breakout Ball"); 
         obj.setResizable(false);
         obj.setVisible(true);
         obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         obj.add(gameplay);
    }
    
}
