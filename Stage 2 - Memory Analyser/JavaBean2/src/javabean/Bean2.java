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
public class Bean2 extends JMenuBar implements Serializable{

    //Declaration of memoryAnalyserIcon Icon
    private Icon memoryAnalyserIcon = new ImageIcon(getClass().getResource("/Memory Analyser Icon.png"));
    
    //Declaration of Options menu
    private JMenu optionsMenu;
    
    //Declarations of helpMenuItem, aboutMenuItem and exitMenuItem JMenuItem
    private JMenuItem helpMenuItem, aboutMenuItem, exitMenuItem;
    
    //Contents of the helpMenuItem
    private String helpStr = "MEMORY ANALYSER HELP"
            + "\n\nHow to Carry Out Memory Test?\n"
            + "\n"
            + ".      Set your desired font size for the contents.\n"
            + ".      Select Red, Green or Blue font colour for the contents.\n"
            + ".      Select number of seconds to view the contents.\n"
            + ".      Select Digits, Upper Case, Lower Case and/or Symbols as\n"
            + "       the string type for the contents.\n"
            + ".      Set your desired number of strings for the contents.\n"
            + ".      Set your desired length of strings for the contents.\n"
            + ".      After you had finalised your selection, then click\n"
            + "       'Start Test' button.\n"
            + ".      A window will pop up which will display random\n"
            + "       content of strings according to your selection.\n"
            + ".      Try to memorise all the displayed contents within the\n"
            + "       selected number of seconds.\n"
            + ".      You may click 'Finished' button if you had memorised the\n"
            + "       displayed content of strings before the selected number\n"
            + "       of seconds.\n"
            + ".      After that, the window will disappear and MemoryAnalyser\n "
            + "      Answer Form will appear. In this, try to select your\n"
            + "       memorised contents from the list.\n"
            + ".      Click '>>' button to select and '<<' button to deselect\n"
            + "       your memorised contents.\n"
            + ".      After you had finalised your selection, click 'Finished'\n"
            + "       button to check for the correct answers."
            + "\n\nCopyright © 2014 RichTech Solutions Pvt. Ltd.\n";
    
    //Contents of aboutMenuItem
    private String aboutStr = "ABOUT MEMORY ANALYSER"
            + "\n\nMemory Analyser is a program that people can use"
            + "\nto carry out psychological tests on their memory.\n"
            + "\nProgrammed by : Rishan bin Abdul Aziz."
            + "\n\nCopyright © 2014 RichTech Solutions Pvt. Ltd.\n";
    
    //Create keystroke objects
    KeyStroke helpKey = KeyStroke.getKeyStroke("F1");
    KeyStroke aboutKey = KeyStroke.getKeyStroke("F2");
    KeyStroke exitKey = KeyStroke.getKeyStroke("F4");
    
    //Create aH actionHandler
    private actionHandler aH = new actionHandler();
    
    public Bean2()
    {   
        //Create optionsMenu JMenu
        optionsMenu = new JMenu("Options");
        optionsMenu.setMnemonic('O');
        
        //Add JMenu to JMenuBar
        this.add(optionsMenu);

         //Create Help JMenuItem
        helpMenuItem = new JMenuItem("Help");
        helpMenuItem.setAccelerator(helpKey);
        helpMenuItem.setMnemonic('H');
        helpMenuItem.addActionListener(aH);
        
        //Create About JMenuItem
        aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.setAccelerator(aboutKey);
        aboutMenuItem.setMnemonic('A');
        aboutMenuItem.addActionListener(aH);
        
        //Create Exit JMenuItem
        exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setAccelerator(exitKey);
        exitMenuItem.setMnemonic('x');
        exitMenuItem.addActionListener(aH);
        
        //Add JMenuItem to optionsMenu
        optionsMenu.add(helpMenuItem);
        optionsMenu.addSeparator();
        optionsMenu.add(aboutMenuItem);
        optionsMenu.addSeparator();
        optionsMenu.add(exitMenuItem);
    }
    
    class actionHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //Show Help window if helpMenuItem is clicked
            if (e.getSource() == helpMenuItem)
            {
                JOptionPane.showMessageDialog(null, helpStr, "HELP : Memory Analyser", JOptionPane.INFORMATION_MESSAGE, memoryAnalyserIcon);
            }
            
            //Show About window if aboutMenuItem is clicked
            if (e.getSource() == aboutMenuItem)
            {
                JOptionPane.showMessageDialog(null, aboutStr, "ABOUT : Memory Analyser", JOptionPane.INFORMATION_MESSAGE, memoryAnalyserIcon);
            }
            
            //Exit the program if exitMenuItem is clicked
            if (e.getSource() == exitMenuItem)
            {
                System.exit(0);
            }
        }
    }
    
}
