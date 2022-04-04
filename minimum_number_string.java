import java.util.Scanner;
public class minimum_number_string
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String s=sc.next();
        String s="12pro4gra90m";
        char ch[]=s.toCharArray();
        int a[]=new int[ch.length];
        int num[]=new int[a.length];
        int i, j=0, min=0;
        for(i=0;i<a.length;i++) {
                a[i]=Character.getNumericValue(ch[i]);
        }
        for(i=0;i<a.length;i++) {
            if(a[i]>=1 && a[i]<=9) {
                num[j]=a[i];
                j++;
            }
        }
        min=num[0];
        for(i=0;i<num.length;i++) {
            if(min>num[i] && num[i]>0) {
                min=num[i];
            }
        }
        System.out.println(min);
    }
}