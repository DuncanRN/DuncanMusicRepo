package Products;

import Behaviours.ISell;
public abstract class Product implements ISell {
    private String name;
    private int sellingPrice;
    private int buyingPrice;
    private String description;

    public Product(String name, int sellingPrice, int buyingPrice, String description){
        this.name=name;
        this.sellingPrice=sellingPrice;
        this.buyingPrice=buyingPrice;
        this.description=description;
    }

    public String getName() {
        return this.name;
    }

    public int getBuyingPrice() {
        return this.buyingPrice;
    }

    public int getSellingPrice() {
        return this.sellingPrice;
    }

    public int calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }
}
