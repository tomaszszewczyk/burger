package obiektowe;

import java.math.BigDecimal;

public class Chips extends Product {

    public Chips(BigDecimal price, int calories) {
        super(price, calories);
    }

    @Override
    public String getName() {
        return "Chips";
    }
}
