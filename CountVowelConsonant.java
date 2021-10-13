package Assingment;
import java.util.*;
public class CountVowelConsonant {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		s=s.toLowerCase();
		int Vcount=0;
		int Ccount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u') {
				Vcount++;
			}else if(s.charAt(i)>'a' && s.charAt(i)<='z') {
				Ccount++;
			}
		}
		System.out.println("total number of vowels present in the sentence is:"+Vcount);
		System.out.println("total number of consonant present in the sentence is:"+Ccount);
	}
}
