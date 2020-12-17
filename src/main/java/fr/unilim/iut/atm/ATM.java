
package fr.unilim.iut.atm;


public class ATM {
	static final String CURRENCY = "Euros";
	private BankNotesDispenser bankNotesDispenser;
	public ATM() {
		bankNotesDispenser = new FiftyBankNotesDispenser();
		BankNotesDispenser bankNotesDispenser2 = new TwentyBankNotesDispenser();
		BankNotesDispenser bankNotesDispenser3 = new TenBankNotesDispenser();
		
	}
	

	public Money withdraw(int amount) {

		Money money = Money.NO;
		return bankNotesDispenser.dispense(amount, money);
	}

}

