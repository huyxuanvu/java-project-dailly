package com.dev.main;

/**
 *
 * @author huyxuanvu
 */
import java.util.*;
import com.dev.model.SelectionSort;

public class main {

    public static void main(String[] args) {
        int num = VaildInput();
        int[] arr = getArray(num);

        System.out.print("Unsorted array: " + Arrays.toString(arr));
        System.out.println();
        SelectionSort.Sort(arr);

        System.out.print("Sorted array: " + Arrays.toString(arr));

    }

    public static int[] getArray(int n) {
        int arr[] = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n - 1; i++) {
            arr[i] = rd.nextInt(n);
        }
        return arr;
    }

    public static int VaildInput() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean vaild = false;
        while (!vaild) {
            try {
                System.out.println("Enter number of elements:");
                n = sc.nextInt();
                vaild = true;
            } catch (Exception e) {
                System.out.println("Wrong input.");
                sc.nextLine();
            }
        }

        return n;
    }

}
