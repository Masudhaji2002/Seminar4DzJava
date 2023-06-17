package Task1;

public class Main {
    public static void main(String[] args) {
        Num<String> n1 = new Num<>();
        Num<Integer> n2 = new Num<>();
        Num<Double> n3 = new Num<>();
        n1.printElement("Hello");
        n2.printElement(5);
        n3.printElement(3.4);
    }
}