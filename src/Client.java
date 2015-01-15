
import java.util.ArrayList;

public class Client {
	Identification id;
	ArrayList<Account> account;
	Branch branch;
	/**
	 * @param id
	 * @param account
	 * @param branch
	 */
	private Client(Identification id, ArrayList<Account> account, Branch branch) {
		this.id = id;
		this.account = account;
		this.branch = branch;
	}
	
	/**
	 * Konstruktor sa pet parametara
	 * @param idNumber
	 * @param firstName
	 * @param secondName
	 * @param address
	 * @param branch
	 */
	
	public Client(String idNumber, String firstName, String secondName,
			String address, Branch branch) {
		this(new Identification(idNumber, firstName, secondName, address),
				new ArrayList<Account>(), branch);
	}

	/**
	 * Konstruktor sa četiri parametra
	 * @param idNumber
	 * @param name
	 * @param address
	 * @param branch
	 */
	
	public Client(String idNumber, String name,
			String address, Branch branch) {
		this(new Identification(idNumber, name, address),
				new ArrayList<Account>(), branch);
	}

	/**
	 * Getter za id
	 * @return the id
	 */
	public Identification getId() {
		return id;
	}

	/**
	 * Setter za id
	 * @param id the id to set
	 */
	public void setId(Identification id) {
		this.id = id;
	}

	/**
	 * Getter za account
	 * @return the account
	 */
	public ArrayList<Account> getAccount() {
		return account;
	}

	/**
	 * Setter za account
	 * @param account the account to set
	 */
	public void setAccount(ArrayList<Account> account) {
		this.account = account;
	}

	/**
	 * Getter za branch
	 * @return the branch
	 */
	public Branch getBranch() {
		return branch;
	}

	/**
	 * Setter za branch
	 * @param branch the branch to set
	 */
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	
}
