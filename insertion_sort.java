//import java.util.Scanner;
public class insertion_sort
{
    public static void inssort(int arr[]) {
        int i, j, temp=0;
        int n=arr.length;
        for(i=1;i<n;i++) {
            temp=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int a[]={92, 50, 5,20, 11, 22};
        inssort(a);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}