package condition;

public class Ifelse2 {
	public static void main(String[] args) {
		int num = 99;
		
		// 10보다 작은지, 100보다 작은지, 1000 보다 작은지, 10000 이상인지
		// if만 쓰기
		if(num < 10) {
			System.out.println("10보다 작다");
		}
		if(num <100) {
			System.out.println("100보다 작다");
		}
		if(num < 1000) {
			System.out.println("1000보다 작다");
		if(num < 1000) {
			System.out.println("그 밖에");
		}
		System.out.println("==================");
		
	// if~else if~else : 셋트
	if(num < 10) {
		System.out.println("10보다 작다)";
	}else if(num <100) {
		System.out.println("100보다 작다");
	}else if(num < 1000) {
		System.out.println("1000보다 작다");		
	}