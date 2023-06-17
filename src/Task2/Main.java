package Task2;


public class Main {
    public static void main(String[] args) {
        Integer[] integersArray = {8, 3, 2, 1, 5, 7};
        Num1<Integer> num1 = new Num1<>();
        num1.printArray(integersArray);

        String[] stringsArray = {"Hello", "Guys", "Hi"};
        Num1<String> num2 = new Num1<>();
        num2.printArray(stringsArray);

    }

}
