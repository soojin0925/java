package condition;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		// 사용자에게 점수를 입력받고
		// 점수가 90점 이상이면
		// 우등생입니다.
		// 를 출력하는 프로그램을 맞들어주세요
		
		int 점수;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		점수 = sc.nextInt();
		
		if(점수 >= 90) {
			System.out.println("우등생입니다");
		}
	}
}
