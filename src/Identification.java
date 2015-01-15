
public class Identification {
	private String idNumber;
	private String firstName;
	private String secondName;
	private String address;
	private boolean corporate;
	/**
	 * @param idNumber
	 * @param firstName
	 * @param secondName
	 */
	public Identification(String idNumber, String firstName, String secondName, String address) {
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.secondName = secondName;
		corporate = false;
		this.address = address;
	}
	
	/**
	 * Konstruktor za identification
	 * @param idNumber
	 * @param firstName
	 * @param address
	 */
	
	public Identification(String idNumber, String firstName, String address) {
		this(idNumber, firstName, "", address);
		corporate = true;
	}

	/**
	 * Getter za idNumber
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}

	/**
	 * Setter za idNumber
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * Getter firstName
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter firstName
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter secondName
	 * @return the secondName
	 */
	public String getSecondName() {
		return secondName;
	}

	/**
	 * Setter secondName
	 * @param secondName the secondName to set
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/**
	 * Metoda koja provjerava corporate
	 * @return the corporate
	 */
	public boolean isCorporate() {
		return corporate;
	}

	/**
	 * Setter za corporate
	 * @param corporate the corporate to set
	 */
	public void setCorporate(boolean corporate) {
		this.corporate = corporate;
	}

	/**
	 * Getter za adresu
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Setter za adresu
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
