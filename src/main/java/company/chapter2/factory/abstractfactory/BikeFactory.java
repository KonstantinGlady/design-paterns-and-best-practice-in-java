package company.chapter2.factory.abstractfactory;

public class BikeFactory {

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory() {
            @Override
            protected Vehicle createVehicle(String size) {
                if (size.equals("small")) {
                    return new MountainBike();
                } else if (size.equals("Large")) {
                    return new LargeCar();
                }
                return null;
            }
        };
        Vehicle bike = factory.orderVehicle("small", "blue");
        System.out.println("bike color: " + bike.color);
    }
}

abstract class Bike extends Vehicle {
}

class MountainBike extends Bike {
}

class CityBike extends Bike {
}
