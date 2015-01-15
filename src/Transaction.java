
import java.util.Date;

public class Transaction {
	public static final int INCOME = 1;
	public static final int OUTCOME = -1;
	private Date date;
	private int transactionType; // 1 - income, -1 - outcome
	private double value;
	private String party; // "" transaction with cash
	private Account first;
	private Account second;
	/**
	 * Konstruktor sa pet parametara
	 * @param transactionType
	 * @param value
	 * @param party
	 */
	public Transaction(int transactionType, double value, String party, Account first, Account second) {
		this.transactionType = transactionType;
		this.value = value;
		this.party = party;
		date = new Date();
		first.setBalance(first.getBalance() - value);
		second.setBalance(second.getBalance() + value);
	}
	/**
	 * Getter za datum
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * Getter za tip transakcije
	 * @return the transactionType
	 */
	public int getTransactionType() {
		return transactionType;
	}
	/**
	 * Getter za iznos
	 * @return the value
	 */
	public double getValue() {
		return value;
	}
	/**
	 * Getter za partiju
	 * @return the party
	 */
	public String getParty() {
		return party;
	}
	
}
