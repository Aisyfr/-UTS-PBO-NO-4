/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no4;

/**
 *
 * @author Aisy
 */
public class CourseDemo {

    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Kara", "Meytha", "SR1727");
       
       TextBook myTextBook = new TextBook("Ketika Diriku Bukanlah Aku", "Meytha Kara", "Afrlisher");
       
       Course myCourse = new Course("Trying To Love Yourself", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
}
