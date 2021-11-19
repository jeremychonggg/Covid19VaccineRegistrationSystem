package covid19vaccineregistrationsystem;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DataIO {
    //public static ArrayList<People> allPeople = new ArrayList<People>();
    
    public static void read() {
        try{
            Scanner s = new Scanner(new File("people.txt")); 
            while(s.hasNext()){ // not at the end of file 
                String a = s.nextLine(); 
                int b = Integer.parseInt(s.nextLine());
                s.nextLine(); 
                //People c = new People(a,b); 
                //allPeople.add(c); 
            }
        } catch(Exception e) {
            System.out.println("Error in read!");
        }
    }
}
