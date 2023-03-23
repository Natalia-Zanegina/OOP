package Homework1;

public class diaper extends babyProducts {

    private int size, minWeight, maxWeight;
    private String type;

    public diaper(String nameValue, int priceValue, int quantityValue, String measureUnitValue, int minAgeValue, boolean isHypoallergenicValue, int sizeValue, int minWeightValue, int maxWeightValue, String typeValue) {
        super(nameValue, priceValue, quantityValue, measureUnitValue, minAgeValue, isHypoallergenicValue);
        this.size = sizeValue;
        this.minWeight = minWeightValue;
        this.maxWeight = maxWeightValue;
        this.type = typeValue;
    }
    
    @Override
    public String toString() {
        return String.format("Name: %s;  price: %d;  quantity: %d; measure unit: %s; minimum age: %d; hypoallergenic: %b, size: %d, min weight: %d kg, max weight: %d kg, type: %s.",
                super.getName(), super.getPrice(), super.getQuantity(), super.getMeasureUnit(), super.getMinAge(), super.getIsHypoallergenic(), this.size, this.minWeight, this.maxWeight, this.type);
    }
}
