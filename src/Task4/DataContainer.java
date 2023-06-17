package Task4;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class DataContainer<T> {
    private T[] elements;
    private int size;

    public DataContainer() {
        this.elements = (T[]) new Object[5];
        this.size = 0;
    }

    void add(T element){
        if(size >= elements.length){
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = element;
        size++;
    }
     T get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Индекс выходит за рамки:" + index);
        }
        return (T) elements[index];
    }
    void sort(Comparator<? super T> comparator){
        Arrays.sort(elements, 0, size, comparator);
    }

    void print(){
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

}
