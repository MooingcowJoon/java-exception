package sample03;

public class BankingService {

	
	private BankingRepository repo = new BankingRepository();
	
	public Account getAccountDetail(int no, int password) {
		Account account=repo.getAccountByNo(no);
		if (account==null) {
			throw new AccountNotFoundException(String.valueOf(no));
		}
		if (account.getPassword()!=password) {
			throw new PasswordMismatchException();
		}
		return account;
	}
	
	
	public void deposit(int no, long amount) {
		Account account=repo.getAccountByNo(no);
		if (account==null) {
			throw new AccountNotFoundException(String.valueOf(no));
		}
		account.setBalance(account.getBalance()+amount);
	}
	
	
	
	public void withdraw(int no, int password, long amount) {
		Account account=repo.getAccountByNo(no);
		if (account==null) {
			throw new AccountNotFoundException(String.valueOf(no));
		}if (account.getPassword()!=password) {
			throw new PasswordMismatchException();
		}
		if(account.getBalance()<amount) {
			String message="현재잔액 : "+ account.getBalance() +", 출금액: "+amount;
			throw new NotEnoughBalanceException(message);
		}
		account.setBalance(account.getBalance()-amount);
	}
	
}
