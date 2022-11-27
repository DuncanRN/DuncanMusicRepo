package Products.Instruments;

public enum Material {
    ALDER(1),
    BASSWOOD(2),
    MAHOGANY(3),
    WALNUT(4),
    MAPLE(5),
    ROSEWOOD(6);

    private final int value;

    Material(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
