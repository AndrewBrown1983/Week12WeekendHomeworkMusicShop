package Instruments;

import interfaces.ISell;
import interfaces.Iplay;

public abstract class Instrument implements Iplay, ISell {

    private String manufacturer;
    private String colour;
    private InstrumentType type;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String manufacturer, String colour, InstrumentType type, double buyingPrice, double sellingPrice) {
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkUp(){
        return sellingPrice - buyingPrice;
    }
}
