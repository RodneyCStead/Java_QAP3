// Written by: Rodney Stead
// Written on: June 6, 2024

package Problem3;

// Point class that will be used as a super class for the MovablePoint class
public class Point {
    
    // instance variables
    protected float x = 0.0f;
    protected float y = 0.0f;

    // Constructors
    public Point()
    {
        x = 0.0f;
        y = 0.0f;
    }

    public Point(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    // Getters and setters

    public float getX ()
    {
        System.out.println("X: " + x);
        return x;
    }

    public void setX (float x)
    {
        System.out.println("New X: " + x);
        this.x = x;
    }

    public float getY ()
    {
        System.out.println("Y: " + y);
        return y;
    }

    public void setY (float y)
    {
        System.out.println("New Y: " + y);
        this.y = y;
    }

    public float[] getXY ()
    {
        float[] xy = {x, y};
        System.out.println("X: " + x + ", Y: " + y);
        return xy;
    }

    public void setXY (float x, float y)
    {
        System.out.println("New X: " + x + ", New Y: " + y);
        this.x = x;
        this.y = y;
    }

    // To string method
    public String toString()
    {
        return "Point: (" + x + ", " + y + ")";
    }

}
