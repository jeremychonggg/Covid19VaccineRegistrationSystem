package covid19vaccineregistrationsystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Page1 extends JFrame implements ActionListener{ //Page1 IS-A JFrame 
    public void actionPerformed(ActionEvent e){ //Needed for ActionListener
        if (e.getSource() == login){
            String id = JOptionPane.showInputDialog("Enter your id:");
            People found = DataIO.checking(id);
            if(found==null){ //If not found id in database 
                JOptionPane.showMessageDialog(login,"You haven't registered!");
            } else{ //If found id in database 
                // People enter password 
                String password = JOptionPane.showInputDialog("Enter your password:");
                //Check if password is valid 
                if(Integer.parseInt(password) == found.getPassword()){ //id.getPassword()){
                    System.out.print("Correct Password"); 
                    Covid19VaccineRegistrationSystem.login = found;
                    setVisible(false);
                    Covid19VaccineRegistrationSystem.second.setVisible(true);
                } else{ //Else password is not valid 
                    JOptionPane.showMessageDialog(login,"Wrong password!");
                }
            }
        } else if (e.getSource() == register) {
            String id = JOptionPane.showInputDialog("Enter your Email:");
            People found = DataIO.checking(id);
            if(found != null) {
                JOptionPane.showMessageDialog(register,"The id has been used!");
            } else {
                String icPassportNo = JOptionPane.showInputDialog("Enter your IC/Passport No.:");
                String name = JOptionPane.showInputDialog("Enter your Name:");
                String state = JOptionPane.showInputDialog("Enter your State:");
                String postalCode = JOptionPane.showInputDialog("Enter your PostalCode:");
                String password = JOptionPane.showInputDialog("Enter your Password:");
                
                People c = new People(id, icPassportNo, name, state, postalCode, password, null, null); 
                DataIO.allPeople.add(c); 
                DataIO.write(); 
            }
        } else if (e.getSource() == personnelLogin) {
            String id = JOptionPane.showInputDialog("Enter your id:");
//            Customer found = DataIO.checking(name);
            if(id==null){ //If not found id in database 
                JOptionPane.showMessageDialog(personnelLogin,"You haven't registered!");
            } else{ //If found id in database 
                // People enter password 
                String password = JOptionPane.showInputDialog("Enter your password:");
                //Check if password is valid 
                if(Integer.parseInt(password) == found.getPassword()){ //id.getPassword()){
                    System.out.print("Correct Password"); 
                    Covid19VaccineRegistrationSystem.login = found;
                    setVisible(false);
                    Covid19VaccineRegistrationSystem.second.setVisible(true);
                } else{ //Else password is not valid 
                    JOptionPane.showMessageDialog(personnelLogin,"Wrong password!");
                }
            }
        }
    }
    
    private Button login, register, personnelLogin; 
    
    public Page1() {
        setSize(300,100); //Set Window Size (pixel resolution) 
        setLocation(700,200); //Set Window Popup Location (x,y) 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new FlowLayout()); //Arrange Button based on the sequence I add into JFrame (into Window to show from "Left to Right", "Top to Bottom", and "Centre Alignment") 
    
        login = new Button("login"); 
        register = new Button("register");
        personnelLogin = new Button("personnelLogin"); 
        
        login.addActionListener(this); //'this' is the current object
        register.addActionListener(this);     //'this' = first (page name) 
        personnelLogin.addActionListener(this);
        
        add(login);
        add(register); 
        add(personnelLogin); 
        
        setVisible(true); 
    }
}
