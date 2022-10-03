package com.hr.personnel;

public class Car extends Vehicle {

    @Override
    public void moveTo(String dest) {
        System.out.println("car");
    }
}

class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        vehicle.moveTo("boston");
        Class<? extends Vehicle> aClass = vehicle.getClass();
        System.out.println(aClass);


    }

}
