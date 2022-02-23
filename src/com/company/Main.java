package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
        }

        System.out.println("Source Array: " + Arrays.toString(array));
        int[] result1 = MergeSort.mergeSort(array);
        System.out.println("Merge Sort: " + Arrays.toString(result1));

        //Сортировка перемешиванием также изменяет исходный массив (Исправить не сложно, но огромного смысла нету)
        System.out.println("Source Array: " + Arrays.toString(array));
        int[] result2 = ShakerSort.shakerSort(array);
        System.out.println("Shaker Sort: " + Arrays.toString(result2));
    }
}