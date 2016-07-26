package wiproprog;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int n;
		int sum=0;
		System.out.println("enter number of terms to be added");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			sum=sum+i;
		}
System.out.println("sum of N natural numbers are" +sum);
	}

}
