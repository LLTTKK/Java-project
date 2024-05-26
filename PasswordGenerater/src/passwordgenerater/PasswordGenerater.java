package passwordgenerater;

import java.util.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font.*;
import javax.swing.*;
import java.math.*;
import java.security.SecureRandom;

class UI{  
    
    private static SecureRandom random = new SecureRandom();
    private static final String CHAR_AtoZ = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER_AtoZ = CHAR_AtoZ.toUpperCase();
    private static final String DIGIT = "0123456789";
    private static final String OTHER_PUNCTUATION = "!@#&()–[{}]:;',?/*";
    private static final String OTHER_SYMBOL = "~$^+=<>";   
    
    
    JTextField txt_ans = new JTextField();
    JTextField input = new JTextField(8);    
    JLabel L1 = new JLabel("Welcome to Password Generater ");   
    JLabel L2 = new JLabel("Enter the large that you want to generate :");
    JButton bt_gen = new JButton(" Generate ");


public void DisplayUI(){
    
    JFrame f = new JFrame("Password Generater"); // Set title of the Frame
    f.setSize(500, 500); // Frame size
    f.setLayout(null); // Null content, add components later
    f.setVisible(true); // show-up  
    
    
    L1.setBounds(10, 20, 1000, 50);                     // set component size --> x,y,w,h
    L1.setForeground(Color.black);
    L1.setFont(new Font(Font.SERIF, Font.BOLD, 20)); // format the display
    f.add(L1);    
    
    L2.setBounds(10 , 60 , 1000 , 50 );             // set component size --> x,y,w,h
    L2.setForeground(Color.black);
    L2.setFont(new Font(Font.SERIF, Font.BOLD, 20)); // format the display
    f.add(L2);
    
    input.setBounds(10, 100, 90, 35);                // set component size --> x,y,w,h
    input.setFont(new Font(Font.MONOSPACED, Font.TRUETYPE_FONT, 30));
    f.add(input);
        
    bt_gen.setBounds(10, 135, 100, 50);             // set component size --> x,y,w,h
    bt_gen.setForeground(Color.red);
    bt_gen.setFont(new Font(Font.SERIF, Font.TRUETYPE_FONT, 16));
    f.add(bt_gen);
    bt_gen.setVisible(true);
    
    bt_gen.addActionListener((ActionEvent e)->{             //Listener 
        String str = input.getText();  
        int PWlarge = Integer.parseInt(str);              
        
        if (PWlarge == 0 || PWlarge < 1) 
        {
            txt_ans.setForeground(Color.red);
            txt_ans.setText("------ ERROR ------");
        }                                           // it is integer                    
        else{ 

        txt_ans.setText(str); 
        
             }
        
                   
    });
    
    
    txt_ans.setBounds(10, 220, 350, 50);            // set component size --> x,y,w,h
    txt_ans.setForeground(Color.black);
    txt_ans.setFont(new Font(Font.MONOSPACED, Font.TRUETYPE_FONT, 15));
    f.add(txt_ans);
}




}

public class PasswordGenerater {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        
    UI UI = new UI();
    UI.DisplayUI();
        
    }
    
}
