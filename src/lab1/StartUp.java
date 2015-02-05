/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *Runs the courses
 * 
 * @author Emmma Kordik
 */
public class StartUp {
     public static void main(String[] args){
        AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advanced Java", "183-150");
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java", "183-154");
        Course introProgramming = new IntroToProgrammingCourse
                ("Intro to Programming", "183,150");
        
        advJava.setPrerequisites("Intro to Java");
        introJava.setPrerequisites("Intro to Programming");
        
         System.out.println("Advanced Java: " + advJava.getCourseName() + " " + 
                 advJava.getCourseNumber() + " " + advJava.getPrerequisites());
         System.out.println("Intro to Java: ");
        
    }
}
