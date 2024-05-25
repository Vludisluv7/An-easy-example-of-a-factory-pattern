package org.example;

public class CarFactory {
    public Car createCar(String type) {
        if ("sedan".equalsIgnoreCase(type)) {
            return new Sedan();
        } else if ("suv".equalsIgnoreCase(type)) {
            return new Suv();
        }
        throw new IllegalArgumentException("Unknown car type: " + type);
    }
}
