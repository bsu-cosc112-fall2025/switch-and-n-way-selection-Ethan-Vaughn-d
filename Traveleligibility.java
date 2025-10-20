/* Create a class called TravelEligibility.java. 
Problem: 
Prompt the user to enter their age and whether they have a passport (true or false). Use nested selection to: 
•	If age ≥ 18:  
o	If has passport → "Eligible to travel internationally." 
o	Else → "Get a passport to travel." 
•	If age < 18:  
o	If has passport → "Eligible to travel with guardian." 
o	Else → "Not eligible to travel." 
Requirements: 
•	Use Scanner for input 
•	Use nested if statements 
•	Display eligibility message 
 */

 import java.util. Scanner;

public class Traveleligibility {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        Scanner n = new Scanner(System.in);

        System.out.println("Enter your age");

        int age= s.nextInt();
         System.out.println("You have a passport? True or False");  
        boolean hasPassport= n.nextBoolean();
        
       

        

        if (18<=age && hasPassport) {
                System.out.println("eligible to travel");
                    } else if (18<=age){
                            System.out.println("Get a passport");
                    } else if (18>=age && hasPassport){
                        System.out.println("You can trqvel with a guardian");
                    } else {
                        System.out.println("You can not travel");
                    }
        

        }
    }
