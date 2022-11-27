package Products.Instruments;

public class Piano extends Instrument{
    private int numberOfKeys;
    public Piano(String name, int sellingPrice, int buyingPrice, String description, Material material, String colour, int numberOfKeys){
        super(name, sellingPrice, buyingPrice, description, material, colour);
        this.numberOfKeys=numberOfKeys;
    }


    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    @Override
    public String play() {
        return "ppplIIINNNK";
    }
}
