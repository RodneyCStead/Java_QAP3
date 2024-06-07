// Written by: Rodney Stead
// Written on: June 6, 2024

package Problem2;

// Circle class that extends from the Shape Superclass
public class Circle extends Shape{
    
    // instance variables
    protected double radius = 1.0;

    // Constructors
    public Circle()
    {
        radius = 1.0;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    // Getters and setters
    public double getRadius () 
    {
        System.out.println("Radius: " + radius);
        return radius;
    }

    public void setRadius (double radius)
    {
        System.out.println("New Radius: " + radius);
        this.radius = radius;
    }

    public double getArea ()
    {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
        return area;
    }

    public double getPerimeter ()
    {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }

    // To string method
    @Override
    public String toString() 
    {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
