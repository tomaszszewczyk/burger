package obiektowe;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Burger implements Printable{
    private Bread bread;
    private Meat meat;
    private Sauce souce;
    private Set<Igredient> ingredientSet;

    public Burger(Bread b, Meat m, Sauce s, Collection<Igredient> i) {
        bread = b;
        meat = m;
        souce = s;
        ingredientSet = new HashSet<>(i);
    }

    public String getPrintableString(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Burger");
        sb.append(indent).append("Price: ").append(getPrice());
        sb.append(indent).append("Calories: ").append(getCalories());

        for(Igredient i : ingredientSet) {
            sb.append(indent).append(i.getPrintableString(indent + '\t'));
        }

        return sb.toString();
    }

    public int getCalories() {
        int calories = 0;
        calories += bread.getCalories();
        calories += meat.getCalories();
        calories += souce.getCalories();

        for(Igredient i : ingredientSet) {
            calories += i.getCalories();
        }

        return calories;
    }

    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.ZERO;
        price = price.add(bread.getPrice());
        price = price.add(meat.getPrice());
        price = price.add(souce.getPrice());

        for(Igredient i : ingredientSet) {
            price = price.add(i.getPrice());
        }

        return price;
    }
}
