package Homework1;

public class food extends Object{

    private int shelfLife;

    public food(String nameValue, int priceValue, int quantityValue, String measureUnitValue, int shelfLifeValue) {
        super(nameValue, priceValue, quantityValue, measureUnitValue);
        this.shelfLife = shelfLifeValue;
    }

    public int getShelfLife(){
        return shelfLife;
    }

    @Override
    public String toString() {
        return String.format("Name: %s;  price: %d;  quantity: %d; measure unit: %s; shelf life: %d days.",
                super.getName(), super.getPrice(), super.getQuantity(), super.getMeasureUnit(), this.shelfLife);
    }
    
}
