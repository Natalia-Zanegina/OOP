package Homework1;

public class milk extends drinks {
    
    private double fat;
    private int shelfLife;

    public milk(String nameValue, int priceValue, int quantityValue, String measureUnitValue, int volumeValue, double fatValue, int shelfLifeValue) {
        super(nameValue, priceValue, quantityValue, measureUnitValue, volumeValue);
        this.fat = fatValue;
        this.shelfLife = shelfLifeValue;
    }

    @Override
    public String toString() {
        return String.format("Name: %s;  price: %d;  quantity: %d; measure unit: %s; volume: %d liters, fat: %f percent, shelf life: %d days.",
                super.getName(), super.getPrice(), super.getQuantity(), super.getMeasureUnit(), super.getVolume(), this.fat, this.shelfLife);
    }
}
