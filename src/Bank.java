
import java.util.ArrayList;

public class Bank {
	private Identification id;
	private ArrayList<Client> client;
	private ArrayList<Branch> branch;
	/**
	 * @param id
	 * @param client
	 * @param branch
	 */
	private Bank(Identification id, ArrayList<Client> client, ArrayList<Branch> branch) {
		this.id = id;
		this.client = client;
		this.branch = branch;
	}
	
	/**
	 * Konstruktor sa tri parametra
	 * @param idNumber
	 * @param name
	 * @param address
	 */
	
	public Bank(String idNumber, String name, String address) {
		this(new Identification(idNumber, name, address),
				new ArrayList<Client>(), new ArrayList<Branch>());
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
	 * Getter za klijentaß
	 * @return the client
	 */
	public ArrayList<Client> getClient() {
		return client;
	}

	/**
	 * Setter za klijenta
	 * @param client the client to set
	 */
	public void setClient(ArrayList<Client> client) {
		this.client = client;
	}

	/**
	 * Getter za branch
	 * @return the branch
	 */
	public ArrayList<Branch> getBranch() {
		return branch;
	}

	/**
	 * Setter za branch
	 * @param branch the branch to set
	 */
	public void setBranch(ArrayList<Branch> branch) {
		this.branch = branch;
	}
	
}
