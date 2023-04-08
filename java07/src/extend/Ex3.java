package extend;

public class Ex3 {
	public static void main(String[] args) {
		MyString ms1 = new MyString("hello");
		ms1.myPrint1();
			
		MyStringEx ms2 = new MyStringEx("bye", "goodbyd");	
		ms2.myPrint1();
	}
}

// class :  변수 + 함수
class MyString{
	private String str1;
	String str2;
	protected String str3;
	public String str4;
	
	MyString(String str){
		System.out.println("MyString 객체화");
		this.str1 = str;
		this.str2 = str;
		this.str3 = str;
		this.str4 = str;
	}
	
	public void myPrint1(){
		System.out.println(str1);
	}
	
	public void myPrint2(){
		System.out.println(str1+str2+str3+str4);
	}
	
	public void setStr(String str) {
		this.str1 = str;
	}
	
	public String getStr() {
		return str1;
	}
}

// extends : 복붙
class MyStringEx extends MyString{

	private String str1;

	MyStringEx(String a_str1, String a_str2) {
		super(a_str1); 		// ()가 있다는 것은 '함수' 라는 뜻
		// super() :  부모의 생성자 (부모 생성자의 메서드를 사용)
		// super. : 부모의
		setStr(a_str2);
		str1 = ""; 		// private이라 모름
		str2 = ""; 		// default
		str3 = ""; 		// protected
		str4 = "";		// public
		setStr(a_str2);
		
	}
	
}