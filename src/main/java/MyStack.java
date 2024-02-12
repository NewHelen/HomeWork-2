import java.util.Arrays;

public class MyStack <T>{
    private T[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


    public MyStack (){
        this.data = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyStack(int size) {
        this.data = (T[]) new Object[size];
        this.size = 0;
    }

    public void push(T value) {
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
            throw new IllegalStateException("Stack is empty");
        }
        return data[size - 1];
    }

    public T pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }

        T lastValue = data[--size];
        data[size] = null;
        return lastValue;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
    }

}
