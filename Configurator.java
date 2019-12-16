package debianscoringengine;

import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

public class Configurator 
{
    Scanner keyboard = new Scanner(System.in);
    static String[] goodUsers = {}, badUsers = {}, goodAdmins = {}, badAdmins = {};
    
    public Configurator()
    {
        
    }
    
    public String[] goodUsers()
    {
        String users;
        int mistake = 1;
        
        System.out.println("\nEnter usernames for authorized users separated by a space." +
                           "\nPress enter when finished.");
        users = keyboard.nextLine();
        
        while (mistake == 1)
        {
            mistake = mistake("");
            if(mistake == 0)
                break;
            System.out.println("\nEnter usernames for authorized users separated by a space." +
                               "\nPress enter when finished.");
            users = keyboard.nextLine();
        }
        
        goodUsers = users.split(" ");
        return goodUsers;
    }
    
    public String[] badUsers()
    {
        String users;
        int mistake = 1;
        
        System.out.println("\nEnter usernames for unauthorized users separated by a space." +
                           "\nPress enter when finished.");
        users = keyboard.nextLine();
        
        while (mistake == 1)
        {
            mistake = mistake("");
            if(mistake == 0)
                break;
            System.out.println("\nEnter usernames for unauthorized users separated by a space." +
                               "\nPress enter when finished.");
            users = keyboard.nextLine();
        }
        
        badUsers = users.split(" ");  
        return badUsers;
    }
    
    public String[] goodAdmins()
    {
        String users;
        int mistake = 1;
        
        System.out.println("\nEnter usernames for users meant to be administrators." +
                           "\nPress enter when finished.");
        users = keyboard.nextLine();
        
        while (mistake == 1)
        {
            mistake = mistake("");
            if(mistake == 0)
                break;
            System.out.println("\nEnter usernames for users meant to be administrators." +
                               "\nPress enter when finished.");
            users = keyboard.nextLine();
        }
        
        goodAdmins = users.split(" ");
        return goodAdmins;
    }
    
    public String[] badAdmins()
    {
        String users;
        int mistake = 1;
        
        System.out.println("\nEnter usernames users not meant to be administrators." +
                           "\nPress enter when finished.");
        users = keyboard.nextLine();
        
        while (mistake == 1)
        {
            mistake = mistake("");
            if(mistake == 0)
                break;
            System.out.println("\nEnter usernames users not meant to be administrators." +
                               "\nPress enter when finished.");
            users = keyboard.nextLine();
        }
        
        badAdmins = users.split(" ");
        return badAdmins;
    }
    
    
    
    public int mistake(String again)
    {
        int mistake = 1;
        
        while (mistake == 1)
        {
            System.out.println("\nIf you made a mistake and would like to reinput, enter 1. " +
                               "Otherwise, enter 0");
            while(again.compareTo("1") != 0)
            {
                if(again.compareTo("0") == 0)
                    return 0;
                System.out.println("Please enter 1 or 0.");
                again = keyboard.nextLine();
            }
            return 1;
        }
        
        return 0;
    }
    
    public static void printVulns()
    {
        String answer = "";
        Scanner keyboard = new Scanner(System.in);
        
        while(answer.compareTo("N") != 0)
        {
            if(answer.compareTo("Y") == 0)
                break;
            System.out.println("\nWould you like to view your current configurations?");
            answer = keyboard.nextLine();

            switch (answer)
            {
                case "Y":
                    if(goodUsers.length > 0)
                    {
                        System.out.println("\nGood Users: ");
                        for (int i = 0; i < goodUsers.length; ++ i) 
                            System.out.println(goodUsers[i] + " ");
                    }
                    if(badUsers.length > 0)
                    {
                        System.out.println("\nBad Users: ");
                        for (int i = 0; i < badUsers.length; ++ i) 
                            System.out.println(badUsers[i] + " ");
                    }
                    if(goodAdmins.length > 0)
                    {
                        System.out.println("\nGood Admins: ");
                        for (int i = 0; i < goodAdmins.length; ++ i) 
                            System.out.println(goodAdmins[i] + " ");
                    }
                    if(badAdmins.length > 0)
                    {
                        System.out.println("\nBad Admins: ");
                        for (int i = 0; i < badAdmins.length; ++ i) 
                            System.out.println(badAdmins[i] + " ");
                    }
                    break;
                case "N":
                    break;
                default:
                    System.out.println("Please enter \"Y\" or \"N\"");
            }
        }
    }
    
    public void toFile()
    {
        
    }
}
