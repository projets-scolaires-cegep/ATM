
public class ATM_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM_personne a=new ATM_personne(new sansCarte(), 500f, false);
		System.out.println(a.cashmachine);
		a.insererCarte(a);
		a.insererPIN(a, 1234);
		a.demanderMontant(200f);
		System.out.println(a.cashmachine);

	}

}
