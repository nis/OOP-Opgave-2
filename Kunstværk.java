public abstract class Kunstværk {
	public String titel;
	public int år;
	public Person[] ophavsmænd = new Person[5];
	
	public Kunstværk(String t, int y) {
		titel = t;
		år = y;
		
		// for (int i = 0; i < 5; i++) {
		// 	ophavsmænd[i] = new Person();
		// }
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
	
	public void printOphav() {
		for (int i = 0; i < 5; i++) {
			if (ophavsmænd[i] != null) {
				System.out.println(ophavsmænd[i].pNavn);
			}
		}
	}
}