package at.xxx.examples.cars;

public class Car {
    // Memberconstants
    //
    private enum COLOR {RED, BLUE, GREEN, YELLOW};
    final int MAXSPEED;

    // Membervariables
    //
    private COLOR color;
    private int basisPrice;
    private int basisConsumption;
    private Producer producer;
    private Engine engine;

    // Constructor
    //
    public Car(COLOR color, int MAXSPEED, int basisPrice, int basisConsumption, Producer producer, Engine engine) {
        this.color = color;
        this.MAXSPEED = MAXSPEED;
        this.basisPrice = basisPrice;
        this.basisConsumption = basisConsumption;
        this.producer = producer;
        this.engine = engine;
    }

    // Methodes
    //
    private void calcualteBasisPrice() {
        //Der Preis berechnet sich durch den Abzug des Rabatts vom Basispreis.

    }

    private void calculateFuelPrice() {
        //Der Benzinverbrauch entspricht die ersten 50.000km dem Basisverbrauch. Danach wird er um 9.8 Prozent höher.
    }
}