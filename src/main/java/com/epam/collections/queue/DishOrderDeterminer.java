package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            list.add(i);
        }
        int n = 1;
        for (int i = 1; integers.size() != numberOfDishes; i++) {
            if (i > numberOfDishes) {
                i = 1;
            }
            if (integers.contains(i)) {
                continue;
            }
            if (n == everyDishNumberToEat) {
                integers.add(i);
                n = 0;
            }
            n++;
        }
        return integers;
    }
}
