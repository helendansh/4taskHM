package com.company;
import java.util.*;

/**
 * Зачтено 03.06.2021
 */

public class Main {

    public static void main(String[] args) {
        Map<String,Integer> testmap = createMap();
        removeItemFromMap(testmap);
        System.out.println(testmap);
    //  System.out.println(testmap);  //проверка
    }

    public static Map<String, Integer> createMap () {
        Map <String, Integer> map = new HashMap<>();
        map.put("Иванов", 379);
        map.put("Петров", 945);
        map.put("Смирнов", 1678);
        map.put("Воробьева", 1794);
        map.put("Крылова", 368);
        map.put("Быков", 580);
        map.put("Дятлов", 1367);
        map.put("Волкова", 367);
        map.put("Зайцев", 963);
        map.put("Семенова", 457);
        return map;
    }

    public static void removeItemFromMap(Map <String, Integer> map) {
        map.entrySet().removeIf(i -> i.getValue() < 500);
    }
}