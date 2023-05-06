package _thread;

public class MyThread3 {
	public static void main(String[] args) {
		// 객체화 2개
		MyInput1 I1 = new MyInput1();
		MyInput2 I2 = new MyInput2();
		// start() 2개
		I1.start();
		I2.start();
		
	}
}


// 클래스 2개를 생성해서 쓰레드를 각각 상속받고
// 반복문을 100번 돌려서 0.5초마다 동시에 출력
// 1. 쓰레드1
// 2. 쓰레드2
class MyInput1 extends Thread{
	public void run() {
		for(int i=0;i<100;++i) {
			System.out.println("쓰레드1");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

	
	}

class MyInput2 extends Thread{
	public void run() {
		for(int i=0;i<100;++i) {
			System.out.println("쓰레드2");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}

	
		
	}
	}