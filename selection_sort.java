import java.util.Scanner;
public class selection_sort
{
    public static void selsort(int a[]) {
        int i, j, min=0, n=a.length, num=0;
        for(i=0;i<n;i++) {
            min=i;
            for(j=i+1;j<n;j++) {
                if(a[j]<a[min]) {
                    min=j;
                }
            }
            num=a[min];
            a[min]=a[i];
            a[i]=num;
        }
    }
    public static void main(String[] args) {
        int arr[]={9,14,32,43,11,58,22};
        selsort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}