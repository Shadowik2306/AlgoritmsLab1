package com.company;

import java.util.Arrays;

class Deque {
    int size;
    public int head, end;
    int[] data;
    private static final int MaxSize = 1000;

    public Deque() {
        data = new int[MaxSize];
        size = 0;
        head = 0;
        end = 0;
    }

    public int size() {
        return size;
    }

    public void pushEnd(int elem) {
        if (size == MaxSize) {
            System.out.println("Error. Deque is Full");
        } else if (size == 0) {
            data[0] = elem;
            size++;
            end = head = 0;
        } else {
            end--;
            if (end < 0) {
                end = MaxSize - 1;
            }
            data[end] = elem;
            size++;
        }
    }

    public void pushHead(int elem) {
        if (size == MaxSize) {
            System.out.println("Error. Deque is Full");
        } else if (size == 0) {
            data[0] = elem;
            size++;
            end = head = 0;
        } else {
            head++;
            if (head >= MaxSize) {
                head = 0;
            }
            data[head] = elem;
            size++;
        }
    }

    public int getEnd() {
        return data[end];
    }

    public int getHead() {
        return data[head];
    }

    public int popEnd() {
        if (size == 0) {
            System.out.println("Error. Deque is Empty");
            return -1;
        } else {
            int result = data[end++];
            if (end >= MaxSize) {
                end = 0;
            }
            size--;
            return result;
        }
    }

    public int popHead() {
        if (size == 0) {
            System.out.println("Error. Deque is Empty");
            return -1;
        } else {
            int result = data[head--];
            if (head < 0) {
                head = MaxSize - 1;
            }
            size--;
            return result;
        }
    }

    public void testData() {
        System.out.println(Arrays.toString(data));
    }
}