public class Komposition extends Kunst{
	public int spilletid;
	public String genre;
	
	public Komposition(String t, int y, String g, int s) {
		super(t, y);
		spilletid = s;
		genre = g;
	}
	
	public void printMe() {
		System.out.println("Klasse: Komposition");
		System.out.println("Spilletid: " + spilletid);
		System.out.println("Genre: " + genre);
		super.printMe();
	}
}