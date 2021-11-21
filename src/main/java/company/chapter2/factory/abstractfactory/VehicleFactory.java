package company.chapter2.factory.abstractfactory;

public abstract class VehicleFactory {

    protected abstract Vehicle createVehicle(String item);

    public Vehicle orderVehicle(String size, String color) {
        Vehicle vehicle = createVehicle(size);
        vehicle.testVehicle();
        vehicle.setColor(color);

        return vehicle;
    }

}

abstract class Vehicle {

     String color;

    public void testVehicle() {
        //implementation
    }

    public void setColor(String color) {
        this.color = color;
    }
}
