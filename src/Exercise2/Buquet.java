package Exercise2;

import java.util.*;

public class Buquet {
    private Set<String> flowers;

    public Buquet(){
        this.flowers = new HashSet<>();
        }

        public Collection<String> getAll(){
            return flowers;
    }

        public void add(String flower){
            flowers.add(flower);
        }

        public boolean find(String flower){
            boolean finder = false;
            if(flowers.contains(flower)){
                finder = true;
            }
            return finder;
        }

        public void remove(String flower){
        flowers.remove(flower);
        }



    }

