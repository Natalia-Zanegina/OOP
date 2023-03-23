package Homework1;

public class drinks extends Object {

    private int volume;

    public drinks(String nameValue, int priceValue, int quantityValue, String measureUnitValue, int volumeValue) {
        super(nameValue, priceValue, quantityValue, measureUnitValue);
        this.volume = volumeValue;
    }

    public int getVolume(){
        return volume; 
    }

    public String getName(){
        return super.getName();
    }

    public int getPrice(){
        return super.getPrice();
    }

    public int getQuantity(){
        return super.getQuantity();
    }

    public String getMeasureUnit(){
        return super.getMeasureUnit();
    }


    @Override
    public String toString() {
        return String.format("Name: %s;  price: %d;  quantity: %d; measure unit: %s; volume: %d liters.",
                super.getName(), super.getPrice(), super.getQuantity(), super.getMeasureUnit(), this.volume);
    }
    
}
