package com.bridgelabz.array;

public class Array8 {
    public static void main(String[] args) {
        byte[] num={89,23,65,92,10,89,20,53,20,10};
        for(int i=0;i<num.length-1;i++)
        {
            for(int j=i+1;j<num.length;j++)
                /* i+1 because it will again take index 0 which is already taken by outer for since here we are
                finding duplicates */
            {
                if(num[i]==num[j])
                {
                    System.out.println(num[i]);
                }

            }
        }
    }
}
