package com.valts.Decorator;

public class Car implements Vehicle{
    public boolean open = false;

    public Car() {
    }

    @Override
    public void openDoors() {
        open = true;
        System.out.println("doors are open");
    }

    @Override
    public void closeDoors() {
        open = false;
        System.out.println("doors are closed");
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
