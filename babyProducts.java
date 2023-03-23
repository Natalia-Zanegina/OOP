package Homework1;

public class babyProducts extends Object{
    private int minAge;
    private boolean isHypoallergenic;

    public babyProducts(String nameValue, int priceValue, int quantityValue, String measureUnitValue, int minAgeValue, boolean isHypoallergenicValue) {
        super(nameValue, priceValue, quantityValue, measureUnitValue);
        this.minAge = minAgeValue;
        this.isHypoallergenic = isHypoallergenicValue;
    }

    public int getMinAge() {
        return minAge;
    }

    public boolean getIsHypoallergenic(){
        return isHypoallergenic;
    }
    
    @Override
    public String toString() {
        return String.format("Name: %s;  price: %d;  quantity: %d; measure unit: %s; minimum age: %d; hypoallergenic: %b.",
                super.getName(), super.getPrice(), super.getQuantity(), super.getMeasureUnit(), this.minAge, this.isHypoallergenic);
    }
}
