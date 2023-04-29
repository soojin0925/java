package collection_;


import java.util.ArrayList;
import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		// 1.추가 2.변경 3.삭제 4.전체보기 0.끝내기
		// 음식점 항목을 관리하는 프로그램 만들기
		// 기본메뉴 : 김밥, 떡볶이, 순대
		// 가격 : 1000, 2000, 3000
		FoodList fl = new FoodList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==메뉴을 선택하세요==");
		String str = "";
		String after = "";
		int price = 0;
		int choice = 0;
		
		
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.전체보기 0.끝내기");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("추가할 메뉴는?");
				str = sc.next();	
				System.out.println("가격은?");
				price = sc.nextInt();
				fl.addFood(str,price);
			}else if(choice == 2) {
				System.out.println("변경할 메뉴명 : ");
				str = sc.next();
				System.out.println("변경 후 메뉴명 : ");
				after = sc.next();
				fl.setFood(str, after);
			}else if(choice == 3) {
				System.out.println("삭제할 메뉴명 : ");
				str = sc.next();
				fl.deleteFood(str);
			}else if(choice == 0) {
				// 끝내기
				System.out.println("프로그램 종료");
				sc.close();
				break;
			}else {
				// 보기(4번 또는 이상한 값을 입력하면)
				fl.showAll();
	}
}
	}
}

class FoodList{
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();
	
	public FoodList() {
		name.add("김밥");
		name.add("떡볶이");
		name.add("순대");
		price.add(1000);
		price.add(2000);
		price.add(3000);
	}
	public void addFood(String str,int price) {
		name.add(str);
		this.price.add(price);
	}
	
	public void setFood(String str, String after) {
		int number = name.indexOf(str);
		name.set(number, after);
	}
	
	public void deleteFood(String str) {
		int number = name.indexOf(str);
		name.remove(number);
	}
	
	public void showAll() {
		for(int i=0;i<name.size();++i) {
			System.out.println(name.get(i)+" : "+price.get(i)+"원");
		}
	}
	
	
}