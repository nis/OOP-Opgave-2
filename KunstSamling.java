public class KunstSamling {
	public Kunst[] kunstværker = new Kunst[7];
	
	public void findSangeMedFlereKomponister () {
		System.out.println("Sange med flere komponister:");
		for (int i = 0; i < 7; i++) {
			if (kunstværker[i].getClass().getName() == "Komposition") {
				if (kunstværker[i].numOphavsmænd() > 1) {
					System.out.println("Titel: " + kunstværker[i].titel);
				}
			}
		}
	}
	
	public void add(Kunst k) {
		// Find en ledig plads
		for (int i = 0; i < 7; i++) {
			if (kunstværker[i] == null) {
				kunstværker[i] = k;
				return;
			}
		}
	}
	
	public void printMe() {
		for (int i = 0; i < 7; i++) {
			if (kunstværker[i] != null) {
				kunstværker[i].printMe();
			}
		}
	}
}