package com.bridgelabz.array;

public class Array4 {
    public static void main(String[] args) {
        float[] a= {9.8f,2.7f,4.6f,0.6f};
        float s=a[0];//consider this as smallest element
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<s)
            {
              s=a[i] ;
            }
        }
        System.out.println("Smallest element of an array is:"+s);
    }
}
