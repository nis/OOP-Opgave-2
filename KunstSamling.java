public class KunstSamling {
	public Kunst[] kunstværker = new Kunst[7];
	
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