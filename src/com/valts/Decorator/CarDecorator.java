package com.valts.Decorator;

public class CarDecorator implements Vehicle{
    private Car car;
    public boolean radioOn = false;

    public CarDecorator(Car car, boolean radioOn) {
        this.car = car;
        this.radioOn = radioOn;
    }

    @Override
    public void openDoors() {
        this.car.openDoors();
    }

    @Override
    public void closeDoors() {
        this.car.closeDoors();
    }

    public void switchRadio() {
        this.radioOn = !this.radioOn;
        System.out.println("radio is on: " + this.radioOn);
    }
}
