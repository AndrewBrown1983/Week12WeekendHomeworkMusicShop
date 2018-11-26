package Instruments;

import interfaces.ISell;
import interfaces.Iplay;

public class Guitar extends Instrument implements Iplay, ISell {

    private int numberOfStrings;

    public Guitar(String manufacturer, String colour, InstrumentType type, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(manufacturer, colour, type, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return "strum strum";
    }
}
