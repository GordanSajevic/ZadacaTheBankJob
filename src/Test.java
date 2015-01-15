
public class Test {

	public static void main(String[] args) {
		Bank myBank = new Bank("456", "Derikože", "Lihvarska, 14");
		Branch myBranch = new Branch("Nigdjezemska", myBank);
		Client gordan = new Client("123", "Gordan Sajević", "Nedođija", myBranch);
		Client bitcamp = new Client("234", "BitCamp", "IUS", myBranch);
		Account gordanAccount = new Account("4576", gordan);
		gordanAccount.setBalance(7020);
		System.out.println("Gordan balance: " + gordanAccount.getBalance());
		Account bitcampAccount = new Account("3451", bitcamp);
		bitcampAccount.setBalance(100000);
		System.out.println("BitCamp balance: " + bitcampAccount.getBalance());
		Transaction transaction = new Transaction(1, 7000, "Uplata", gordanAccount, bitcampAccount);
		System.out.println("Transaction type: " + transaction.getTransactionType() + ", party: " + transaction.getParty() + ", value: " + transaction.getValue());
		System.out.println("Gordan balance: " + gordanAccount.getBalance());
		System.out.println("BitCamp balance: " + bitcampAccount.getBalance());
		
	}

}
