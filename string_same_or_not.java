import java.util.Scanner;
import java.util.Arrays;
public class string_same_or_not
{
    public static void main(String[] args) {
    	/*Scanner sc=new Scanner(System.in);
    	String s1=sc.nextLine();
    	String s2=sc.nextLine(); */
        String s1="Excellent man";
        String s2="tnellecxE man";
        char st1[]=s1.toLowerCase().toCharArray();
        char st2[]=s2.toLowerCase().toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
        String a=new String(st1);
        String b=new String(st2);
        boolean x=false;
        if(a.length()==b.length()) {
        	abc: for(int i=0;i<a.length();i++) {
        		if(a.charAt(i)==b.charAt(i)) {
        			x=true;
        		} else {
        			x=false;
        			break abc;
        		}
        	}
        }
        if(x==true) {
        	System.out.println("'"+s1+"'"+" and "+"'"+s2+"'"+" are same");
        } else {
        	System.out.println("'"+s1+"'"+" and "+"'"+s2+"'"+" not same");
        }
    }
}