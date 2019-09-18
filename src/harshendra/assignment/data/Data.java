package harshendra.assignment.data;

public class Data {
	
	int a;
	char c;

	public void printClassMembers() {
		System.out.println("a:" + a + "c:" + c);
	}

	public void printLocalVaribles() {
		int a;
		char c;
		// System.out.println("a:"+a+"c:"+c);
		// java does not provide default values for local variables
	}

	public static void main(String[] args) {
		Data d = new Data();
		d.printClassMembers();

	}

}