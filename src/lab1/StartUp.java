/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 * Demonstrates that the AdvancedJavaCourse Class, IntroJavaCourse Class and 
 * IntroProgrammingCourse Class. 
 * This class instantiate  instances of each of these objects and prints out 
 * the information entered about them.
 * 
 * The classes in this program inherit from an abstract class. This means that 
 * code which they all share can be written once instead of three times which
 * could be a benefit. But it also locks the program down. The set credit method
 * is the one that perhaps would be done differently in a different course. The
 * verification processed used in it makes a course have to have between 0.5 and 
 * 4 credits. If you add a course later on that has, say six credits or no credits
 * you are stuck with this verification and either have to edit the code that
 * that point or not inherit from the Course class. Neither option is ideal. 
 * 
 * @author Emma Kordik
 */

public class StartUp {
     public static void main(String[] args){
         
        AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advanced Java", "183-150");
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java", "183-154");
        Course introProgramming = new IntroToProgrammingCourse
                ("Intro to Programming", "183,150");
        
        /**
         * Using the Liskov Substitution principle in this context did not seem 
         * very beneficial for any classes except the IntroProgramming class. 
         * Since the other two classes, AdvancedJavaCourse and IntroJavaCourse
         * both have prerequisite methods which are not in the abstract class
         * Courses, to have used the Liskov Substitution principle and declared 
         * those objects as Course objects would not have allowed the use of those
         * methods which were needed.
         * 
         * It seems that the Liskov substitution principle is best when the subclasses
         * have no addition methods which are not contained in the superclass.
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
