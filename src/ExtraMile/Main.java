package ExtraMile;

public class Main {
    public static void main(String[] args) {

        CustomSet custom = new CustomSet();

        // adding unique number in unsorted list
        custom.add(4);
        custom.add(4);
        custom.add(3);
        custom.add(2);
        custom.add(1);
        custom.add(2);
        custom.add(3);
        custom.add(1);
        custom.add(5);
        System.out.println(custom);
        System.out.println("-----------------------------------------");

        // sort list
        System.out.println(custom.getList());
        System.out.println("-----------------------------------------");

        // return number of given index from initial list
        System.out.println(custom.getPozition(2));
        System.out.println("-----------------------------------------");

        // remove number from given index from initial list
        custom.removeIndex(2);
        System.out.println(custom);
        System.out.println(custom.getList());

    }
}
