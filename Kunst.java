public abstract class Kunst {
	public String titel;
	public int år;
	public Person[] ophavsmænd = new Person[5];
	
	public Kunst(String t, int y) {
		titel = t;
		år = y;
	}
	
	public int numOphavsmænd() {
		int res = 0;
		for (int i = 0; i < 5; i++) {
			if (ophavsmænd[i] != null) {
				res++;
			}
		}
		return res;
	}
	
	public void addOphavsmand(Person p) {
		
		// Check om ophavsmanden er tilføjet
		for (int i = 0; i < 5; i++) {
			if (ophavsmænd[i] == p) {
				return;
			}
		}
		
		// Find en ledig plads
		for (int i = 0; i < 5; i++) {
			if (ophavsmænd[i] == null) {
				ophavsmænd[i] = p;
				return;
			}
		}
	}
	
	public void printMe() {
		System.out.println("Titel: " + titel);
		System.out.println("År: " + år);
		System.out.println("Ophavsmænd: ");
		for (int i = 0; i < 5; i++) {
			if (ophavsmænd[i] != null) {
				ophavsmænd[i].printMe();
			}
		}
		System.out.print("\n\n");
	}
}