// Written by: Rodney Stead
// Written on: June 6, 2024

package Problem2;

// Shape class, this is the super class
public class Shape {
    
    // instance variables
    protected String color = "red";
    protected boolean filled = true;

    // Constructors
    public Shape()
    {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    // Getters and setters

    public String getColor ()
    {
        System.out.println("Color: " + color);
        return color;
    }

    public void setColor (String color)
    {
        System.out.println("New Color: " + color);
        this.color = color;
    }

    public boolean isFilled ()
    {
        System.out.println("Filled Status: " + filled);
        return filled;
    }

    public void setFilled (boolean filled)
    {
        System.out.println("New Filled Status: " + filled);
        this.filled = filled;
    }

    // To string method
    public String toString()
    {
        return "Shape: " + color + ", Filled Status: " + filled;
    }


}
