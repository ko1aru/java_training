import java.util.Scanner;
import java.util.Arrays;
public class test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String s=sc.nextLine();
        String s="Life is beautiful";
        String sarr[]=s.split(" ");
        int n=sarr.length;
        System.out.println(Arrays.toString(sarr));
        Arrays.sort(sarr, (a,b)->Integer.compare(a.length(),b.length()));
        System.out.println(Arrays.toString(sarr));
        System.out.println("Smallest word: "+sarr[0]);
        System.out.println("Largest word: "+sarr[n-1]);
    }
}
