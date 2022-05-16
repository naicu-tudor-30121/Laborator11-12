/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ionut
 */
public class UI {
    
    UI(){
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
       
        JLabel label1 = new JLabel("First name: ");
        JLabel label2 = new JLabel("Last name: ");
        JLabel label3 = new JLabel("CNP: ");
        JLabel label4 = new JLabel("Salary: ");
        
        JButton button1 = new JButton("SUBMIT");
        JButton button2 = new JButton("RESET");
        
        JTextField textLabel1 = new JTextField(20);
        JTextField textLabel2 = new JTextField(20);
        JTextField textLabel3 = new JTextField(20);
        JTextField textLabel4 = new JTextField(20);
        
        
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 20, 40));
        panel.setLayout(new GridLayout(0,2));
        
        panel.add(label1);
        panel.add(textLabel1);
        panel.add(label2);
        panel.add(textLabel2);
        panel.add(label3);
        panel.add(textLabel3);     
        panel.add(label4);
        panel.add(textLabel4);
        
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        panel.add(button1);
        panel.add(button2);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("EMPLOYEE'S PERSONAL INFO ");
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new UI();
    }
}


