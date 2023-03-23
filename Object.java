package Homework1;

public class Object {
    private String name, measureUnit;
    private int price, quantity;

    public Object(String nameValue, int priceValue, int quantityValue, String measureUnitValue) {
        name = nameValue;
        price = priceValue;
        quantity = quantityValue;
        measureUnit = measureUnitValue;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getMeasureUnit(){
        return measureUnit;
    }

    // @Override
    // public String toString() {
    //     return String.format("Name: %s;  Price: %d;  Quantity: %d; Measure unit: %s.",
    //             this.name, this.price, this.quantity, this.measureUnit);
    // }
}
