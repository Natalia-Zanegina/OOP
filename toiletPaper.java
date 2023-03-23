package Homework1;

public class toiletPaper extends hygiene {

    private int numberOfLayers;
    public toiletPaper(String nameValue, int priceValue, int quantityValue, String measureUnitValue, int numberValue, int numberOfLayersValue){
        super(nameValue, priceValue, quantityValue, measureUnitValue, numberValue);
        this.numberOfLayers = numberOfLayersValue;
}
    @Override
    public String toString() {
        return String.format("Name: %s;  price: %d;  quantity: %d; measure unit: %s; number of pieces per pack: %d pieces; number of layers: %d.",
                super.getName(), super.getPrice(), super.getQuantity(), super.getMeasureUnit(), super.getNumber(), this.numberOfLayers);
    }
}
