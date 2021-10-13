package Assingment;
import java.util.*;
public class CountPunctuation {
	public static void main(String args[]) {
		int punctuation=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence:");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==',' || s.charAt(i)=='-' || s.charAt(i)=='?' || s.charAt(i)=='!' || s.charAt(i)==':' ||  s.charAt(i)==';' || s.charAt(i)=='\'' 
					|| s.charAt(i)=='\"' || s.charAt(i)=='.')
				punctuation++;
			}
			System.out.println("the total number of punctuation is:"+punctuation);
		
		
	}

}