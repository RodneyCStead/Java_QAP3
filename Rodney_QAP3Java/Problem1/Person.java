// Written by: Rodney Stead
// Written on: June 6, 2024

package Problem1;

// Code for the Super class "Person"
public class Person {

    // instance variables
    protected String myName;
    protected int myAge;
    protected String myGender;

    // Constructor
    public Person (String name, int age, String gender)
    {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getters and setters
    public String getName ()
    {
        System.out.println("Name: " + myName);
        return myName;
    }

    public void setName (String name)
    {
        System.out.println("New Person: " + name);
        myName = name;
    }

    public int getAge ()
    {
        System.out.println("Age: " + myAge);
        return myAge;
    }

    public void setAge (int age)
    {
        System.out.println("New Age: " + age);
        myAge = age;
    }

    public String getGender ()
    {
        System.out.println ("Gender: " + myGender);
        return myGender;
    }

    public void setGender (String gender)
    {
        System.out.println("New Gender: " + gender);
        
        myGender = gender;

    }


    // To string method
    public String toString ()
    {
        return "Name: " + myName + ", Age: " + myAge + ", Gender: " + myGender;
    }
}