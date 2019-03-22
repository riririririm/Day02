import java.util.Scanner;

public class Day02_5 {
	public static void main(String [] args) {
		int score =60;
		if(score>=60) {
			System.out.println("합격");
		}else {
			System.out.println("탈락");
		}
		
		//회원가입시 입력한 정보
		int id=1234;
		int pw=5678;
		
		//yID를 입력
		//yPwd입력
		//로그인 성공 or 실패출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ID:");
		int yId = sc.nextInt();
		System.out.println("PW:");
		int yPw = sc.nextInt();
		
		/*
		 * if(yId==id && yPw==pw) { System.out.println("로그인성공"); }else
		 * System.out.println("로그인 실패");
		 */
		String result = yId==id && yPw==pw ? "로그인성공":"로그인실패";
		System.out.println(result);
	}
}
