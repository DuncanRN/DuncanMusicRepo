package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name=name;
        this.stock = new ArrayList<ISell>();
    }

    public void addToStock(ISell stockItem){
        stock.add(stockItem);
    }

    public void removeFromStock(ISell stockItem){
        stock.remove(stockItem);
    }

    public String getName() {
        return this.name;
    }

    public int getStockQuantity() {
        return this.stock.size();
    }

    public int getTotalPotentialProfits() {
        int potentialProfit = 0;

        for (ISell stockItem : stock)
        {
            potentialProfit+= stockItem.calculateMarkup();
        }
        return potentialProfit;
    }
}
