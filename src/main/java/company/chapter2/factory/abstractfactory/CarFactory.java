package company.chapter2.factory.abstractfactory;

public class CarFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle(String size) {
        if (size.equals("small")) {
            return new SmallCar();
        } else if (size.equals("Large")) {
            return new LargeCar();
        }
        return null;
    }
}

abstract class Car extends Vehicle {
}

class SmallCar extends Car {
}

class LargeCar extends Car {
}
