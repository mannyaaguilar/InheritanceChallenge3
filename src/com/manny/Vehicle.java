package com.manny;

public class Vehicle {

    private String name;
    private int year;

    private int speed;
    private int distanceDriven;
    private int totalTime;
    private int currentDirection;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;

        this.speed = 0;
        this.distanceDriven = 0;
        this.totalTime = 0;
        this.currentDirection = 0;
    }

    public void travelDistance(int distance){
        this.distanceDriven = distance;
        System.out.println("Car.travelDistance() : for " + distance + " miles.");
    }

    public void travelSpeed(int speed){
        this.speed = speed;
        System.out.println("Car.changeTravelSpeed(): At a rate of " + speed + " mph.");
    }

    public void travelTime(int time){
        this.totalTime = time;
    }

    public void travelDirection(int direction){
        this.currentDirection = direction;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistanceDriven() {
        return distanceDriven;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.distanceDriven = 0;
    }
}
