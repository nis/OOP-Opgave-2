public class Person {
	public String pNavn;
	public String pNat;
	public int pBorn;
	public int pDead;
	
	public Person(String navn, String nat, int f, int d) {
		pNavn = navn;
		pNat = nat;
		pBorn = f;
		pDead = d;
	}
	
	public void printMe() {
		if (pNavn.length() > 0) {
			if (pDead == 0) {
				System.out.println("\t" + pNavn + ", " + pNat + ", " + pBorn + "-");
			} else {
				System.out.println("\t" + pNavn + ", " + pNat + ", " + pBorn + "-" + pDead);
			}
		}
	}
}