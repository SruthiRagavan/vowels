package wiproprog;

import java.util.Scanner;

public class Ex
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
	String str;
	sc = new Scanner(System.in);
	System.out.println("enter string");
	str=sc.nextLine();
	StringBuffer sb = new StringBuffer(str);
	String st = sb.reverse().toString();
	System.out.println("after reversing\t" +st);
	st= st.replaceAll("[aeiouAEIOU]", "");
	System.out.println("after removing vowels\t" +st);
	}
	}
