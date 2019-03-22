import java.util.Scanner;

public class Day02_1 {
	public static void main(String [] args) {
		int num=10;
		int num2=10;
		
		System.out.println(num==num2);
		System.out.println(num!=num2);
		
		double d = 10;
		System.out.println(num==d);
		
		String str1 ="10";
		String str2="10";
		//System.out.println(num==str1);
		System.out.println(str1==str2);
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("숫자입력"); String str3
		 * = sc.next(); System.out.println(str1==str3); //false 레퍼런스타입은 x
		 }*/
		char ch='a';
		System.out.println(ch == 96);
	}
	
}
