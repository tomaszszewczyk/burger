package obiektowe;

import java.math.BigDecimal;

public class Order {
    private Burger burger;
    private Chips chips;

    public Order(Burger b, Chips c) {
        burger = b;
        chips = c;
    }

    public void print() {
        System.out.println("Order");
        System.out.println("Price: " + getPrice());
        System.out.println("Calories: " + getCalories());
        System.out.println(burger.getPrintableString("\t"));
        System.out.println(chips.getPrintableString("\t"));
    }

    private int getCalories() {
        return burger.getCalories() + chips.getCalories();
    }

    private BigDecimal getPrice() {
        return burger.getPrice().add(chips.getPrice());
    }
}
