import java.util.Scanner;
import java.util.Arrays;
public class freq_of_char {
	/*public static int freq(String a) {
		char ch[]=a.toCharArray();
		int n=ch.length;
		int l=a.length();
		int i, j;
		int freqz[]=new int[n];
		for(i=0;i<l;i++) {
			freqz[i]=1;
			for(j=i+1;j<l;j++) {
				if(a.charAt(i)==a.charAt(j)) {
					freqz[i]++;
				}
			}
			return freqz[i];
		}
		return 0;
	} */
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		String s1=sc.next(); */
		String s1="geeksforgeeks";
		char ch[]=s1.toCharArray();
		Arrays.sort(ch);
		int n=ch.length;
		int l=s1.length();
		int i, j;
		int freqz[]=new int[n];
		for(i=0;i<l;i++) {
			freqz[i]=1;
			for(j=i+1;j<l;j++) {
				if(ch[i]==ch[j]) {
					freqz[i]++;
					ch[j]='0';
				}
			}
		}
		for(i=0;i<freqz.length;i++) {
			if(ch[i]!='0')
			System.out.println(ch[i]+" "+freqz[i]);
		}
	}
}