
import java.util.ArrayList;

public class Branch {
	private Identification id;
	private ArrayList<Identification> personal;
	private ArrayList<Client> client;
	private Bank parentBank;
	/**
	 * @param id
	 * @param personal
	 * @param client
	 */
	private Branch(Identification id, ArrayList<Identification> personal,
			ArrayList<Client> client, Bank parentBank) {
		this.id = id;
		this.personal = personal;
		this.client = client;
		this.parentBank = parentBank;
	}
	
	/**
	 * Konstruktor sa tri parametra
	 * @param address
	 * @param parentBank
	 */
	
	public Branch(String address, Bank parentBank) {
		this(new Identification(parentBank.getId().getIdNumber(),
				parentBank.getId().getFirstName(), address), null, null, parentBank);
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
	 * Getter za personal
	 * @return the personal
	 */
	public ArrayList<Identification> getPersonal() {
		return personal;
	}

	/**
	 * Setter za personal
	 * @param personal the personal to set
	 */
	public void setPersonal(ArrayList<Identification> personal) {
		this.personal = personal;
	}

	/**
	 * Getter za klijenta
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
	 * Getter za banku
	 * @return the parentBank
	 */
	public Bank getParentBank() {
		return parentBank;
	}

	/**
	 * Setter za banku
	 * @param parentBank the parentBank to set
	 */
	public void setParentBank(Bank parentBank) {
		this.parentBank = parentBank;
	}

}
