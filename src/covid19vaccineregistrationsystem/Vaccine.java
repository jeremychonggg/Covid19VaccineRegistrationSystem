package covid19vaccineregistrationsystem;

import java.util.ArrayList;

public class Vaccine {
    private String VacName; 
    private String VacProCountry; 
    private int RequiredDose; 
    private int Quantity; 
    private ArrayList<Centre> AllocateCentre = new ArrayList<Centre>(); 
}
