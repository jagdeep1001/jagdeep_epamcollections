package org.homeTask;

import java.util.Arrays;

public class myCustomClass<T> {
    private static final int default_cap = 10;
    private Object arr[];
    private int index = 0;

    public myCustomClass() {
        arr = new Object[default_cap];
    }

    public void add(T t) {
        if(index==arr.length){
            increaseCapacity();
        }
        arr[index++] = t;
    }

    public T get(int i) {
        return (T) arr[i];
    }

    public T remove(int i) {
        i=i-1;
        Object ele = arr[i];
        int toBeRemoved =arr.length - ( i + 1 ) ;
        System.arraycopy( arr, i + 1, arr, i,toBeRemoved) ;
        index--;
        return (T) ele;
    }
    public int size() {
        return index;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < index; i++) {
            sb.append(arr[i].toString());
            if (i < (index) - 1) {
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }
    public void increaseCapacity(){
        int newsize=arr.length+5;
        arr=Arrays.copyOf(arr,newsize);
    }

}
