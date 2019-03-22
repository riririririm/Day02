import java.util.Scanner;

public class Day02_6 {
	public static void main(String [] args) {
		/*
		 * int select =3; if(select==1) { System.out.println("Select 1"); }else
		 * if(select==2) { System.out.println("Select 2"); }else {
		 * System.out.println("Select 3"); }
		 */
		
		
		int kor, eng, math, sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력:");
		kor=sc.nextInt();
		System.out.println("영어점수 입력:");
		eng=sc.nextInt();
		System.out.println("수학점수 입력:");
		math=sc.nextInt();
		
		sum=kor+eng+math;
		avg=sum/3.0;
		
		
		if(avg>=90) {
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else if(avg>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
