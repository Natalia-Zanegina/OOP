package Homework1;

public class hygiene extends Object{

    private int number;

    public hygiene(String nameValue, int priceValue, int quantityValue, String measureUnitValue, int numberValue) {
        super(nameValue, priceValue, quantityValue, measureUnitValue);
        this.number = numberValue;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("Name: %s;  price: %d;  quantity: %d; measure unit: %s; number of pieces per pack: %d pieces.",
                super.getName(), super.getPrice(), super.getQuantity(), super.getMeasureUnit(), this.number);
    }
    
}
