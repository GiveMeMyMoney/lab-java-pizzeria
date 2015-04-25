import org.junit.Assert;
import pierwsza.Pizza;
import pierwsza.VeggiePizza;

/**
 * Created by Marcin on 2015-04-25.
 */

public class Test {
    @org.junit.Test
    public void Tarray() throws Exception {
        VeggiePizza pizza = new VeggiePizza();
        Assert.assertNull(pizza.toppings);
    }

    public void Tzmienna() throws Exception {
        VeggiePizza pizza = new VeggiePizza();
        Assert.assertNull(pizza.toppings);
        int n=0;
    }
}
