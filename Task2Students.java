package com.syntax.class17;

public class Task2Students {
    /*
    Create a class called Students
    Create three variables Name, ID, and numberOfStudents
    Create three objects of the Students Class
    Set the value for studentName, studentID and increment the numberOfStudents for each objects
    Print out total number of students
     */
    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Task2Students task2Students=new Task2Students();
        task2Students.name="John";
        task2Students.id="JN123";
        numberOfStudents=1;
        // if we are inside the same class we can access static variables inside static
        // methods by just writing the name of that variable we don't need to create an object



    }

}
