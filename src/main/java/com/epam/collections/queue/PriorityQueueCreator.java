package com.epam.collections.queue;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> pQueue
                = new PriorityQueue<>(
                Collections.reverseOrder());
        pQueue.addAll(firstList);
        pQueue.addAll(secondList);
        return pQueue;
    }
}
