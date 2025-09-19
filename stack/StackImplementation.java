package stack;
public class StackImplementation {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Current size: " + stack.size());

        stack.pop();
        stack.pop();

        System.out.println("Current size after pops: " + stack.size());

    }
}

