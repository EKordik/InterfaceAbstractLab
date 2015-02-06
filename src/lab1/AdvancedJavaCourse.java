package lab1;

import javax.swing.JOptionPane;

/**
 * Inherits from the course class and is for an Advanced Java Course.
 * This class has methods to set and get the prerequisites for Advanced Java
 * It also has a method that prints the name out in capital letters
 * 
 * @author      Emma Kordik
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    public String getCapitalizedCourseName() {
        return getCourseName().toUpperCase();
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    
}
