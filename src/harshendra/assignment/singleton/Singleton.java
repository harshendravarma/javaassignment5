package harshendra.assignment.singleton;

public class Singleton {
	
	String s;

	Singleton(String s1) {
		s = s1;
	}

	public static Singleton getInstance(String s1) {
		// static method cannot initialize class members
		Singleton s = new Singleton(s1);
		return s;
	}

	public void printS() {
		System.out.println(s);
	}
}