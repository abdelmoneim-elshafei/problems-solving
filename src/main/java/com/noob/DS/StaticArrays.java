package com.noob.DS;

public class StaticArrays {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int[] a = new int[]{1, 2, 3, 4, 5}; //java style
        int b[] = new int[]{1, 2, 3, 4, 5}; //c style

        for(int i : a) {
            System.out.println(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
