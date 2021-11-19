package covid19vaccineregistrationsystem;

import java.util.Date;
import java.util.ArrayList;

public class Appointment {
    static Date Date; 
    static String Centre; 
    static ArrayList<People> AppointmentPeople = new ArrayList<People>(); 
    
    public void submit_Vaccination_Appointment() {
        System.out.println("Submit Vaccination Appointment");
    }
}
