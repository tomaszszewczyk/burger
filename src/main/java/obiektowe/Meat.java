package obiektowe;

import java.math.BigDecimal;

public class Meat extends Product{

    public Meat(BigDecimal price, int calories) {
        super(price, calories);
    }

    @Override
    public String getName() {
        return "Meat";
    }
}
