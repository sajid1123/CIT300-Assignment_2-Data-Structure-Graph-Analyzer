public class QueueManager {
    private int[] queue = new int[10];
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public void enqueue(int value) {
        ensureCapacity();
        queue[rear] = value;
        rear = (rear + 1) % queue.length;
        size++;
        System.out.println(value + " added to the queue.");
    }

    public Integer dequeue() {
        if (isEmpty()) return null;
        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }

    public Integer peek() {
        return isEmpty() ? null : queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        System.out.println("Queue (front -> rear): " + displayString());
    }

    public String displayString() {
        if (isEmpty()) return "[]";
        StringBuilder b = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            b.append(queue[(front + i) % queue.length]);
            if (i < size - 1) b.append(", ");
        }
        return b.append("]").toString();
    }

    private void ensureCapacity() {
        if (size < queue.length) return;
        int[] n = new int[queue.length * 2];
        for (int i = 0; i < size; i++) n[i] = queue[(front + i) % queue.length];
        queue = n;
        front = 0;
        rear = size;
    }
}
