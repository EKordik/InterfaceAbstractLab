/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 * This Course template includes methods for setting the course name, 
 * course number and the credits as well as getters for each of these varialbles.
 * The setCredits method accepts a double as an argument. The setCourseName and
 * setCourseNumber methods accept Strings as objects.
 * 
 * getCredits returns a double and getCourseName and getCourseNumber return Strings.
 * 
 * @author Emma Kordik
 * @version 1.00
 */
public interface Courseable {
    
    public void setCredits(double credits);
    
    public void setCourseName(String courseName);
    
    public void setCourseNumber(String courseNumber);
    
    public double getCredits();
    
    public String getCourseNumber();
    
    public String getCourseName();
     
     
    
    
    
}
