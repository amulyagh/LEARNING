package stringjoiner;

import java.util.Scanner;

public class StringJoiner {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your First Name and Last Name");
		String firstName=scan.next();
		String lastName=scan.next();
		System.out.println(joinString(firstName, lastName));
	}
	public static String joinString(String str1, String str2) {
		return str1+" "+str2;
	}

}
