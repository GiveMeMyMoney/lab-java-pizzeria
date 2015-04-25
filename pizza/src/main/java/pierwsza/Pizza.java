package pierwsza;

import java.util.ArrayList;

    abstract public class Pizza {
        String name;
        String dough;
        String sauce;
        public ArrayList<String> toppings = new ArrayList<String>();

        public String getName() {
            return name;
        }

        public void prepare() {
            System.out.println("Prepare " + name);
            System.out.println("Tossing dough...");
            System.out.println("Adding sauce...");
            System.out.println("Adding toppings: ");
            for (String topping : toppings) {
                System.out.println("   " + topping);
            }
        }

        public void bake() {
            System.out.println("Baking " + name);
        }

        public void cut() {
            System.out.println("Cutting " + name);
        }

        public void box() {
            System.out.println("Boxing " + name);
        }

        public String toString() {
            StringBuffer display = new StringBuffer();
            display.append("---- " + name + " ----\n");
            display.append(dough + "\n");
            display.append(sauce + "\n");
            for (String topping : toppings) {
                display.append(topping + "\n");
            }
            return display.toString();
        }
    }
