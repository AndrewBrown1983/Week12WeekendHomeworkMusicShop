package Instruments;


import interfaces.ISell;
import interfaces.Iplay;

public class Piano extends Instrument implements ISell, Iplay {

    private int numberOfKeys;

    public Piano(String manufacturer, String colour, InstrumentType type, double buyingPrice, double sellingPrice, int numberOfKeys) {
        super(manufacturer, colour, type, buyingPrice, sellingPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public String play() {
        return "ding dong ding";
    }
}
