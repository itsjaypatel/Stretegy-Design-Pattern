package WithStrategy;

import WithStrategy.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{

    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
