
public class Day02_2 {
	public static void main(String [] args) {
		int num=1;
		num=num+1;
		System.out.println(num);
		num++;
		System.out.println(num);
		++num;
		System.out.println(num);
		--num;
		System.out.println(num);//3
		int r= num++; //r에 num을 먼저 넣고 num+1
		System.out.println("num:"+num);//4
		System.out.println("r:"+r);//3
		
		r=++num; //++을 먼저하고 r에 대입
		System.out.println("num:"+num);//5
		System.out.println("r:"+r);//5
		
		System.out.println(num++); //프린트를 먼저하고 num++
		
		num=0;
		num=++num + num++;
		System.out.println(num);
	}
}
