package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
//        System.out.println(queue1.element());
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);

        System.out.println(queue1.element());

        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
//        System.out.println(queue1.remove());
        System.out.println();

        Queue<Integer> queue2 = new LinkedList<>();
        System.out.println(queue1.peek());

        queue2.offer(3);
        queue2.offer(4);
        queue2.offer(5);

        System.out.println(queue2.peek());

        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
    }
}
