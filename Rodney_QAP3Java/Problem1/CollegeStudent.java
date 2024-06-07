// Written by: Rodney Stead
// Written on: June 6, 2024

package Problem1;

// CollegeStudent class extends Student class which extends Person class
public class CollegeStudent extends Student{

    // instance variables
    protected String myMajor;
    protected int myYear;

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year)
    {
        super(name, age, gender, idNum, gpa);
        myMajor = major;
        myYear = year;
    }

    // Getters and setters
    public String getMajor ()
    {
        System.out.println("Major: " + myMajor);
        return myMajor;
    }

    public void setMajor (String major)
    {
        System.out.println("New Major: " + major);
        myMajor = major;
    }

    public int getYear ()
    {
        System.out.println("Year: " + myYear);
        return myYear;
    }

    public void setYear (int year)
    {
        System.out.println("New Year: " + year);
        myYear = year;
    }

    // To string method
    public String toString()
    {
        return super.toString() + ", Major: " + myMajor + ", Year: " + myYear;
    }
    
}
