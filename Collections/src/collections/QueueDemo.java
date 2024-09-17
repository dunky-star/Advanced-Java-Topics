package collections;

/*
* In Java, the PriorityQueue class is implemented using a binary heap data structure.
* This means that the elements in the queue are ordered based on their priority,
* with the highest priority element at the root of the heap.
*
* A binary heap, which is a complete binary tree that satisfies the heap property.
* Default Behavior:
* By default, PriorityQueue in Java is a min heap, meaning the element with the smallest value
* is at the front of the queue.
*
* Time Complexity:
* The basic operations of PriorityQueue (offer, poll, peek) have a time complexity of O(log n)
* */

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void show(){
        Queue<Integer> pq = new PriorityQueue<>(); // Min Heap
        Queue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder()); // Max heap

        pq.add(15);
        pq.add(115);
        pq.add(50);
        pq.add(60);
        //pq.offer(20);
        //pq.offer(2);

        System.out.println("Priority Queue: " +pq);
        Integer topPeek = pq.peek(); // Get the head element without removing
        Integer topPoll = pq.poll(); // Remove and return the head element
        System.out.println("Top queue element: " +topPeek);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }

}
