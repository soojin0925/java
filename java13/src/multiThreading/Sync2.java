package multiThreading;

public class Sync2 {
	public static void main(String[] args) {
		DressRoom room = new DressRoom();
		Thread 김씨 = new Thread(room, "김씨");
		Thread 이씨 = new Thread(room, "이씨");
		Thread 유씨 = new Thread(room, "유씨");
		// 사람 3명(Thread 3개)
		김씨.start();
		이씨.start();
		유씨.start();
	}
}

// 의상탈의실
// 의류가게에서는 한 사람이 옷을 갈아입으러 탈의실에 들어가면 나올때까지 밖에서 대기를 해줘야한다
class DressRoom implements Runnable {
	private int time;
	
	public void run() {
		synchronized (this) {  	 	// 이미 사용중이면 다른 애들은 대기
			String name = Thread.currentThread().getName();
			System.out.println(name+" 탈의실 들어감");
			for(time=1;time<=5;++time) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name+" 탈의실 사용 중....."+time+"분");
		}
		
		
		System.out.println(name+" 탈의실 나욤");
		
	}
	
}
}