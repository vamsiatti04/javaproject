import java.util.*;

public class PriorityQueue {

    public static void main(String[] args) {

        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();

        pq.add(50);
        pq.add(20);
        pq.offer(40);
        pq.offer(10);
        pq.add(30);

        System.out.println("Queue: " + pq);
        System.out.println("Peek: " + pq.peek());
        System.out.println("Size: " + pq.size());
        System.out.println("Contains 20: " + pq.contains(20));

        System.out.println("Poll: " + pq.poll());
        System.out.println("After Poll: " + pq);

        pq.remove(40);
        System.out.println("After Remove 40: " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Removing: " + pq.poll());
        }

        System.out.println("Is Empty: " + pq.isEmpty());
    }
}

