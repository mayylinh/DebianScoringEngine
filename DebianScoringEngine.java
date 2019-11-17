/*
- Add more vulnerabilities to main menu
- Add corresponding switch cases to call functions in Configurator.java
- Write thank you message
*/

package debianscoringengine;

import java.util.Scanner;

public class DebianScoringEngine 
{    
    public static void main(String[] args)
    {
        Configurator configurator = new Configurator();
        Explain explain = new Explain();
        
        Scanner keyboard = new Scanner(System.in);
        String choice = "";
        
        System.out.println("First and VERY rough version of a scoring engine for " +
                           "Debian-based Linux OS virtual images developed with the intended " +
                           "use of training for the Air Force Association's CyberPatriot competition " +
                           "developed by Maylinh Nguyen while working at Coastline Community " +
                           "College in Garden Grove, CA");
        
        while(choice.compareTo("0") != 0)
        {
            System.out.println("\nChoose a number to set a vulnerability" +
                               "\n1) Good Users" +
                               "\n2) Bad Users" +
                               "\n3) Good Administrators" +
                               "\n4) Bad Administrators" +
                               "\n5) Disable Guest" +
                               "\n6) Disable SSH" +
                               "\n7) Enable Firewall" +
                               "\n8) Minimum Password Age" +
                               "\n9) Maximum Password Age" +
                               "\n10) Maximum Login Tries" +
                               "\n11) Password Length" +
                               "\n12) Password History" +
                               "\n13) Password Complexity" +
                               "\n0) Quit Configurator" +
                               "\n00) View explanation of vulnerability" +
                               "\nEnter choice here: ");
            
            choice = keyboard.nextLine();
            switch(choice)
            {
                case "1":
                    configurator.goodUsers();
                    configurator.printVulns();
                    break;
                case "2":
                    configurator.badUsers();
                    configurator.printVulns();
                    break;
                case "3":
                    configurator.goodAdmins();
                    configurator.printVulns();
                    break;
                case "4":
                    configurator.badAdmins();
                    configurator.printVulns();
                    break;
                case "0":
                    System.out.println("\nThank you for using the Configurator. " +
                                       "All configurations should be stored in a text file " +
                                       "created in the same directory as the Configurator. " +
                                       "\n\nUse");
                    break;
                case "00":
                    explain.details();
                    break;
                default:
                    System.out.println("\nPlease type in a number according to the menu.");
            }
        }
    }
}
