package com.noob.DS;

public class DynamicArrays {
    int[] arr = new int[10];
    int size = 0;

    public void add(int data) {
        if (size == arr.length) {
            int[] temp = new int[arr.length * 2];
            System.out.println("Resizing......");
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[size] = data;
        size++;
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        DynamicArrays dynamicArrays = new DynamicArrays();
        dynamicArrays.add(10);
        dynamicArrays.add(20);
        dynamicArrays.add(30);
        dynamicArrays.add(40);
        dynamicArrays.add(50);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        dynamicArrays.add(60);
        System.out.println(dynamicArrays.size());
        for (int i = 0; i < dynamicArrays.size(); i++) {
            System.out.println("the i is : " + i + " the value is : " + dynamicArrays.get(i));
        }
    }
}
