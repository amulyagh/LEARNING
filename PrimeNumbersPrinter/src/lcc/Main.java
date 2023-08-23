package lcc;

import java.util.Scanner;

public class Main {
	public static void printPrimes(int n)
	{
		for(int i=3;i<=n;i++)
		{
			boolean res=checkPrime(i);
			if (res==true)
			{
				System.out.println(i+" ");
			}
		}
	}
	public static boolean checkPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;		
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printPrimes(n);
		checkPrime(n);
	}
}
