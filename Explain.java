/*
Verify case "8 - 13" (+ others?) in switch
*/

package debianscoringengine;

import java.util.Scanner;

public class Explain 
{
    public Explain()
    {
        
    }
    
    public void details()
    {
        Scanner keyboard = new Scanner(System.in);
        String choice = ""; 
        
        while(choice.compareTo("0") != 0)
        {
            System.out.println("\nChoose a number to for a vulnerability you'd like to see " +
                               "an explanation for." +
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
                               "\n0) Return to main menu" +
                               "\nEnter choice here: ");

            choice = keyboard.nextLine();
            switch (choice)
            {
                case "1":
                    System.out.println("\nPoints lost for removing these users from " +
                                       "the system.");
                    break;
                case "2":
                    System.out.println("\nPoints gained for removing these users from " +
                                       "the system.");
                    break;
                case "3":
                    System.out.println("\nPoints lost for restricting administrator " +
                                       "level privilege to these users.");
                    break;
                case "4":
                    System.out.println("\nPoints gained for restricting administrator " +
                                       "level privilege to these users.");
                    break;
                case "5":
                    System.out.println("\nPoints gained for disabling account login " +
                                       "as a guest.");
                    break;
                case "6":
                    System.out.println("\nPoints gained for disabling SSH protocol " +
                                       "to prevent network access into files.");
                    break;
                case "7":
                    System.out.println("\nPoints gained for enabling the ufw (uncomplicated " +
                                       "firewall for the system.");
                    break;
                case "8":
                    System.out.println("\nPoints gained for setting the minimum password age " +
                                       "to 30 days in /etc/login.defs");
                    break;
                case "9":
                    System.out.println("\nPoints gained for setting the maximum password age " +
                                       "to 90 days in /etc/login.defs");
                    break;
                case "10":
                    System.out.println("\nPoints gained for setting the maxiumum login tries " +
                                       "to 5 attempts in /etc/login.defs");
                    break;
                case "11":
                    System.out.println("\nPoints gained for setting the minimum password length " +
                                       "to 10 characters in /etc/pam.d/common-password");
                    break;
                case "12":
                    System.out.println("\nPoints gained for setting the password history " +
                                       "to 5 passwords remembered in /etc/pam.d/common-password");
                    break;
                case "13":
                    System.out.println("\nPoints gained for setting the password complexity " +
                                       "requirements in /etc/pam.d/common-password");
                    break;    
                case "0":
                    break;
                default:
                    System.out.println("\nPlease type in a number according to the menu.");
            }
        }
    }
}
