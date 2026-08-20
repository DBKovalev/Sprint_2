package service;
import model.Food;

public class ShoppingCart {
    private Food[] positions;

    public ShoppingCart(Food[] positions) {
        this.positions = positions;
    }

    public double getTotalPriceWithoutDiscount(){
        double total = 0.0;
        for (int i = 0; i < positions.length; i++){
            total += positions[i].getAmount() * positions[i].getPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount(){
        double total = 0.0;
        for (int i = 0; i < positions.length; i++){
            double discount = positions[i].getDiscount();
            total += positions[i].getAmount() * positions[i].getPrice() * ((100.0 - discount) / 100);
        }
        return total;
    }

    public double getTotalPriceVegetarianFoodWithoutDiscount(){
        double total = 0.0;
        for (int i = 0; i < positions.length; i++){
            if (positions[i].getIsVegetarian()){
                total += positions[i].getAmount() * positions[i].getPrice();
            }
        }
        return total;
    }
}
