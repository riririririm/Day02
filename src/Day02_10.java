import java.util.Scanner;

public class Day02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//급여를 입력
		//1.정규직 
		//	의료보험 1.2%   고용보험 0.5%   산재보험 0.2%  국민연금 2%
		//2.계약직 
		//	원천징수 3.3%
		//3.일용직 선택
		//  소개비 10%
		Scanner sc = new Scanner(System.in);
		
		System.out.println("급여를 입력하세요:");
		int salary = sc.nextInt();
		System.out.println("1.정규직 / 2.계약직 / 3.일용직을 선택하세요");
		int num = sc.nextInt();
		
		double medi=0, emp=0, ind=0, pen=0;
		double hold=0, intro=0;
		double total=0;
		
		switch(num) {
		case 1:
			medi = salary*0.012;
			emp = salary*0.005;
			ind = salary*0.002;
			pen = salary*0.02;
			total = salary - medi -emp -ind -pen;
			break;
		case 2:
			hold = salary*0.033;
			total = salary-hold;
			break;
		case 3:
			intro = salary*0.1;
			total = salary-intro;
			break;
		default:
			System.out.println("1~3중에 선택하세요");
		}
		
		System.out.println("실급여:"+(int)total+"원");
		
	}

}
