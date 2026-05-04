
public class avecCarte extends etatATM{

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
		atm.set_etat(new sansCarte());
	}

	@Override
	void insererPIN(ATM atm, int PIN) {
		// TODO Auto-generated method stub
		super.insererPIN(atm, PIN);
		if (PIN==ATM.pin) {
			atm.PINcorrect=true;
			atm.set_etat(new avecPIN());
		}else {
			System.out.println("impossible");
		}
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
