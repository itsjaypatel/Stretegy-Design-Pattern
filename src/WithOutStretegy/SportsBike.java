package WithOutStretegy;

public class SportsBike extends Vehicle{

    @Override
    public void drive() {
        //duplicate code present also in SportsCar class also
        System.out.println("sports drive strategy");
    }
}
