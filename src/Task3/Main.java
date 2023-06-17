package Task3;

public class Main {
    public static void main(String[] args) {
        Num3<Integer> num1 = new Num3<>();
        Num3<String> num2 = new Num3<>();
        Num3<Double> num3 = new Num3<>();
        Integer intMax = num1.getMax(4, 10);
        String stringMax = num2.getMax("Hello", "Hi, Mommy");
        Double doubleMax = num3.getMax(2.3, 1.5);
        System.out.println(intMax);
        System.out.println(stringMax);
        System.out.println(doubleMax);
    }


}
