package cls;

public class Method4 {
	public static void main(String[] args) {
		MyClass7 mc7 = new MyClass7();
		
		//int result =mc7.더하기(5, 5);
		System.out.println(mc7.더하기(5,5));
		
		int result1 = mc7.빼기(5, 5);
		System.out.println(result1);
		
		int result2 = mc7.곱하기(5, 5);
		System.out.println(result2);
		
		int result3 = mc7.나누기(0, 5);
		System.out.println(result3);
		
		int result = mc7.나머지구하기(10, 3);
		System.out.println(result);
		
		
	}
}
class MyClass7{
	// 더하기 +
	int 더하기(int num1, int num2) {
		int result = num1+num2; 		// 생략가능 return num1+num2..이런식으로
		return result;
	}
	
	// 빼기 -
	int 빼기(int num1, int num2) {
		int result1 = num1-num2;
		return result1;
	}
	
	// 곱하기 x
	int 곱하기(int num1, int num2) {
		int result2 = num1 * num2;
		return result2;
	}
	
	// 나누기 / (0으로 나누면 결과를 0으로)
	double 나누기(int num1, int num2) {
		double result = 0.0;
		if(num2 ==0) {
			return result3;
		}else {
			result = mum/num2;
			return result3;
		}
		//int result3 = num1 / num2;
		//return result3;
	}
	// %기호 안쓰고 나머지 구하기 만들어보기
	int 나머지구하기(int num1, int num2) {
		//  나머지 구하기
		int result = 0;
		//방법1
		result = num1-((num1/num2)*num2);
		
		//방법2
//		result = num1;
//		while(true) {
//			if(num1 <= num2) {
//				break;
//			}
//			num1 -= num2;
//		}
		return result;
	}
}