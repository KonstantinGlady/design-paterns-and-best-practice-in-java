package company.chapter2.factory.abstractfactory;

public class TrackFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle(String size) {
        if (size.equals("small")) {
            return new SmallTrack();
        } else if (size.equals("Large")) {
            return new LargeTrack();
        } else {
            return null;
        }
    }
}

abstract class Track extends Vehicle {
}

class SmallTrack extends Track {
}

class LargeTrack extends Track {
}
