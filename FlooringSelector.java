/* Create a class called FlooringSelector.java. Prompt the user to select one of three flooring
options by entering a number. Use a switch statement to display the selected option and its
description.
Flooring Options
• Option 1: Scored concrete — $3000
• Option 2: Carpeting — $5000
• Option 3: Wood floors in living areas, carpeting in bedrooms, tile in bath areas —
$10,000
Requirements
• Use Scanner for input
• Use switch with break statements (no fall-through)
• Include a default case for invalid input
• Display selected option and price */

import java.util.Scanner;

public class FlooringSelector {
   public static  void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Select 1 of the 3 flooring operations\n 1 \n 2 \n 3");
        int flooring = s.nextInt();

        switch(flooring){
            case 1:
            System.out.println("Scored concrete — $3000");
            break;
            case 2:
            System.out.println("Carpeting — $5000");
            break;
            case 3:
            System.out.println("Wood floors in living areas, carpeting in bedrooms, tile in bath areas —\r\n" + "$10,000");
            break;

            default:
                 System.out.println("Invalid input");
        }




   }
}
