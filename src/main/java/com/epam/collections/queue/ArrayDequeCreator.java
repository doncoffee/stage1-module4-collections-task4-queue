package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.addLast(Objects.requireNonNull(firstQueue.poll()));
        integers.addLast(Objects.requireNonNull(firstQueue.poll()));
        integers.addLast(Objects.requireNonNull(secondQueue.poll()));
        integers.addLast(Objects.requireNonNull(secondQueue.poll()));
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(integers.removeLast());
            integers.addLast(Objects.requireNonNull(firstQueue.poll()));
            integers.addLast(Objects.requireNonNull(firstQueue.poll()));
            secondQueue.add(integers.removeLast());
            integers.addLast(Objects.requireNonNull(secondQueue.poll()));
            integers.addLast(Objects.requireNonNull(secondQueue.poll()));
        }
        return integers;
    }
}
