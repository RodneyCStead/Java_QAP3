// Purpose: Demo class to test the Shape, Circle, Rectangle, and Square classes
// Written by: Rodney Stead
// Written on: June 6, 2024

package Problem2;

// Demo class to test the Shape, Circle, Rectangle, and Square classes
public class Demo {
    
    public static void main(String[] args)
    {
        // Creating and testing the Shape class
        System.out.println();
        System.out.println("Shape Class Tests");
        Shape S1 = new Shape();
        System.out.println(S1);
        Shape S2 = new Shape("blue", false);
        System.out.println(S2);

        // Testing the getters
        S1.getColor();
        S1.isFilled();
        S2.getColor();
        S2.isFilled();

        // Testing the setters
        S1.setColor("yellow");
        S1.setFilled(false);
        System.out.println(S1);
        S2.setColor("purple");
        S2.setFilled(true);
        System.out.println(S2);

        // Creating and testing the Circle class
        System.out.println();
        System.out.println("Circle Class Tests");
        Circle C1 = new Circle();
        System.out.println(C1);
        Circle C2 = new Circle(5.0);
        System.out.println(C2);
        Circle C3 = new Circle(3.0, "orange", true);
        System.out.println(C3);

        // Testing the getters
        C1.getRadius();
        C2.getRadius();
        C3.getRadius();
        C1.getArea();
        C2.getArea();
        C3.getArea();

        // Testing the setters
        C1.setRadius(10.0);
        System.out.println(C1);
        C2.setRadius(7.0);
        System.out.println(C2);
        C3.setRadius(4.0);
        System.out.println(C3);

        // Creating and testing the Rectangle class
        System.out.println();
        System.out.println("Rectangle Class Tests");
        Rectangle R1 = new Rectangle();
        System.out.println(R1);
        Rectangle R2 = new Rectangle(5.0, 10.0);
        System.out.println(R2);
        Rectangle R3 = new Rectangle(3.0, 6.0, "purple", false);
        System.out.println(R3);

        // Testing the getters
        R1.getWidth();
        R1.getLength();
        R2.getWidth();
        R2.getLength();
        R3.getWidth();
        R3.getLength();
        R1.getArea();
        R2.getArea();
        R3.getArea();
        R1.getPerimeter();
        R2.getPerimeter();
        R3.getPerimeter();
        
        // Testing the setters
        R1.setWidth(15.0);
        System.out.println(R1);
        R2.setLength(12.0);
        System.out.println(R2);
        R3.setWidth(9.0);
        System.out.println(R3);

        // Creating and testing the Square class
        System.out.println();
        System.out.println("Square Class Tests");
        Square SQ1 = new Square();
        System.out.println(SQ1);
        Square SQ2 = new Square(5.0);
        System.out.println(SQ2);
        Square SQ3 = new Square(3.0, "orange", true);
        System.out.println(SQ3);
        
        // Testing the getters
        SQ1.getSide();
        SQ2.getSide();
        SQ3.getSide();
        SQ1.getArea();
        SQ2.getArea();
        SQ3.getArea();
        SQ1.getPerimeter();
        SQ2.getPerimeter();
        SQ3.getPerimeter();

        // Testing the setters
        SQ1.setSide(10.0);
        System.out.println(SQ1);
        SQ2.setSide(7.0);
        System.out.println(SQ2);
        SQ3.setSide(4.0);
        System.out.println(SQ3);

    }
}
