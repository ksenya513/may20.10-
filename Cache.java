import java.util.*;
public class Cache<T>{
    private ArrayDeque<T> array;
    private int n;
    public Cache(int n){
        this.n=n;
        this.array=new ArrayDeque<>(n);
    }
    public void add(T item){
        array.addLast(item);
        if (array.size()>n){
            array.removeFirst();
        }
    }
    public boolean remove(T item){
        boolean removedItem=array.remove(item);
        if(removedItem){
        return true;
    } else {
        return false;
    }

    }
    public boolean exists(T item){
        boolean foundedItem=array.contains(item); 
        return foundedItem;
    }
    public T getFirst(){
        T firstItem=array.getFirst();
        if (firstItem!=null){
        return firstItem;
        }else{
            return null;
        }
    }
    public T getLast(){
        T lastItem=array.getLast();
        if (lastItem!=null){
        return lastItem;
        }else{
            return null;
        }
    }
    public T getItemByIndex(int i){
        if (i<0 && i> array.size()){
            return null;
        }else {
        Iterator<T> Iitem=array.iterator(i);
        return Iitem;
        }
    }
}