package devs;

import interfaces.Developer;

public class FrontEndDeveloper implements Developer{

	@Override
	public void develop() {
		writeJavaScript();
	}
	
	public void writeJavaScript() {
		System.out.println("Javascript is fun and cool");
	}

}
