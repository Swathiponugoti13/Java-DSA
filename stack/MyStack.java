package stack;
public class MyStack {

    private int[] stackArray;
    private int top;

    MyStack(int initialCapacity) {
        stackArray = new int[initialCapacity];
        top = -1;
    }


    public void push(int value) {

        if (top == stackArray.length - 1) {
            expandCapacity();
        }
        top++;
        stackArray[top] = value;
        System.out.println("Pushed: " + value);
    }


    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = stackArray[top];
        top--;
        System.out.println("Popped: " + value);
        return value;
    }


    public int size() {
        return top + 1;
    }


    private void expandCapacity() {
        int newCapacity = stackArray.length * 2;
        int[] newArray = new int[newCapacity];
        for (int i = 0; i <= top; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;
        System.out.println("Stack capacity expanded to " + newCapacity);
    }
}

