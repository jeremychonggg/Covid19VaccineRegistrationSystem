package covid19vaccineregistrationsystem;

public class People {
    private String id; //1001 and increase sequentially 
    private String icPassportNo; 
    private String name; 
    private String state; 
    private int postalCode; 
    private String password; 
    private VaccineDose dose1; 
    private VaccineDose dose2; 
    private VaccineStatus vaccinationStatus; 

    public People(String id, String icPassportNo, String name, String state, int postalCode, String password, VaccineDose dose1, VaccineDose dose2, VaccineStatus vaccinationStatus) {
        this.id = id;
        this.icPassportNo = icPassportNo;
        this.name = name;
        this.state = state;
        this.postalCode = postalCode;
        this.password = password;
        this.dose1 = dose1;
        this.dose2 = dose2;
        this.vaccinationStatus = vaccinationStatus;
    }

    public void view_Vaccination_Status(){
        System.out.println("View Vaccination Status"); 
    }
    
    public void account_Registration() {
        System.out.println("Account Registration");
    }
    
    public void account_Login() {
        System.out.println("Account Login");
    }
    
    public void account_Modify() {
        System.out.println("Account Modify");
    }
}
