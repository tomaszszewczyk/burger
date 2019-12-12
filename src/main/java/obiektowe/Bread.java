package obiektowe;

import java.math.BigDecimal;

public class Bread extends Product {

    public Bread(BigDecimal price, int calories) {
        super(price, calories);
    }

    @Override
    public String getName() {
        return "Bread";
    }
}
