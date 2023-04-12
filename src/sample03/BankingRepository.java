package sample03;

import java.util.HashMap;
import java.util.Map;

public class BankingRepository {

	private Map<Integer,Account> map= new HashMap<>();
	public BankingRepository() {
		map.put(100, new Account(100,"김유신",1234, 500000));
		map.put(200, new Account(200,"강감찬",1234, 1500000));
		map.put(300, new Account(300,"이순신",1234, 4500000));
		map.put(400, new Account(400,"류관순",1234, 5500000));
		map.put(500, new Account(500,"안중근",1234, 5500000));
		
	}
	
	/**
	 * 계좌번호로 계좌정보 객체전달
	 * @param no
	 * @return 계좌정보 계좌번호가 올바르지 안으면 null이 반환될 수 있다.
	 */
	public Account getAccountByNo(int no) {
		return map.get(no);	
		}
}
