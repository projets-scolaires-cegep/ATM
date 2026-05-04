
public class sansCash extends etatATM{

	@Override
	void insererCarte(ATM atm) {
		// TODO Auto-generated method stub
		super.insererCarte(atm);
		System.out.println("impossible");
	}

	@Override
	void ejecterCarte(ATM atm) {
		// TODO Auto-generated method stub
		super.ejecterCarte(atm);
		System.out.println("impossible");
	}

	@Override
	void insererPIN(ATM atm, int PIN) {
		// TODO Auto-generated method stub
		super.insererPIN(atm, PIN);
		System.out.println("impossible");
	}

	@Override
	void demanderMontant(ATM atm, float montant_dem) {
		// TODO Auto-generated method stub
		super.demanderMontant(atm, montant_dem);
		System.out.println("impossible");
	}

	@Override
	void deposerMontant(ATM atm, float montant_dep) {
		// TODO Auto-generated method stub
		super.deposerMontant(atm, montant_dep);
		atm.cashmachine+=montant_dep;
	}


}
