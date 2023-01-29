package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> generalList = new ArrayList<>(firstList);
        generalList.addAll(secondList);
        generalList.sort(Collections.reverseOrder());
        System.out.println(generalList);
        return new PriorityQueue<>(generalList);
    }
}
