import java.util.Scanner;

public class Day02_11 {
	public static void main(String [] args) {
		int kor=0, eng=0, mat=0, sum=0;
		int avg=0;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어:");
		kor=sc.nextInt();
		System.out.println("영어:");
		eng=sc.nextInt();
		System.out.println("수학:");
		mat=sc.nextInt();
		
		sum = kor+eng+mat;
		avg = sum/3;
		
		switch(avg/10) {
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
			default:
				grade='F';

		}
		System.out.println(grade);
	}

}
