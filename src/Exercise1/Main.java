package Exercise1;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        // adding fruits
        basket.addFruit("Apple");
        basket.addFruit("Orange");
        basket.addFruit("Pineapple");
        basket.addFruit("Apple");

        // finding fruits
        System.out.println(basket.findFruit("Apple"));
        System.out.println(basket.findFruit("Banana"));

        // removing fruit from basket if found
        System.out.println(basket.removeFruit("Pineapple"));
        System.out.println(basket.findFruit("Pineapple"));

        // unique collecton
        System.out.println(basket.distinct());

        // count fruits in 2 methods
        System.out.println(basket.count());
        System.out.println(basket.customCount());

    }
}
