package obiektowe;

import java.math.BigDecimal;

public class Sauce extends Product{

    public Sauce(BigDecimal price, int calories) {
        super(price, calories);
    }

    @Override
    public String getName() {
        return "Sauce";
    }
}
