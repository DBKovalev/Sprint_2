package model;
import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food {
    String colour;

    public Apple(int amount, double price, String colour){
        super(amount, price, true);
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }

    @Override
    public double getDiscount(){
        if (Objects.equals(colour, Colour.RED)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        else {
            return Discount.NO_DISCOUNT;
        }
    }
}