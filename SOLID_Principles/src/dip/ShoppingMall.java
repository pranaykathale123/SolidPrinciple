package dip;

public class ShoppingMall {
	
	private BankCard bankcard;

	public ShoppingMall(BankCard bankcard) {
		this.bankcard = bankcard;
	}
	
	public void doPurchase(long amout) {
		bankcard.doTransaction(amout);
	}
	 public static void main(String[] args) {
		BankCard  bankcard = new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(bankcard);
		shoppingMall.doPurchase(5000);
     }

}
