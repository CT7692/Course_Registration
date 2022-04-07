//***************************************************************************************************** 
// 
//  File:           Instructor.java 
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
//  information of the instructor.
//
//  Other files required:  
//   1. Driver.java
//   2. Validator.java
//   3. CourseSection.java
//   
//***************************************************************************************************** 

package registration;

public class Instructor
{
    private String name;
    private String phoneNumber;
    private String office;

//*****************************************************************************************************
    
    public Instructor()
    {
        name = "";
        phoneNumber = "314-XXX-XXXX";
        office = "";
    }
    
//*****************************************************************************************************
  
    public Instructor(String iNa, String phoNum, String offLoc)
    {
        name = iNa;
        phoneNumber = phoNum;
        office = offLoc;
    }
    
//*****************************************************************************************************
    
    public Instructor(Instructor obj)
    {
        this.name = obj.name;
        this.phoneNumber = obj.phoneNumber;
        this.office = obj.office;
    }
    
//*****************************************************************************************************
    
    public String getName()
    {
        return name;
    }

//*****************************************************************************************************
    
    public void setName(String name)
    {
        this.name = name;
    }

//*****************************************************************************************************
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

//*****************************************************************************************************
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

//*****************************************************************************************************
    
    public String getOffice()
    {
        return office;
    }

//*****************************************************************************************************
    
    public void setOffice(String office)
    {
        this.office = office;
    }
    
//*****************************************************************************************************
    
    @Override
    public String toString()
    {
        return "Instructor: " + this.name + ", "
                + this.phoneNumber + ", " + this.office + "\n";
    }
    
//*****************************************************************************************************
    
    public boolean equals(Instructor i)
    {
        boolean status = false;
        
        if(i.name == this.name && i.office == this.office && 
                i.phoneNumber == this.phoneNumber)
            status = true;
        
        return status;
    }

//*****************************************************************************************************    
    
}
