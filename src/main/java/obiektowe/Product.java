package obiektowe;

import java.math.BigDecimal;

public abstract class Product implements Printable{
    private BigDecimal price;
    private int calories;

    public Product(BigDecimal price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    public abstract String getName();

    public BigDecimal getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public String getPrintableString(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Name: ").append(getName());
        sb.append(indent).append("\tPrice: ").append(price);
        sb.append(indent).append("\tCalories: ").append(calories);

        return sb.toString();
    }
}
