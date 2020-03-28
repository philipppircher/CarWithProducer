package at.xxx.examples.cars;

public class Engine {
    // Memberconstants
    //
    public enum FUELTYPE {GASOLINE, DIESEL};
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

    // Methodes
    //
    public void printEngineData(){
        System.out.println("Kraftstoff:                     " + this.fueltype);
        System.out.println("Pferdestärke:                   " + this.HORSEPOWER + "PS");
    }
}