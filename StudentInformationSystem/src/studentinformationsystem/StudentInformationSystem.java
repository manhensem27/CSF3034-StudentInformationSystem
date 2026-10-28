package studentinformationsystem;

import static java.time.Clock.system;

public class StudentInformationSystem {
    public static void main(String[] args){
        // Student Information
        String studentName = "Muhammad Faiz Aiman Bin Muhamad";
        String studentID = "S85574";
        
        //Two mark
        int mark1 = 90;
        int mark2 = 95;
        
        
        //Display Student Information
        System.out.println("Student Information System");
        System.out.println("Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        
        //Calculate total
        int total = mark1 + mark2;
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + total);
        
        // Display Result
        if (total >=160){
            System.out.println("Result: Excellent");
        } else if ((total >= 100){
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement")
            
        }
        
    }
}