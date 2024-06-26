package Exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket {
    private List<String> fruits;

    public Basket() {
        this.fruits = new ArrayList<>();
    }

    public boolean findFruit(String fruit) {
        boolean finder = false ;
        for (String f : fruits) {
            if (f.equals(fruit)) {
                finder = true;
            }
        }
        return finder;
    }

    public boolean removeFruit(String fruit) {
        boolean remover = false;
        if (findFruit(fruit)) {
            System.out.println("Fruit was found. Removing fruit from basket...");
            fruits.remove(fruit);
            remover = true;
        }else System.out.println("Fruit was not found");
        return remover;
    }

    public int position(String fruit){
        return fruits.indexOf(fruit);
    }

    public Collection<String> distinct(){
        return new HashSet<>(fruits);
    }

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public int count(){
        return fruits.size();
    }

    public int customCount(){
        int counter = 0;
        for(String f : fruits)
            counter++;
        return counter;
    }


}
