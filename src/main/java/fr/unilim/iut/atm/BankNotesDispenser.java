package fr.unilim.iut.atm;

public class BankNotesDispenser {

	private BankNotesDispenser next;

	public Money dispense(int amount, Money money) {
		if(next != null) {
			money = next.dispense(amount,money);
		}
		return money;
	}


	public void setNext(BankNotesDispenser nextBankNotesDispenser) {
		this.next = nextBankNotesDispenser;
	}

}
