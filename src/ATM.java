
public class ATM {

	etatATM etat;
	float cashmachine;
	final static int pin=1234;
	boolean PINcorrect=false;
	
	public ATM(etatATM etat, float cashmachine, boolean PINcorrect) {
		super();
		this.etat = etat;
		this.cashmachine = cashmachine;
		PINcorrect = PINcorrect;
	}
	

	public etatATM get_etat(){
		return etat;
		
	}
	
	public void set_etat(etatATM etat) {
		this.etat=etat;
	}
	
	void insererCarte(ATM atm) {this.etat.insererCarte(this);}
	void ejecterCarte(ATM atm) {this.etat.ejecterCarte(this);};
	void insererPIN(ATM atm,int PIN) {this.etat.insererPIN(this, PIN);};
	void demanderMontant(float montant_dem) {this.etat.demanderMontant(this, montant_dem);};
	void deposerMontant(float montant_dep) {this.etat.deposerMontant(this, montant_dep);};
	
}
