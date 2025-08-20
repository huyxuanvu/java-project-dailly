package com.models.bubble;

public class BubbleSort {

    public static void Sort(int[] arr) {
        int n = arr.length;
        boolean tracker;
        for (int i = 0; i < n - 1; i++) {
            tracker = false;
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                    tracker = true;
                }
            }
            if (!tracker) {
                break;
            }
        }

    }

}
