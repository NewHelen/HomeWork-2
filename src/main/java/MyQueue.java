import java.util.Arrays;

public class MyQueue <T>{
    private T[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyQueue (){
        this.data = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyQueue(int size) {
        this.data = (T[]) new Object[size];
        this.size = 0;
    }

    public void add(T value) {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }
        data[size++] = value;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek (){
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[0];
    }

    public T poll(){
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        T firstElement = data[0];
        System.arraycopy(data, 1, data, 0, --size);
        return firstElement;
    }

}
