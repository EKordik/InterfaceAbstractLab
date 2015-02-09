package lab2;

import javax.swing.JOptionPane;

/**
 * This class is for Intro to Java Courses and it implements Courseable.
 * 
 * It has methods to set and get the course name, course number, credit amount,
 * and any prerequisites for the course. It also validates that the the credits 
 * entered, name entered, and course number entered are valid.
 *
 * @author      Emma Kordik.
 * @version     1.00
 */
public class IntroJavaCourse implements Courseable {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        this.credits = credits;
    }
    
    @Override
    public void setCourseName(String courseName){
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    @Override
    public String getCourseName(){
        return courseName;
    }
    
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    
}
