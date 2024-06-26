package Exercise2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Buquet buquet = new Buquet();

        // adding unique flowers --- nu am stiut cum altcumva sa adaug florile si sa fie diferite
        Set<String> flowers = new HashSet();
        flowers.add("Ghiocel");
        flowers.add("Ghiocel");
        flowers.add("Ghiocel");
        flowers.add("Trandafir");
        flowers.add("Lalea");
        flowers.add("Lalea");
        flowers.add("Floarea soarelui");
        flowers.add("Trandafir");
        flowers.add("Lalea");
        addFlower(buquet, flowers);

        // return all flowers
        System.out.println(buquet.getAll());

        // remove a flower
        buquet.remove("Lalea");
        System.out.println(buquet.getAll());

    }

    private static void addFlower(Buquet buquet, Set<String> flowers) {
        for(String f : flowers){
            if(buquet.find(f) == false){
                buquet.add(f);
            }
        }
    }
}
