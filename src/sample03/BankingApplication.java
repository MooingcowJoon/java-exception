package sample03;

import util.KeyboardReader;

public class BankingApplication {
	
	private KeyboardReader reader = new KeyboardReader();
	private BankingService service= new BankingService();
	public static void main(String[] args) {
		BankingApplication b=new BankingApplication();
		b.menu();
	}
	public void menu() {
		System.out.println("----------------------------");
		System.out.println("1.조회 2.입금 3.출금 0.종료");
		System.out.println("----------------------------");
		System.out.println();
		
		System.out.println("### 메뉴선택: ");
		int menuNo = reader.readInt();
		System.out.println();
		
		//예외 일괄처리
		try {
		
		
		if (menuNo==1) {
			조회하기();
		}if (menuNo==2) {
			입금하기();
		}if (menuNo==3) {
			출금하기();
		}if (menuNo==0) {
			종료하기();
		}
		} catch (BankingException ex) {
			System.out.println("###오류 발생"+ex.toString());
		}catch (RuntimeException ex) {
			System.out.println("### 오류 발생"+ex.toString());
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		menu();
		
	}
	private void 조회하기() {
		
		System.out.println("<< 계좌번호 조회하기 >> ");
		System.out.println("계번");
		int no=reader.readInt();
		System.out.println("비번");
		int password=reader.readInt();
		
		Account account = service.getAccountDetail(no, password);
		System.out.println("--------------------------------");
		System.out.println("계좌번호 : "+account.getNo());
		System.out.println("예금주 : "+account.getOwner());
		System.out.println("현재잔액 : "+account.getBalance());
		System.out.println("--------------------------------");
		
	}
	private void 입금하기() {
		System.out.println("### 계좌번호와 입금액을 입력하세요.");
		
		System.out.println("### 계좌번호 입력: ");
		int no=reader.readInt();
		System.out.println("### 입금액");
		long amount=reader.readLong();
		System.out.println();
		service.deposit(no, amount);
		System.out.println("###입금이 완료되었습니다.");
		
	}	private void 출금하기() {
		System.out.println("<< 출금하기 >>");
		System.out.println("계좌번호, 비밀번호, 출금액을 입력하세요");
		
		System.out.println("### 계좌번호: ");
		int no=reader.readInt();
		System.out.println("비번");
		int password=reader.readInt();
		System.out.println("### 출금액");
		long amount=reader.readLong();
		service.withdraw(no, password, amount);
		System.out.println("### 출금이 완료되었습니다.");

	}	private void 종료하기() {
		
	}
	
}
