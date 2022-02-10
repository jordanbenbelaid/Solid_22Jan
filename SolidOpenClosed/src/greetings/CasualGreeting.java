package greetings;

import interfaces.Greeting;

public class CasualGreeting implements Greeting{

	@Override
	public String greet() {
		return "yo my slime";
	}

}
