package Task4;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        DataContainer<String> str = new DataContainer<>();
        DataContainer<Integer> int1 = new DataContainer<>();
        str.add("Hello");
        str.add("Pavel");
        str.add("How are you?");
        str.add("By");
        str.print();
        str.sort(Comparator.reverseOrder());
        str.print();
        int1.add(3);
        int1.add(7);
        int1.add(5);
        int1.add(1);
        int1.add(2);
        int1.print();
        int1.sort(Comparator.reverseOrder());
        int1.print();

    }
}
