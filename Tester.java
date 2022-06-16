package com.syntax.class17;

import com.syntax.class16.Dog;

public class Tester {
    public static void main(String[] args) {


        /*
          If classes exist inside the same package
          they are imported automatically.
         */

        Employee employee=new Employee();
        employee.name="Mile";
        // employee.salary=125000; we get an error because it is private.
        employee.department="IT saver";
        // employee.printSalary(); it is private we can't access it.
        employee.printDepartment();




            Dog dog=new Dog();


    }
}
