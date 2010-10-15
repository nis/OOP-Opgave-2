public class Bog extends Kunst{
	public int antalSider;
	public String genre;
	
	public Bog(String t, int y, String g, int s) {
		super(t, y);
		antalSider = s;
		genre = g;
	}
	
	public void printMe() {
		System.out.println("Klasse: Bog");
		System.out.println("Antal sider: " + antalSider);
		System.out.println("Genre: " + genre);
		super.printMe();
	}
}