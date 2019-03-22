import java.util.Scanner;

public class Day02_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("암호화 숫자를 입력하세요");
		int num = sc.nextInt();
		System.out.println("영어 한글자를 입력하세요");
		String str = sc.next();
		char ch = str.charAt(0);
		
		System.out.println(ch);
		
		//입력된 글자가 대문자인지 소문자인지
		
		int change= ch+num; //ch가 int타입으로 자동형변환
		char change1 = (char)change; //암호화한 문자를 char로 형변환
		//ch = (char)(ch+num);
		
		
		if(ch>=65 &&ch<=90){ 
		  //System.out.println("대문자"); 
		  if(change1>=90)
			  change1-=26;
		  else if(change1<65)
			  change1+=26;
		}
		else if(ch>=97 && ch<=122){
			//System.out.println("소문자"); 
			if(change1>=122)
				change1-=26;
			else if(change1<97)
				change1+=26;
		}else {
		  	System.out.println("알파벳이 아님");
		}
		 
				
				
		System.out.println(change1);
	}

}
