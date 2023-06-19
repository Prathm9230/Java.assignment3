//Q2.find the frequency of each element in the array.
public class Array2 {
    public static void main(String[] args) {
        int[] arr = {10, 21, 45, 89, 50, 48, 30, 40, 50, 21};
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 0;
            if(x==-1)continue;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == x) {
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println("Frequency of " +x+ " is:" + count);
        }
    }
}