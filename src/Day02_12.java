import java.util.Scanner;

public class Day02_12 {
	public static void main(String [] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇 단 출력할까요?");
//		int dan=0;
//		dan=sc.nextInt();
//		
//		for(int i=1;i<=9;i++) {
//			System.out.println(dan+"x"+i+"="+dan*i);
//		}
		
		for(int i=1;i<=100;i++) {
			if(i%2!=0)
				System.out.println(i);
		}
		
		System.out.println("==========================================");
		
		for(int i=1;i<=100;i+=2) {
			System.out.println(i);
		}
	}

}
