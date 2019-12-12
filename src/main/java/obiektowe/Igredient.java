package obiektowe;

import java.math.BigDecimal;

public class Igredient extends Product{

    public Igredient(BigDecimal price, int calories) {
        super(price, calories);
    }

    @Override
    public String getName() {
        return "Igredient";
    }
}
