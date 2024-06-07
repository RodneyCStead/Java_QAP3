// Written by: Rodney Stead
// Written on: June 6, 2024

package Problem1;

// Code for Student class that extends from the super class of Person.
public class Student extends Person{

    // instance variables
    protected String myIdNum;
    protected double myGPA;
    
    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa)
    {
        super(name,age,gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getters and setters
    public String getIdNum ()
    {
        System.out.println("Student ID: " + myIdNum);
        return myIdNum;
    }

    public void setIdNum (String idNum)
    {
        System.out.println("New Student ID: " + idNum);
        myIdNum = idNum;
    }

    public double getGPA ()
    {
        System.out.println("GPA: " + myGPA);
        return myGPA;
    }

    public void setGPA (double gpa)
    {
        System.out.println("New GPA: " + gpa);
        myGPA = gpa;
    }

    // To string method
    public String toString()
    {
        return super.toString() + ", Student ID: " + myIdNum + ", GPA: " + myGPA;
    }

}
