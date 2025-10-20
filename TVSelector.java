import java.util.Scanner;
/* Create a class called TVSelector.java. Prompt the user to select one of three television models
by entering a model number. Use a switch statement with fall-through logic to display all
features of the selected model.
Model Options
• Model 100: Remote control, timer, stereo sound — $1000
• Model 200: Adds picture-in-picture — $1200
• Model 300: Adds HDTV, flat screen, 16x9 aspect ratio — $2400
Requirements
• Use Scanner for input
• Use switch with fall-through to display cumulative features
• Include a default case for invalid input
• Display selected model, features, and price */

public class TVSelector {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in); 
         System.out.println("Select 1 of the 3 television models\n 100\n 200\n 300");
         int model = s.nextInt();

         switch(model){
           case 300:
                System.out.println("Adds HDTV, flat screen, 16x9 aspect ratio is $2400"); 
            case 200:
                System.out.println("Adds picture-in-picture is $1200");
            case 100:
                System.out.println("Remote control, timer, stereo sound is $1000");
                break;
            default:
                System.out.println("Invalid input");
    
         }

        

         
           

            
                        
        }
    }
