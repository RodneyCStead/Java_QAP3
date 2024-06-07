// Written by: Rodney Stead
// Written on: June 6, 2024

package Problem1;

// Code for Teacher class that extends from the super class of Person.
public class Teacher extends Person{

    // instance variables
    protected String mySubject;
    protected double mySalary;

    // Constructor
    public Teacher (String name, int age, String gender, String subject, double salary)
    {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    // Getters and setters
    public String getSubject () 
    {
        System.out.println("Subject: " + mySubject);
        return mySubject;
    }

    public void setSubject (String subject) 
    {
        System.out.println("New Subject: " + subject);
        mySubject = subject;
    }

    public double getSalary () 
    {
        System.out.println("Salary: " + mySalary);
        return mySalary;
    }

    public void setSalary (double salary)
    {
        System.out.println("New Salary: " + salary);
        mySalary = salary;
    }

    // To string method
    public String toString ()
    {
        return super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
    }
    
}
