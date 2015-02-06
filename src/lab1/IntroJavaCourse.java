package lab1;

/**
 * Inherits from the Course class and is for Intro to Java Courses.
 * It has methods to set and get the prerequisites for Intro to Java
 *
 * @author      Emma Kordik
 * @version     1.00
 */

public class IntroJavaCourse extends Course {
   private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
