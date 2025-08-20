package com.dev.main;

/**
 *
 * @author huyxuanvu
 */
import com.models.bubble.*;
import java.util.*;

public class Main {

    public static void main(String[] a) {
        int[] arr = INPUT();
        System.out.println("Unsorted array:");
        Print(arr);

        BubbleSort.Sort(arr);
        System.out.println("sorted array:");
        Print(arr);
    }

    public static int[] INPUT() {

        Random rd = new Random();

        int Num = GetInputVaild();
        int[] arr = new int[Num];

        for (int i = 0; i < Num; i++) {

            arr[i] = rd.nextInt(Num);
        }

        return arr;
    }

    public static int GetInputVaild() {
        Scanner en = new Scanner(System.in);
        int num = 0;
        boolean vaild = false;
        while (!vaild) {
            try {
                System.out.println("Enter number of array:");
                num = en.nextInt();
                vaild = true;
            } catch (Exception e) {
                System.out.println("Input must be a decimal");
                en.nextLine();
            }
        }
        return num;
    }

    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
