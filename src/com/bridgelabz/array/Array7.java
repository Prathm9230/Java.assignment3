package com.bridgelabz.array;

public class Array7 {
    public static void main(String[] args) {
        byte[] num={89,23,65,92,86,20,53};
        for(int i=0;i<num.length;i++)
        {
          if(i%2==1)
          {
              System.out.println(num[i]);
          }
        }
    }
}
