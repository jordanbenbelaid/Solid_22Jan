package runner;

import domain.Greeter;
import greetings.CasualGreeting;
import greetings.FormalGreeting;

public class Runner {

	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		Greeter greeter2 = new Greeter();
		FormalGreeting fgreet = new FormalGreeting();
		CasualGreeting cgreet = new CasualGreeting();

		//setter injection
		greeter.setGreeting(cgreet);
		System.out.println(greeter.GreetPeople());
		
		greeter2.setGreeting(fgreet);
		System.out.println(greeter2.GreetPeople());
		
		System.out.println("\n====================================================\n");
		
		//calling directly from the class
		System.out.println(fgreet.greet());
		System.out.println(cgreet.greet());
		
		System.out.println("\n====================================================\n");
		
		//Constructor injection
		Greeter greetFormal = new Greeter(fgreet);
		Greeter greetCasual = new Greeter(cgreet);
		
		System.out.println(greetFormal.GreetPeople());
		System.out.println(greetCasual.GreetPeople());
	}

}
