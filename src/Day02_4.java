import java.util.Scanner;

public class Day02_4 {
	public static void main(String [] args) {
		/*
		 * int age=20; if(age>19) { System.out.println("성년입니다");
		 * }System.out.println("프로그램 종료");
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
		
		if(avg>=90){
			System.out.println("우등상");
			int num =100;
			System.out.println(num);
			if(avg>=95)
				System.out.println("장학금 수여");
		}else
			System.out.println("우등상x");
		
		System.out.println("졸업");
	}
}


