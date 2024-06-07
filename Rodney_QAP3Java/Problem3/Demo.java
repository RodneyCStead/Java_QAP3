// Purpose: Test the classes of Point and movablePoint
// Written by: Rodney Stead
// Written on: June 6, 2024

package Problem3;

public class Demo {
    
    public static void main (String [] args)
    {
        // Testing the Point class
        System.out.println();
        System.out.println("Testing the Point class");
        Point P1 = new Point();
        System.out.println(P1);
        Point P2 = new Point(2.0f, 3.0f);
        System.out.println(P2);

        // Testing the getters
        P1.getX();
        P1.getY();
        P1.getXY();
        P2.getX();
        P2.getY();
        P2.getXY();

        // Testing the setters
        P1.setX(4.0f);
        P1.setY(5.0f);
        P1.setXY(6.0f, 7.0f);
        P2.setX(8.0f);
        P2.setY(9.0f);
        P2.setXY(10.0f, 11.0f);
        System.out.println(P1);
        System.out.println(P2);

        // Testing the MovablePoint class
        System.out.println();
        System.out.println("Testing the MovablePoint class");
        MovablePoint MP1 = new MovablePoint();
        System.out.println(MP1);
        MovablePoint MP2 = new MovablePoint(2.0f, 3.0f);
        System.out.println(MP2);
        MovablePoint MP3 = new MovablePoint(4.0f, 5.0f, 6.0f, 7.0f);
        System.out.println(MP3);

        // Testing the getters
        MP1.getX();
        MP1.getY();
        MP1.getXY();
        MP1.getXSpeed();
        MP1.getYSpeed();
        MP1.getSpeed();
        MP2.getX();
        MP2.getY();
        MP2.getXY();
        MP2.getXSpeed();
        MP2.getYSpeed();
        MP2.getSpeed();
        MP3.getX();
        MP3.getY();
        MP3.getXY();
        MP3.getXSpeed();
        MP3.getYSpeed();
        MP3.getSpeed();

        // Testing the setters
        MP1.setX(8.0f);
        MP1.setY(9.0f);
        MP1.setXY(10.0f, 11.0f);
        MP1.setXSpeed(12.0f);
        MP1.setYSpeed(13.0f);
        MP2.setX(14.0f);
        MP2.setY(15.0f);
        MP2.setXY(16.0f, 17.0f);
        MP2.setXSpeed(18.0f);
        MP2.setYSpeed(19.0f);
        MP3.setX(20.0f);
        MP3.setY(21.0f);
        MP3.setXY(22.0f, 23.0f);
        MP3.setXSpeed(24.0f);
        MP3.setYSpeed(25.0f);
        System.out.println(MP1);
        System.out.println(MP2);
        System.out.println(MP3);

        // Testing the move method
        System.out.println();
        System.out.println("Testing the move method");
        MP1.move();
        MP2.move();
        MP3.move();
        System.out.println(MP1);
        System.out.println(MP2);
        System.out.println(MP3);
        


        
    
    }
}
