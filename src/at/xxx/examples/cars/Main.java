package at.xxx.examples.cars;

public class Main {
    public static void main(String[] args) {

        Producer p1 = new Producer(Producer.NAME.MITSUBISHI);
        Engine e1 = new Engine(Engine.FUELTYPE.GASOLINE, 200);
        Car c1 = new Car(Car.COLOR.YELLOW, 200, 150000.0,
                5, 100000, p1, e1);

        Producer p2 = new Producer(Producer.NAME.VW);
        Engine e2 = new Engine(Engine.FUELTYPE.DIESEL, 150);
        Car c2 = new Car(Car.COLOR.GREEN, 160, 200000.0,
                4, 50000, p2, e2);

        c1.printProducerCarAndEngineData();
        c2.printProducerCarAndEngineData();
    }
}
