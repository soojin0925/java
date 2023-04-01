package Function;

public class Function1 {
		// main(){} : main메서드
	 	// 메서드(함수) : 코드를 저장해놓고 사용할 때 그 코드를 실행
	  	// main함수에 코딩을 하면 ==> 프로그램 실행 시 main함수 실행
	public static void main(String[] args) {
		// 자바에는 막혀있지만 '함수' 라는 개념이 있습니다.
		// 함수 : 코드를 저장해놓는 공간 (){}
		// 변수 : 값을 저장하는 공간
		System.out.println(); 		// 출력을 해주는 함수(출력하는 코드가 저장되어 있음)
		
		// 자바에서는 함수를 직접적으로 사용하지 않고
		// 클래스 안에 담아서 '메서드'라는 개념으로 사용
		// 우선은 편하게 '함수 == 메서드' 간주
		
		// static :  정적, 고정시켜놓아서 어디서든지 접근할 수 있게끔 셋팅(많이 쓰면 프로그램이 느려짐)
		함수명(3,4,5); 		// 3과 4와 5를 한번에 더해주는 기호(연산자, 함수, 메서드, 기능)
		
		// 1과 3과 5를 더하고 싶다
		함수명(1,3,5);
	}
	
	// main이 static이어서 static함수로 생성(원래는 일반적으로 static 없음)
	static void 함수명(int num1, int num2, int num3) {
		// 함수라는 것은 사용자가 직접 만드는 연산자(코드 저장)
		// 숫자 3개를 한번에 더할 수 있는 연산자로 만들께요 (+기호는 2개만 더하기 가능)
		// A + B
		// 함수명(A, B, C);
		System.out.println(num1+num2+num3);
		
	}
}
/*
      자바는 클래스 바깥에서 코딩하는 것을 허락하지 않습니다.
      왜냐하면, 자바의 출시 목적이 모든 프로그래밍 언어를 통일하기 위해서 출시
      int num = 0;
      
      public vold mm() {
      
      }
      
      
 */
  