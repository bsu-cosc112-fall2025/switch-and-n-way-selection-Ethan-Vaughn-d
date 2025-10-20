/* Create a class called GradeFeedback.java. 
Problem: 
Prompt the user to enter a numeric grade (0–100). Use an if-else-if chain to: 
•	Assign a letter grade (A, B, C, D, F) 
•	Provide feedback:  
o	A → "Excellent!" 
o	B → "Good job!" 
o	C → "Fair effort." 
o	D → "Needs improvement." 
o	F → "Failing grade." 
Requirements: 
•	Use Scanner for input 
•	Use n-way selection (if-else-if) 
•	Display both letter grade and feedback 
 */
import java.util.Scanner;

public class GradeFeedback {
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your grade perecentage, 1-100");
    int grade = s.nextInt();
 
    if (grade >= 90 && grade <= 100) {
            System.out.println("Your grade is: A");
        } else if (grade >= 80) {


    if (grade>=90) {
            System.out.println("You got an A Excellent");
    } 

    else if (grade >= 80);{
    System.out.println("You got an B Good Job!");
    }


    
    


     
   
    
    
 
     }
    }
}