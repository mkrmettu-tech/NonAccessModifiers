package com.example.NonAccessModifiers;


abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Fuel is petrol");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}
