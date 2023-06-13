/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabean;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Rishan
 */
public class Bean1 extends JLabel implements Serializable{
    
    public Bean1()
    {  
        //Set JLabel layout as BorderLayout
        setLayout(new BorderLayout());
        //Set JLabel background image
        setIcon(new ImageIcon(getClass().getResource("/Memory Analyser Background.png")));
        //Set JLabel layout as FlowLayout
        setLayout(new FlowLayout());
        //Set JLabel preferred size
        setPreferredSize(new Dimension(650,450));
        //Set JLabel as opaque
        setOpaque(true);
    }
    
}
