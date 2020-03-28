package at.xxx.examples.cars;

public class Producer {
    // Memberconstants
    //
    private enum NAME {MITSUBISHI, VW, FIAT};
    private enum PRODUCINGCOUNTRY {JAPAN, GERMANY, ITALY};

    // Membervariables
    //
    private NAME name;
    private PRODUCINGCOUNTRY producingcountry;
    private int discountInPercent;

    // Constructor
    //
    public Producer(NAME name, PRODUCINGCOUNTRY producingcountry, int discountInPercent) {
        this.name = name;
        this.producingcountry = producingcountry;
        this.discountInPercent = discountInPercent;
    }
}
