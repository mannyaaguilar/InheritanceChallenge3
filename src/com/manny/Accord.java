package com.manny;

public class Accord extends Car {

    public Accord() {
        super("Honda Touring", 33000, "Touring", "Metallic Grey", true);
    }

//    public void drivingSpeed(){
//        int newDrivingSpeed = getDistanceDriven() / getTotalTime();
//        if(newDrivingSpeed == 0){
//            stop();
//        }else if(newDrivingSpeed > 0){
//            changeTravelSpeed(newDrivingSpeed);
//        }
//        totalTime();
//    }

    public void totalTime(){
        int newTotalTime = getDistanceDriven() / getSpeed();
        if(newTotalTime == 0){
            stop();
        }else if(newTotalTime > 0){
            changeTravelTime(newTotalTime);
        }
    }

    public void directionDriving(int direction){
        int newDirection = direction;

        switch(newDirection){
            case 0:
                System.out.println(getName() + " is stopped");
                break;

            case 1:
                System.out.println(getName() + " is driving North");
                break;

            case 2:
                System.out.println(getName() + " is driving South");
                break;

            case 3:
                System.out.println(getName() + " is driving East");
                break;

            case 4:
                System.out.println(getName() + " is driving West");
                break;

            default:
                System.out.println("Unknown");
                break;
        }
        changeTravelDirection(newDirection);
    }
}
