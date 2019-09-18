package harshendra.assignment.main;

import harshendra.assignment.data.Data;
import harshendra.assignment.singleton.Singleton;

public class Main {
	
	public static void main(String[] args) {
		
		Data d = new Data();
		d.printClassMembers();// for class members java provides default values
		d.printLocalVaribles();// for local variables java does not provide default value
		Singleton.getInstance("hihi").printS();// static method cannot initialize object level members
		
	}
	
}
