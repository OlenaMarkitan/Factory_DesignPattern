package com.marlen.java.lesson_1.Lesson7_1.Home7.e_olymp.DesignPatterns.Creational_Patterns.Factory;

// https://www.tutorialspoint.com/design_pattern/factory_pattern.htm

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}