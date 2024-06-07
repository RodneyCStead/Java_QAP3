// Purpose: Demo class to test the Person, Student, Teacher, and CollegeStudent classes
// Written by: Rodney Stead
// Written on: June 6, 2024


package Problem1;

// Demo class to test the Person, Student, Teacher, and CollegeStudent classes
public class Demo {
    public static void main (String[] args)
    {
        // Creating and testing the person class
        System.out.println();
        System.out.println("Person Class Tests");
        Person P1 = new Person ("Rodney", 30, "M");
        System.out.println(P1);

        // Testing the getters
        P1.getName();
        P1.getAge();
        P1.getGender();
        
        // Testing the setters
        P1.setName("Ronnie");
        P1.setAge(31);
        P1.setGender("F");
        System.out.println(P1);
        
        

        // Creating and testing the student class
        System.out.println();
        System.out.println("Student Class Tests");
        Student S1 = new Student("Dylan", 27, "M", "123456", 3.5);
        System.out.println(S1);

        // Testing the getters
        S1.getIdNum();
        S1.getGPA();

        // Testing the setters
        S1.setIdNum("654321");
        S1.setGPA(4.0);
        System.out.println(S1);

        // Creating and testing the teacher class
        System.out.println();
        System.out.println("Teacher Class Tests");
        Teacher T1 = new Teacher("Mr. Pi", 45, "M", "Math", 31415);
        System.out.println(T1);

        // Testing the getters
        T1.getSubject();
        T1.getSalary();

        // Testing the setters
        T1.setSubject("Culinary Arts");
        T1.setSalary(62830);
        System.out.println(T1);

        // Creating and testing the college student class
        System.out.println();
        System.out.println("College Student Class Tests");
        CollegeStudent CS1 = new CollegeStudent("Nick", 29, "M", "123456", 3.5, "Computer Science", 4);
        System.out.println(CS1);

        // Testing the getters
        CS1.getMajor();
        CS1.getYear();

        // Testing the setters
        CS1.setMajor("Math");
        CS1.setYear(5);
        System.out.println(CS1);

    }
    
}
