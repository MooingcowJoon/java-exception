package sample03;

public class Account {

	public int getNo() {
		return no;
	}

	public String getOwner() {
		return owner;
	}

	public int getPassword() {
		return password;
	}

	public long getBalance() {
		return balance;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	private int no;
	private String owner;
	private int password;
	private long balance;
	
	public Account(){}

	public Account(int no, String owner, int password, long balance) {
		super();
		this.no = no;
		this.owner = owner;
		this.password = password;
		this.balance = balance;
	}
	
}
