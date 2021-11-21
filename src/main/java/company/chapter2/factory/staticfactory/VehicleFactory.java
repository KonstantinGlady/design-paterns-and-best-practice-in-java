package company.chapter2.factory.staticfactory;

public class VehicleFactory {

    public enum VehicleType {
        Bike, Track, Car
    }

    public static Vehicle create(VehicleType type) {
        if (type.equals(VehicleType.Bike)) {
            return new Bike();
        } else if (type.equals(VehicleType.Car)) {
            return new Car();
        } else if (type.equals(VehicleType.Track)) {
            return new Track();
        } else return null;
    }
}

abstract class Vehicle {
}

class Bike extends Vehicle {
}

class Car extends Vehicle {
}

class Track extends Vehicle {
}