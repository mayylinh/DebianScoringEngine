package debianscoringengine;

import java.util.Scanner;

public class DebianScoringEngine 
{    
    public static void main(String[] args)
    {
        Configurator configurator = new Configurator();
        
        Scanner keyboard = new Scanner(System.in);
        String choice = "";
        
        while(choice.compareTo("0") != 0)
        {
            System.out.println("\nChoose a number to set a vulnerability" +
                               "\n1) Good Users" +
                               "\n2) Bad Users" +
                               "\n3) Good Administrators" +
                               "\n4) Bad Administrators" +
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
                    break;
                case "00":
                    explain();
                    break;
                default:
                    System.out.println("\nPlease type in a number according to the menu.");
            }
        }
    }
    
    public static void explain()
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
                               "\n0) Return to main menu" +
                               "\nEnter choice here: ");

            choice = keyboard.nextLine();
            switch (choice)
            {
                case "1":
                    System.out.println("\nParticipant will lose points for removing " +
                                       "these users from the system.");
                    break;
                case "2":
                    System.out.println("\nParticipant will gain points for removing " +
                                       "these users from the system.");
                    break;
                case "3":
                    System.out.println("\nParticipant will lose points for restricting " +
                                       "administrator to these users.");
                    break;
                case "4":
                    System.out.println("\nParticipant will gain points for restricting " +
                                       "administrator to these users.");
                    break;
                case "0":
                    break;
                default:
                    System.out.println("\nPlease type in a number according to the menu.");
            }
        }
    }
}
