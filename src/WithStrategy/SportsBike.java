package WithStrategy;

import WithStrategy.Strategy.SportsDriveStrategy;

public class SportsBike extends Vehicle{
    SportsBike(){
        super(new SportsDriveStrategy());
    }
}
