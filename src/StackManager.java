import java.util.Arrays;

public class StackManager {
    private int[] stack = new int[10];
    private int top = -1;

    public void push(int value) {
        ensureCapacity();
        stack[++top] = value;
        System.out.println(value + " pushed onto the stack.");
    }

    public Integer pop() {
        return isEmpty() ? null : stack[top--];
    }

    public Integer peek() {
        return isEmpty() ? null : stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        System.out.println("Stack (top -> bottom): " + displayString());
    }

    public String displayString() {
        if (isEmpty()) return "[]";
        StringBuilder b = new StringBuilder("[");
        for (int i = top; i >= 0; i--) {
            b.append(stack[i]);
            if (i != 0) b.append(", ");
        }
        return b.append("]").toString();
    }

    private void ensureCapacity() {
        if (top + 1 == stack.length) stack = Arrays.copyOf(stack, stack.length * 2);
    }
}
