package time;

public class Singleton {
	// 디자인패턴을 싱글턴패턴으로 해서 클래스를 구성(디자인)
	private Singleton() {} 		// 생성자 이름과 동일
	
	private static Singleton instance; 				// 자료형 이름과 동일하게 맞춤
	
	public static Singleton getInstance() { 		// 반환을 자기 클래스명으로 반환.. getInstanc는 그렇게 생긴애..매서드 따로
		if(instance == null) {
			instance = new Singleton(); 			// 위에 파랑이에 객체화를 시킴
		}
		return instance;							// 객체화된 애를 
	}
	
	 
	
	
	
	// 멤버변수와 메서드
	private String str;
	public String Getstr() {return str;}
	public void SetStr(String str) {this.str = str;}
}

