//***************************************************************************************************** 
// 
//  File:           Validator.java 
//   
//  Student:        Joseph Rydel 
// 
//  Assignment:     Assignment  #4 
// 
//  Course Name:    Java I  
// 
//  Course Number:  COSC 2050 - 01 
// 
//  Due:            February 28, 2022  
// 
// 
//  This is a class file that corrects
//  user input as needed.
//
//  Other files required:  
//   1. Driver.java
//   2. Instructor.java
//   3. CourseSection.java
//   
//***************************************************************************************************** 

package registration;

import java.util.Scanner;

//*****************************************************************************************************

public class Validator
{
    private static Scanner keyboard = new Scanner(System.in);
    
//*****************************************************************************************************
    
    public static String getRequiredString(String prompt)
    {
        System.out.print(prompt);
        String s = keyboard.nextLine();
        
        while("".equals(s))
        {
            System.out.println("ERROR! Entry required.");
            System.out.print(prompt);
            s = keyboard.nextLine();  
        }
        
        return s;
    }    

//*****************************************************************************************************

    public static String 
        getChoiceString(String prompt, String s1, String s2)
    {
        String input;
        System.out.printf(prompt + "(" + s1 + "/" + s2 + "): ");
        
        String err = "ERROR! Entry required.";
   
        input = keyboard.nextLine();
   
        if(input.isEmpty())
            input = getRequiredString(err);
   
         boolean success = false;
         while(success == false)
        {
            if(!input.equalsIgnoreCase(s1) && !input.equalsIgnoreCase(s2))
            {
                System.out.println("ERROR! Enter " + s1 +  " or " + s2 + ". ");
                System.out.printf(prompt + "(" + s1 + "/" + s2 + ") ");
                input = keyboard.nextLine();
            }
       
            else
                success = true;
        }
   
            return input;
        }
        
//*****************************************************************************************************        
        
    public static int getInt(Scanner sc, String prompt)
    {
        boolean success = false;
        int num = 0;
        String input;
        
        while(!success)
        {
            System.out.print(prompt);
            
            try
            {
                input = keyboard.nextLine();
                num = Integer.parseInt(input);
                success = true;
            }
            
            catch(NumberFormatException err)
            {
                System.out.println("ERROR! " + err.getMessage());
            }
        }
        
        return num;
    }
    
//*****************************************************************************************************
    
    public static int getIntWithinRange(Scanner sc, String prompt,
            int min, int max)
    {
        int num = getInt(sc, prompt);
        boolean success = false;
        
        while(!success)
        { 
            if(num >= max)
            {
                System.out.println("ERROR! Number must be less than " + max);
                System.out.print(prompt);
                num = getInt(sc, prompt);
            }
            
            else if(num <= min)
            {
                System.out.println("ERROR! Number must be greater than " + min);
                System.out.print(prompt);
                num = getInt(sc, prompt);
            }
            
            else
            {
                success = true;
            }
        }
        
        return num;
    }
    
//*****************************************************************************************************    
    
} 
