package covid19vaccineregistrationsystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Page1 extends JFrame implements ActionListener{ //Page1 IS-A JFrame 
    public void actionPerformed(ActionEvent e){ //Needed for ActionListener
        if (e.getSource() == stop){
            String input = JOptionPane.showInputDialog("Enter password:");
            if(input.equals("12345")){
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(stop, "Wrong password!");
            }
        } else if (e.getSource() == register) {
            
        } else if (e.getSource() == login) {
            
        }
    }
    
    private Button register, login, stop; 
    
    public Page1() {
        setSize(300,100); //Set Window Size (pixel resolution) 
        setLocation(700,200); //Set Window Popup Location (x,y) 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new FlowLayout()); //Arrange Button based on the sequence I add into JFrame (into Window to show from "Left to Right", "Top to Bottom", and "Centre Alignment") 
    
        register = new Button("Register"); 
        login = new Button("Login");
        stop = new Button("Stop"); 
        
        register.addActionListener(this); //'this' is the current object
        login.addActionListener(this);     //'this' = first (page name) 
        stop.addActionListener(this);
        add(register);
        add(login); 
        add(stop); 
        
        setVisible(true); 
    }
}
