public class Maleri extends Artwork{
	public int længde;
	public int bredde;
	public Museum museum;
	
	public Maleri(String t, int y, int l, int b, Museum m) {
		super(t, y);
		længde = l;
		bredde = b;
		museum = m;
	}
}