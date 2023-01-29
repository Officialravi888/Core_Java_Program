package org.example;

class Vehicle {
    private String make;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}

public class NoClassDefFoundErrorExample {
    public static void main(String args[]) {
        Vehicle vehicle = new Vehicle();
        vehicle.setMake("Audi");
        System.out.println("Make = " + vehicle.getMake());
    }
}
