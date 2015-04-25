package pierwsza;
/**
 * Created by Marcin on 2015-04-22.
 */

import java.util.Scanner;

public class Start {

    public static void main(String [] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        Pizza pizza = store.orderPizza(text);
        System.out.println("We ordered a " + pizza.getName() + "\n");

        text = input.nextLine();

        pizza = store.orderPizza(text);
        System.out.println("We ordered a " + pizza.getName() + "\n");

        text = input.nextLine();

        pizza = store.orderPizza(text);
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
