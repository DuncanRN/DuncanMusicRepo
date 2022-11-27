package Products.Instruments;

import Behaviours.IPlay;
import Products.Product;

public abstract class Instrument extends Product implements IPlay {
    private Material material;
    private String colour;

    public Instrument(String name, int sellingPrice, int buyingPrice, String description, Material material, String colour){
        super(name, sellingPrice, buyingPrice, description);
        this.material=material;
        this.colour=colour;
    }

    public Material getMaterial() {
        return this.material;
    }
}
