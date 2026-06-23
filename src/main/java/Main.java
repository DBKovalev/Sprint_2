import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100.0);
        Apple redApples = new Apple(10, 50.0, Colour.RED);
        Apple greenApples = new Apple(8, 60.0, Colour.GREEN);

        Food[] products = {meat, redApples, greenApples};

        ShoppingCart shoppingCart = new ShoppingCart(products);
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getTotalPriceWithDiscount());
        System.out.println("Сумму всех вегетарианскийх продуктов без скидки: " + shoppingCart.getTotalPriceVegetarianFoodWithoutDiscount());
    }
}
