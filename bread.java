package Homework1;

public class bread extends food{

    private String typeOfFlour;

    public bread(String nameValue, int priceValue, int quantityValue, String measureUnitValue, int shelfLifeValue, String typeOfFlourValue) {
        super(nameValue, priceValue, quantityValue, measureUnitValue, shelfLifeValue);
        this.typeOfFlour = typeOfFlourValue;
    }
    
    @Override
    public String toString() {
        return String.format("Name: %s;  price: %d;  quantity: %d; measure unit: %s; shelf life: %d days, type of flour: %s.",
                super.getName(), super.getPrice(), super.getQuantity(), super.getMeasureUnit(), super.getShelfLife(), this.typeOfFlour);
    }
}
