package database_;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection1 {
	public static void main(String[] args) {
		SQLConnector c = new SQLConnector();
		
		// 자바에서 '데이터베이스' 프로그램을 사용하는 법 (JDBC)
		// 1. 데이터베이스 서버를 설치한다(시각화 workbench 포함)
		// 2. Connector 라이브러리를 설치한다 (데이터베이스마다 다름)
		// 3. 프로젝트에 추가를 한다 (프로젝트 우클릭 -> Properties -> Java Build Path -> Libraries -> Add External Jars... -> jar 라이브러리 파일 추가)
		
	}
}

// 연결테스트
class SQLConnector{
	private Connection conn;
	private static final String DBID = "root";
	private static final String DBPW = "root";
	private static final String DBURL = "jdbc:mariadb://localhost:3307/company";
	
	// 생성자
	public SQLConnector() {
		try {
			System.out.println("생성자 사용");
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println("마리아DB 드라이버 로딩 성공");
		}catch(Exception e) {
			System.out.println("마리아DB 드리이버 로딩 실패");
			e.printStackTrace();
		}		
	}
}