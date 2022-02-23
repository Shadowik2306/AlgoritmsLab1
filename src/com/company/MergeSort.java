package com.company;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        if (arr == null) {
            System.out.println("Seriously? NOPE");
            return null;
        }

        if (arr.length <= 1) {
            return arr;
        }
        int middle = arr.length / 2;
        if (arr.length % 2 == 1) {
            middle++;
        }

        int[] leftArray = Arrays.copyOfRange(arr, 0, middle);
        int[] rightArray = Arrays.copyOfRange(arr, middle, arr.length);
        int[] a = mergeSort(leftArray);
        int[] b = mergeSort(rightArray);
        return mergeArray(a, b);
    }

    public static int [] mergeArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int posA = 0;
        int posB = 0;

        for (int i = 0; i < c.length; i++) {
            if (posA < a.length && posB < b.length) {
                if (a[posA] < b[posB]) {
                    c[i] = a[posA];
                    posA++;
                }
                else {
                    c[i] = b[posB];
                    posB++;
                }
            }
            else if (posA == a.length && posB < b.length) {
                c[i] = b[posB];
                posB++;
            }
            else if (posA < a.length && posB == b.length) {
                c[i] = a[posA];
                posA++;
            }
            else {
                c[i] = 0;
            }
        }

        return c;
    }
}
