package com.company;

public class ShakerSort {

    public static int[] shakerSort(int[] arr) {
        if (arr == null) {
            System.out.println("Seriously? NOPE");
            return null;
        }
        int left = 0;
        int right = arr.length - 1;
        int third_chair;

        while (left <= right) {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    third_chair = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = third_chair;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    third_chair = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = third_chair;
                }
            }
            left++;


        }
        return arr;
    }
}