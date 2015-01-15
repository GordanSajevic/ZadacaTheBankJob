
import java.util.ArrayList;

public class Account {
	private String accountNumber;
	private double balance;
	ArrayList<Transaction> transaction;
	Client client;
	/**
	 * Konstruktor sa dva parametra
	 * @param accountNumber
	 * @param client
	 */
	public Account(String accountNumber, Client client) {
		this.accountNumber = accountNumber;
		this.client = client;
		balance = 0.0;
		transaction = new ArrayList<Transaction>();
	}
	
	/**
	 * Getter za balance
	 * @return balance
	 */
	
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * Setter za balance
	 * @param balance
	 */
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}

}
