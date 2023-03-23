package Homework1;

public class eggs extends food {
    private int countInPack;

    public eggs(String nameValue, int priceValue, int quantityValue, String measureUnitValue, int shelfLifeValue, int countInPackValue) {
        super(nameValue, priceValue, quantityValue, measureUnitValue, shelfLifeValue);
        this.countInPack = countInPackValue;
    }
    
    @Override
    public String toString() {
        return String.format("Name: %s;  price: %d;  quantity: %d; measure unit: %s; shelf life: %d days, count in pack: %d.",
                super.getName(), super.getPrice(), super.getQuantity(), super.getMeasureUnit(), super.getShelfLife(), this.countInPack);
    }
}
