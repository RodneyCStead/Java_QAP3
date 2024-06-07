// Written by: Rodney Stead
// Written on: June 6, 2024

package Problem3;

// MovablePoint class that extends the Point class
public class MovablePoint extends Point{

    // instance variables
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Constructors
    public MovablePoint()
    {
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    public MovablePoint(float xSpeed, float ySpeed)
    {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed)
    {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getters and setters
    public float getXSpeed ()
    {
        System.out.println("X Speed: " + xSpeed);
        return xSpeed;
    }

    public void setXSpeed (float xSpeed)
    {
        System.out.println("New X Speed: " + xSpeed);
        this.xSpeed = xSpeed;
    }

    public float getYSpeed ()
    {
        System.out.println("Y Speed: " + ySpeed);
        return ySpeed;
    }

    public void setYSpeed (float ySpeed)
    {
        System.out.println("New Y Speed: " + ySpeed);
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed ()
    {
        float[] speed = {xSpeed, ySpeed};
        System.out.println("X Speed: " + xSpeed + ", Y Speed: " + ySpeed);
        return speed;
    }

    public void setSpeed (float xSpeed, float ySpeed)
    {
        System.out.println("New X Speed: " + xSpeed + ", New Y Speed: " + ySpeed);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // toString method
    public String toString()
    {
        return "MovablePoint: (" + x + ", " + y + "), Speed: (" + xSpeed + ", " + ySpeed + ")";
    }

    // Move method
    public MovablePoint move()
    {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    
    
}
