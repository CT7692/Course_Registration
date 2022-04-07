//***************************************************************************************************** 
// 
//  File:           CourseSection.java 
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
//  This is a class file that stores the relevant
//  information of the course and its section.
//
//  Other files required:  
//   1. Driver.java
//   2. Validator.java
//   3. Instructor.java
//   
//***************************************************************************************************** 

package registration;

public class CourseSection
{
    private String courseName;
    private int sectionNumber;
    private Instructor inst;
    private static int sectionCount = 0;
    
//*****************************************************************************************************

    public CourseSection()
    {
        courseName = "";
        inst = new Instructor();
        sectionCount++;
    }
    
//*****************************************************************************************************
    
    public CourseSection(String na, Instructor in, int sec)
    {
        courseName = na;
        inst = in;
        sectionNumber = sec;
        sectionCount++;
    }
    
//*****************************************************************************************************
    
    public String getCourseName()
    {
        return courseName;
    }

//*****************************************************************************************************
    
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    
//*****************************************************************************************************

    public void setInst(Instructor instruct)
    {
        this.inst = new Instructor(instruct);
    }
    
//*****************************************************************************************************
    
    public Instructor getInst()
    {
        return new Instructor(inst);
    }
    
//*****************************************************************************************************
    
    public void setSectionNumber(int sectionNumber)
    {
        this.sectionNumber = sectionNumber;
    }
    
//*****************************************************************************************************
    
    public int getSectionNumber()
    {
        return sectionNumber;
    }
    
//***************************************************************************************************** 
    
    public int getSecCount()
    {
        return sectionCount;
    }
    
//*****************************************************************************************************    
    
    @Override
    public String toString()
    {
        return courseName + ", " + sectionNumber + ", " + inst; 
    }
    
//*****************************************************************************************************
    
    public boolean equals(CourseSection obj)
    {
        boolean status = false;
        
        if(obj.courseName == this.courseName)
            status = true;
        
        return status;
    }
    
//*****************************************************************************************************
    
}
