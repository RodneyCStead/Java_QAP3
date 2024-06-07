// Written by: Rodney Stead
// Written on: June 6, 2024

package Problem2;

// Square class that extends from the Rectangle class which extends from the Shape super class
public class Square extends Rectangle{

    // Constructors

    // Since there are no instance variables in the Square class, we can use the default constructor
    // which will take the inherited instance variables from the Rectangle class for its length and width
    public Square ()
    {
        super();
    }

    public Square (double side) 
    {
        super(side, side);
    }

    public Square (double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    // Getters and setters
    // No need for a getArea and getPerimeter method since the square class
    // inherits the getArea and getPerimeter methods from the Rectangle class
    // as they are the same for both classes.
    
    public double getSide ()
    {
        System.out.println("Side: " + width);
        return width;
    }

    public void setSide (double side)
    {
        System.out.println("New Side: " + side);
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // To string method
    @Override
    public String toString()
    {
        return "A Square with side=" + width + ", which is a subclass of " + super.toString();
    }





    
    
}
