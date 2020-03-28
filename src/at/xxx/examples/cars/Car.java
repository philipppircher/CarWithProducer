package at.xxx.examples.cars;

public class Car {
    // Memberconstants
    //
    public enum COLOR {RED, BLUE, GREEN, YELLOW};
    final int MAXSPEED;

    // Membervariables
    //
    private COLOR color;
    private double basisPrice;
    private double basisPriceInclusiveDiscounter;
    private double priceDiscounter;
    private double basisConsumption;
    private Producer producer;
    private Engine engine;
    private double mileage;
    private boolean isMileageOver50000;

    // Constructor
    //
    public Car(COLOR color, int MAXSPEED, double basisPrice, double basisConsumption,
               double mileage, Producer producer, Engine engine) {
        this.color = color;
        this.MAXSPEED = MAXSPEED;
        this.basisPrice = basisPrice;
        this.basisConsumption = basisConsumption;
        this.producer = producer;
        this.engine = engine;
        this.mileage = mileage;

        calculateBasisPrice();
        calculateFuelConsumption();
    }

    // Methodes
    //
    private void calculateBasisPrice() {
        this.priceDiscounter = this.basisPrice * this.producer.getDiscountInPercent() / 100;
        this.basisPriceInclusiveDiscounter = this.basisPrice - this.priceDiscounter;
    }

    private void calculateFuelConsumption() {
        //Der Benzinverbrauch entspricht die ersten 50.000km dem Basisverbrauch. Danach wird er um 9.8 Prozent höher.
        if (this.isMileageOver50000 == false) {
            if (this.mileage > 50000) {
                this.basisConsumption *= 1.098;
                this.isMileageOver50000 = true;
            }
        }
    }

    private void printCarData() {
        System.out.println("Farbe:                          " + this.color);
        System.out.println("Maximale Geschwindigkeit :      " + this.MAXSPEED + "km/h");
        System.out.println("Basis Preis (exkl. Rabatt):    €" + this.basisPrice);
        System.out.println("Basis Preis (inkl. Rabatt):    €" + this.basisPriceInclusiveDiscounter);
        System.out.println("Preis für " + this.producer.getDiscountInPercent() + "% Rabatt:          €" + this.priceDiscounter);

        System.out.println("Basis Kraftstoffverbrauch:      " + this.basisConsumption + "L");
        System.out.println("Gefahrene Kilometer:            " + this.mileage + "km");
    }

    public void printProducerCarAndEngineData() {
        this.producer.printProducerData();
        this.printCarData();
        this.engine.printEngineData();
        System.out.println();
    }
}