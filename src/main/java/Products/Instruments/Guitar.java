package Products.Instruments;

public class Guitar extends Instrument{
    private int numberOfStrings;
    public Guitar(String name, int sellingPrice, int buyingPrice, String description, Material material, String colour, int numberOfStrings){
        super(name, sellingPrice, buyingPrice, description, material, colour);
        this.numberOfStrings=numberOfStrings;
    }

    @Override
    public String play() {
        return "Kerrang!";
    }
}
