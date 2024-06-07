// Written by: Rodney Stead
// Written on: June 6, 2024

package Problem2;

// Rectangle class that extends from the Shape Superclass
public class Rectangle extends Shape{
    
    // instance variables
    protected double width = 1.0;
    protected double length = 1.0;

    // Constructors
    public Rectangle ()
    {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle (double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle (double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getters and setters

    public double getWidth ()
    {
        System.out.println("Width: " + width);
        return width;
    }

    public void setWidth (double width)
    {
        System.out.println("New Width: " + width);
        this.width = width;
    }

    public double getLength ()
    {
        System.out.println("Length: " + length);
        return length;
    }

    public void setLength (double length)
    {
        System.out.println("New Length: " + length);
        this.length = length;
    }

    // Area and Perimeter methods, used in the square class too
    public double getArea ()
    {
        double area = width * length;
        System.out.println("Area: " + area);
        return area;
    }

    public double getPerimeter ()
    {
        double perimeter = 2 * (width + length);
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }

    // To string method
    @Override
    public String toString() 
    {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
