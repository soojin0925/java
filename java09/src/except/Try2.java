package except;

import java.util.Scanner;

public class Try2 {
	public static void main(String[] args) {
		// #1
		// try-catch를 사용해서 나누기를 해보세요
		// 숫자 2개를 나누기하되
		// 0이 들어올 수 있으니깐 try로 예외처리
		
		Scanner sc = new Sanner(System.in);
		
		int x = 10;
		int y = 5;
		
		
		// 형변환 String -> int
		int c= 0;
		String str = "글자";
		try {
			c = Integer.parseInt(str);
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("숫자만 가능 "+e);
		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		MyTest1 my1 = new MyTest1();
//		
//		System.out.println("숫자를 입력하세요:");
		
//		int num1 = sc.nextInt();
//		System.out.println("숫자를 입력하세요:");
//		int num2 = sc.nextInt();
		
//		try {
//			my1.divide(num1, num2);
//		}catch(Exception e) {
//			System.out.println("오류로 예외처리합니다");
//		}
//		
//	}
}

//class MyTest1{
//	public void divide(int num1, int num2) {
//		System.out.println(num1/num2);
//	}


		// #2
  		// int a = sc.nestInt();   에 대한 예외처리(숫자를 입력해야하는 함수에 문자열을 입력할 수 있음)
	
	
}	