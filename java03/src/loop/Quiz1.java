package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 
		// 1. 1~10 중 짝수만 출력하기
		for(int i =1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i + " ");
		}
						
		// 2.  정수비밀번호 맞추기(기회는 5번, 맞추면 맞췄다하고 종료, 기회를 모두 사용하면 접속불가)
		int p = 0;
		Scanner sc = new Scanner(System.in);
		while(p<5) {
			System.out.println("비밀번호를 입력하세요");
			p++;
		}
				
		
	}
}

