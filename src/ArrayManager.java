import java.util.Arrays;

public class ArrayManager {
    private int[] data = new int[10];
    private int size = 0;

    public void insert(int value) {
        ensureCapacity();
        data[size++] = value;
        System.out.println(value + " inserted into the array.");
    }

    public boolean delete(int value) {
        int index = search(value);
        if (index == -1) return false;
        for (int i = index; i < size - 1; i++) data[i] = data[i + 1];
        size--;
        return true;
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) return i;
        }
        return -1;
    }

    public void display() {
        if (size == 0) System.out.println("Array is empty.");
        else System.out.println("Array: " + Arrays.toString(toArray()));
    }

    public String displayString() {
        return Arrays.toString(toArray());
    }

    public int[] toArray() {
        return Arrays.copyOf(data, size);
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == data.length) data = Arrays.copyOf(data, data.length * 2);
    }
}
