package at.xxx.examples.cars;

public class Engine {
    // Memberconstants
    //
    private enum FUELTYPE {GASOLINE, DIESEL};
    private final int HORSEPOWER;

    // Membervariables
    //
    private FUELTYPE fueltype;

    // Constructor
    //
    public Engine(FUELTYPE fueltype, int HORSEPOWER) {
        this.fueltype = fueltype;
        this.HORSEPOWER = HORSEPOWER;
    }
}