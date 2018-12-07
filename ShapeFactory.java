package com.marlen.java.lesson_1.Lesson7_1.Home7.e_olymp.DesignPatterns.Creational_Patterns.Factory;

// https://www.tutorialspoint.com/design_pattern/factory_pattern.htm


public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}