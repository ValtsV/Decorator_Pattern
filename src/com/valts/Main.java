package com.valts;

import com.valts.Decorator.Car;
import com.valts.Decorator.CarDecorator;

public class Main {

    public static void main(String[] args) {
        CarDecorator car1 = new CarDecorator(new Car(), false);

        car1.switchRadio();
        car1.openDoors();
    }
}
