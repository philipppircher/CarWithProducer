package at.xxx.examples.cars;

public class Producer {
    // Memberconstants
    //
    public enum NAME {MITSUBISHI, VW, FIAT};
    private enum PRODUCINGCOUNTRY {JAPAN, GERMANY, ITALY};

    // Membervariables
    //
    private NAME name;
    private PRODUCINGCOUNTRY producingCountry;
    private int discountInPercent;

    // Constructor
    //
    public Producer(NAME name) {
        this.name = name;
        setProducingCountry();
        setDiscountInPercent();
    }

    // Methodes
    //
    public void printProducerData() {
        System.out.println("Firmenname:                     " + this.name);
        System.out.println("Herstellerland:                 " + this.producingCountry);
        System.out.println("Rabatt in Prozent :             " + getDiscountInPercent() + "%");
    }

    // Getter/Setter
    //
    private void setDiscountInPercent() {
        switch (name) {
            case MITSUBISHI:
                this.discountInPercent = 22;
                break;
            case VW:
                this.discountInPercent = 18;
                break;
            case FIAT:
                this.discountInPercent = 30;
                break;
        }
    }

    private void setProducingCountry() {
        switch (name) {
            case MITSUBISHI:
                this.producingCountry = PRODUCINGCOUNTRY.JAPAN;
                break;
            case VW:
                this.producingCountry = PRODUCINGCOUNTRY.GERMANY;
                break;
            case FIAT:
                this.producingCountry = PRODUCINGCOUNTRY.ITALY;
                break;
        }
    }

    public int getDiscountInPercent() {
        return discountInPercent;
    }
}
