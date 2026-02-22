import java.util.*;

public class Stack {

    public static void main(String[] args) {

        java.util.Stack<Integer> stack = new java.util.Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Search 20: " + stack.search(20));

        System.out.println("Pop: " + stack.pop());
        System.out.println("After Pop: " + stack);

        while (!stack.isEmpty()) {
            System.out.println("Removing: " + stack.pop());
        }

        System.out.println("Is Empty: " + stack.isEmpty());
    }
}

