package Task1;

public class Num<T> {
    public void printElement(T n){
        System.out.println("Тип Т: = " +n.getClass().getName() + "\n Элемент: "+n);
    }
}
