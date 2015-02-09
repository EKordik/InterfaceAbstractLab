/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 * This abstract class is a template to build course classes off of.
 * It stores course names, numbers, and the credits and it  
 * also, provides methods to get these properties and set these methods, 
 * validating that the information to be stored in each variable is valid information
 * 
 * It also has a method that returns the name in capitol letters in case you 
 * need this.
 * 
 * @author      Emma Kordik
 * @version     1.00
 */

public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
   
    //Setters for the Course Number, Course Name, & Credits
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    //Getters for the Course Name, Course Number, and Credits
    public final String getCourseName() {
        return courseName;
    }
    
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public final double getCredits() {
        return credits;
    }
    
    //Returns a capitalized version of the course name

    public final String getCapitalizedCourseName() {
        return getCourseName().toUpperCase();
    }
   
}
