package WithStrategy;

import WithStrategy.Strategy.DriveStrategy;
import WithStrategy.Strategy.SportsDriveStrategy;

public class SportsCar extends Vehicle{

    SportsCar() {super(new SportsDriveStrategy());}
}
