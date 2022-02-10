package devs;

import interfaces.Developer;

public class BackEndDeveloper implements Developer{

	@Override
	public void develop() {
		writeJava();
	}
	
	public void writeJava() {
		System.out.println("Java is the best");
	}

}
