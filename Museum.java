public class Museum {
	public String mNavn;
	public String mAdresse;
	
	public Museum(String n, String a) {
		mNavn = n;
		mAdresse = a;
	}
	
	public void printMe() {
		System.out.println(mNavn + ": " + mAdresse);
	}
}