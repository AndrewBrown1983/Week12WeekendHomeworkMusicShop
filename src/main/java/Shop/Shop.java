package Shop;

import Instruments.Guitar;
import OtherItems.OtherItem;
import interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String address;
    private ArrayList<ISell> stock;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
        this.stock = new ArrayList<ISell>();
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addItem(ISell iSell) {
        this.stock.add(iSell);
    }

    public void removeItem(ISell iSell) {
        if (this.stock.contains(iSell)){
            this.stock.remove(iSell);
        }
    }

    public boolean checkForItem(ISell iSell) {
        return this.stock.contains(iSell);
    }

    public double calculateProfit() {
        double total = 0;
        for (ISell item : this.stock){
            total += item.calculateMarkUp();
        }
        return total;
    }
}
