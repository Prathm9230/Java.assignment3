//Q10.find second largest element in an array.
package com.bridgelabz.array;
public class Array10 {
    public static void main(String[] args) {
        int[] arr = {90,100, 121, 89, 43, 12, 34, 81};
        int sl = arr[0];//assume,sl --> second largest
        int l = arr[0];//assume,l --> largest
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>l)
            {
              l=arr[i];//arr[i] is greter than largest 'l' means arr[i] is now largest
                sl=l;//'l' is now secondlargest
            }
            else if(arr[i]>sl && arr[i]!=l)
            {
                sl=arr[i];//here,l>arr[i]>sl means arr[i] is second largest but not equal to largest.
            }
        }
        System.out.println("Second largest number in an given array is:"+sl);
        }
    }