package domain;

import interfaces.Greeting;

public class Greeter {

	private Greeting greeting;
	
	public Greeter() {}
	
	public Greeter(Greeting greeting) {
		this.greeting = greeting;
	}

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	
	public String GreetPeople() {
		return greeting.greet();
	}
}
