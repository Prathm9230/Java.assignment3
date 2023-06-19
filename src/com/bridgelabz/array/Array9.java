package com.bridgelabz.array;

public class Array9 {
    public static void main(String[] args) {
        int[] a = {90, 78, 65, 89, 43, 12, 34, 81};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Elements in ascending order are:");
        for (int num : a) {
            System.out.println(num);
    }
}}
