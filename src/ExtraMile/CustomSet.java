package ExtraMile;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.TreeSet;

public class CustomSet {
    ArrayList<Integer> arrayList;

    public CustomSet() {
        this.arrayList = new ArrayList<>();
    }

    public void add(Integer number) {
        if (!arrayList.contains(number))
            arrayList.add(number);
    }

    public TreeSet<Integer> getList() {
        TreeSet<Integer> list = new TreeSet<>();
        for (Integer i : arrayList)
            list.add(i);
        return list;
    }

    public Integer getPozition(int index) {
        for (int i = 0; i < arrayList.size(); i++){
            if(i==index)
                return arrayList.get(i);
        }
        return null;
    }

    public void removeIndex(int index){
        for (int i = 0; i < arrayList.size(); i++){
            if(i==index)
                arrayList.remove(i);
        }
    }


    @Override
    public String toString() {
        return "CustomSet " +
                "numberList = " + arrayList
                ;
    }
}
