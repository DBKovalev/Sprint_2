package model;

public abstract class Food implements Discountable{
    int amount;
    double price;
    boolean isVegetarian;

    Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double getDiscount(){
        return 0.0;
    }

    public int getAmount(){
        return amount;
    }

    public double getPrice(){
        return price;
    }

    public boolean getIsVegetarian(){
        return isVegetarian;
    }
}
