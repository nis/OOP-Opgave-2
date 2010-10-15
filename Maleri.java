public class Maleri extends Kunst{
	public int længde;
	public int bredde;
	public Museum museum;
	
	public Maleri(String t, int y, int l, int b, Museum m) {
		super(t, y);
		længde = l;
		bredde = b;
		museum = m;
	}
	
	public void printMe() {
		System.out.println("Klasse: Maleri");
		System.out.println("Længde: " + længde);
		System.out.println("Bredde: " + bredde);
		System.out.print("Museum: ");
		museum.printMe();
		super.printMe();
	}
}