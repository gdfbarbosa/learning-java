package com.gdfbarbosa.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 3, 2, 1 };

        print(arr);

        int temp;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < (arr.length - j); i++) {
                if (arr[i-1] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
            print(arr);
        }


    }

    private static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}
