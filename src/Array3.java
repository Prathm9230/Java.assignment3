
public class Array3 {
    public static void main(String[] args) {
        int[] a={10,2,101,47,89,23,81,92};
        int l=a[0];//consider,a[0] is largest.
        for(int i=0;i<a.length;i++)
        {
        if(a[i]>l){
           l=a[i];
        }
    }
        System.out.println("Largest number of an array is:"+l);
}}
