import java.util.Scanner;

public class Day02_3 {
	public static void main(String [] args) {
		int num=3;
		/*
		 * String result = num%2==0?"짝수":"홀수"; System.out.println(result);
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력:");
		int age = sc.nextInt();
		
		String result = age>=10 && age<20?"10대":"10대가 아님";
		System.out.println(result);
	}
}
