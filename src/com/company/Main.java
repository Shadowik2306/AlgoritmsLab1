package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
        }
        long start, finish, elapsed;

        System.out.println("Source Array: " + Arrays.toString(array));
        start = System.currentTimeMillis();
        int[] result1 = MergeSort.mergeSort(array);

        finish = System.currentTimeMillis();
        System.out.println("Merge Sort: " + Arrays.toString(result1));
        elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);

        //Сортировка перемешиванием также изменяет исходный массив (Исправить не сложно, но огромного смысла нету)
        System.out.println("Source Array: " + Arrays.toString(array));
        start = System.currentTimeMillis();
        int[] result2 = ShakerSort.shakerSort(array);
        finish = System.currentTimeMillis();
        System.out.println("Shaker Sort: " + Arrays.toString(result2));
        elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
    }
}