public abstract class Artwork {
	public String titel;
	public int år;
	public Person[] ophavsmænd;
	
	public Artwork(String t, int y) {
		titel = t;
		år = y;
	}
	
	public void addOphavsmand(Person p) {
		Boolean notFound = true;
		for (int i = 0; i < ophavsmænd.length; i++) {
			if (ophavsmænd[i] == p) {
				notFound = false;
				break;
			}
		}
		if (notFound) {
			ophavsmænd[ophavsmænd.length] = p;
		}
	}
}