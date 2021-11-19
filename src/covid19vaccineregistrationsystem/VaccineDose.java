package covid19vaccineregistrationsystem;

import java.util.Date;

public class VaccineDose {
    private String Batch; 
    private Centre Facility; 
    private Date VacDateTime;

    public VaccineDose(String Batch, Centre Facility, Date VacDateTime) {
        this.Batch = Batch;
        this.Facility = Facility;
        this.VacDateTime = VacDateTime;
    }
    
    
}
