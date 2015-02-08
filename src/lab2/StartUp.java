/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 * This is the start up class to demonstrate how the AdvancedJavaCourse, 
 * IntroJavaCourse, and IntroToProgrammingCourse classes work.
 * This program inherits from an interface. The benefits this provides is flexibility
 * and yet at the same time structure. Each class is forced to have methods for 
 * setting and getting the course name, course number, and credits of that course.
 * It allows for flexibility in how this is done. This can allow for specialized 
 * verification of the information stored and has the potential for ease of 
 * expansion. The down side is that code, which is basically the same for each
 * class has to be rewritten three times in this program, thus making more work
 * for the programmer. However, I think the benefits outweigh the downsides.
 * 
 * @author Emma Kordik
 * @version     1.00
 */

public class StartUp {
   public static void main(String[] args){
        //Course object declaration. 
        AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advanced Java", "180-150");
        IntroJavaCourse introJava = new IntroJavaCourse("Introduction to Java", 
                "180-151");
        Courseable introProgramming = new IntroToProgrammingCourse(
                "Introduction to Programming", "180-152");
        
        /**
         * The Liskov Substitution principle can be used for the IntroToProgrammingCourse
         * class since every method in that class is defined in the interface.
         * It cannot be used for the other two class, AdvancedJavaCourse and
         * IntroJavaCourse because both of those have addition methods (the 
         * prerequisite methods). To use the Liskov Substitution Principle would 
         * render these methods inaccessible and they are methods that need accessed
         * and used.
         */
        
        //Sets prerequisites for the Advanced Java and Intro to Java Courses
        advJava.setPrerequisites("Intro to Java");
        introJava.setPrerequisites("Intro to Programming");
        
        //Displays the Course information
         System.out.println(advJava.getCourseName() + " " + 
                 advJava.getCourseNumber() + " " + advJava.getPrerequisites());
         System.out.println(introJava.getCourseName() + " " + 
                 introJava.getCourseNumber() + " " + introJava.getPrerequisites());
         System.out.println(introProgramming.getCourseName() + " " + 
                 introProgramming.getCourseNumber());
        
    }
}