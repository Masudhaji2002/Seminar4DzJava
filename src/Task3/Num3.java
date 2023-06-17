package Task3;

public class Num3<T extends Comparable<T>> {
    public T getMax(T n, T m){
        if(n.compareTo(m) >= 0){
            return n;
        }
        else{
            return m;
        }
    }
}
