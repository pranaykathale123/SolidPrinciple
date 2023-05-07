package dip;

public class DebitCard implements BankCard {
	public void doTransaction(long amount) {
		System.out.println("payment suing DebitCard");
	}

	@Override
	public void doTransaction() {
		// TODO Auto-generated method stub
		
	}

}
