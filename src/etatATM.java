
public abstract class etatATM {

	void insererCarte(ATM atm){}; 
	void ejecterCarte(ATM atm){};
	void insererPIN(ATM atm,int PIN){};
	void demanderMontant(ATM atm,float montant_dem){}; 
	void deposerMontant(ATM atm, float montant_dep) {};
}
