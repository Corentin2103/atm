package fr.unilim.iut.atm;

public class FiftyBankNotesDispenser extends BankNotesDispenser {
	@Override
	public Money dispense(int amount, Money money) {
		
		if (amount >= 50) {
			int numberof50BankNotes = amount / 50;
			money = money.add(new BankNotesBundle(new BankNote (50,ATM.CURRENCY), numberof50BankNotes));
		}

			money = super.dispense(amount%50,money);
		
		return money;
		}
	
}
