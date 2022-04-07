//***************************************************************************************************** 
// 
//  File:           Driver.java 
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
//  This is the main file of a Java
//  package that implements a student
//  registration system.
//
//  Other files required:  
//   1. Validator.java
//   2. Instructor.java
//   3. CourseSection.java
//   
//***************************************************************************************************** 

package registration;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
    
//*****************************************************************************************************
    
    public static void main(String[] args)
    {
        ArrayList<CourseSection> courseList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        
        registration(keyboard, courseList);
    }
    
//*****************************************************************************************************
    
    public static void registration(Scanner sc, ArrayList<CourseSection> cLi)
    {
        String opt = "y";
        String input = new String();
        String msg1 = "Enter student name: ";
        String msg2 = "Enter course name: ";
        String msg3 = "Section number: ";
        String msg4 = "Enter instructor's name: ";
        String msg5 = "Phone number: ";
        String msg6 = "Office location: ";
        String msg7 = "Another class? ";
        String stuName = new String();
        String cName = new String();
        int sec = 0;
        String iName = new String();
        String phoNum = new String();
        String offLoc = new String();
        
        stuName = Validator.getRequiredString(msg1);
        
        Instructor inst = new Instructor();
        CourseSection coSec = new CourseSection();
        
        do
        {
            cName = Validator.getRequiredString(msg2);
            sec = Validator.getIntWithinRange(sc, msg3, 0, 20);
            iName = Validator.getRequiredString(msg4);
            phoNum = Validator.getRequiredString(msg5);
            offLoc = Validator.getRequiredString(msg6);
            input = Validator.getChoiceString(msg7, opt, "n");
            
            inst = new Instructor(iName, phoNum, offLoc);
            coSec = new CourseSection(cName, inst, sec);

            cLi.add(coSec);
   
        }
        while(input.equalsIgnoreCase(opt));
        
        System.out.println();
        
        for(int i = 0; i < cLi.size(); i++)
            System.out.println(cLi.get(i));
        
        System.out.println("-----");
        System.out.println(coSec.getSecCount() - 1);
    }
    
}

//*****************************************************************************************************

//run:
//Enter student name: Joseph Rydel
//Enter course name: 
//ERROR! Entry required.
//Enter course name: Advanced Financing
//Section number: -1
//ERROR! Number must be greater than 0
//Section number: Section number: 1
//Enter instructor's name: 
//ERROR! Entry required.
//Enter instructor's name: Charles Offdensen
//Phone number: 
//ERROR! Entry required.
//Phone number: 314-123-4567
//Office location: 
//ERROR! Entry required.
//Office location: EAB 247
//Another class? (y/n): m
//ERROR! Enter y or n. 
//Another class? (y/n) y
//Enter course name: 
//ERROR! Entry required.
//Enter course name: Rock and Roll History
//Section number: 20
//ERROR! Number must be less than 20
//Section number: Section number: 3
//Enter instructor's name: Pickles
//Phone number: 314-333-3333
//Office location: 
//ERROR! Entry required.
//Office location: EAB 248
//Another class? (y/n): n
//
//Advanced Financing, 1, Instructor: Charles Offdensen, 314-123-4567, EAB 247
//
//Rock and Roll History, 3, Instructor: Pickles, 314-333-3333, EAB 248
//
//-----
//2
//BUILD SUCCESSFUL (total time: 3 minutes 55 seconds)


//*****************************************************************************************************