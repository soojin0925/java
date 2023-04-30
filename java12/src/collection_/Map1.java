package collection_;

import java.util.HashMap;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		// 배열, List, Set, Map
		// Map : 키와 값을 쌍으로 정해주고 싶을 때
		// {"일":"a", "이","b", ...}
		HashMap<Integer, String> hm = new HashMap<>();
		
		// 추가 put
		// 조회 get
		// 삭제 remove
		// 해당 키가 있는지 검사 containsKey()
		// 해당 값이 있는지 검사 containsValue()
		
		hm.put(1, "일");
		hm.put(2, "이");
		hm.put(2, "이중복");
		hm.put(2, "이중복2"); 			// 값을 덮어씀
		hm.put(3, "삼");
		
		System.out.println(hm.get(1)); 		// get에 key값을 넘겨중
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		
		hm.remove(3);
		
		// 전체조회
		Set<Integer> set= hm.keySet();    	
		for(int e : set) {
			System.out.println(e); 			// key 가져옴
			System.out.println(hm.get(e));  // value
		}
		
		boolean isTrue = hm.containsKey(4);
		System.out.println(isTrue);
		isTrue = hm.containsValue("이중복2");
		System.out.println(isTrue);
	}
}
