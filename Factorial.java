import java.io.*;
import java.util.*;
public class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value :");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}System.out.println("Factorial of "+i+" is: "+fact);

	}
}