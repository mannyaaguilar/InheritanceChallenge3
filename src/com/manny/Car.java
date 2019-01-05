package com.manny;

public class Car extends Vehicle {

    private String model;
    private String color;

    private boolean isMoving;

    public Car(String name, int miles, String model, String color, boolean isMoving) {
        super(name, miles);
        this.model = model;
        this.color = color;
        this.isMoving = isMoving;
    }

    public void changeTravelDirection(int direction){
        travelDirection(direction);
    }

//    public void changeTravelSpeed(int speed){
//        System.out.println("Car.changeTravelSpeed(): At a rate of " + speed + " mph.");
//        travelSpeed(speed);
//    }

    public void changeTravelTime(int hours){
        System.out.println("Car.changeTravelTime() : It will take " + getName() + " " + hours + " hours to reach the destination");
        travelTime(hours);
    }

//    public void changeTravelDistance(int distance){
//
//        travelDistance(distance);
//    }
}
