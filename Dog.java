package com.syntax.class17;

public class Dog {
    String name;

    String breed;

    String color;
    int age;

    double weight;

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
       if(dogAge<25){
           age=dogAge;
       }else{
           System.out.println("Dog age can be greater");
       }

        weight=dogWeight;

    }

    void printInfo(){
        System.out.println("Name "+name+" breed "+breed+" color "+color+" Weight "+weight);


    }

    public static void main(String[] args) {
//        Dog dog1=new Dog();
//        dog1.name="Lofy";
//        dog1.breed="German";
//        dog1.color="Black";
//        dog1.age=15;
//        dog1.weight=20;
//        dog1.printInfo();
//
//        Dog dog2=new Dog();
//        dog2.name="Gofo";
//        dog2.breed="American";
//        dog2.color="White";
//        dog2.age=15;
//        dog2.weight=20;
//        dog2.printInfo();

    }

}
