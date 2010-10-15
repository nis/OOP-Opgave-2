public class KunstSamling {
	public Kunst[] kunstværker = new Kunst[7];
	
	public void beregnAntalLæsteSider () {
		System.out.println("Antal læste sider:");
		int s = 0;
		for (int i = 0; i < 7; i++) {
			if (kunstværker[i].getClass().getName() == "Bog") {
				Bog t = (Bog) kunstværker[i];
				if (t.antalSider > 0) {
					s += t.antalSider;
				}
			}
		}
		System.out.println("\t" + s + " sider");
	}
	
	public void findMalerierPåMuseum(String m) {
		System.out.println("Malerier på museet \"" + m + "\":");
		for (int i = 0; i < 7; i++) {
			if (kunstværker[i].getClass().getName() == "Maleri") {
				Maleri t = (Maleri) kunstværker[i];
				if (t.museum.mNavn == m) {
					System.out.println("\t" + kunstværker[i].titel);
				}
			}
		}
	}
	
	public void findSangeMedFlereKomponister () {
		System.out.println("Sange med flere komponister:");
		for (int i = 0; i < 7; i++) {
			if (kunstværker[i].getClass().getName() == "Komposition") {
				if (kunstværker[i].numOphavsmænd() > 1) {
					System.out.println("\t" + kunstværker[i].titel);
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