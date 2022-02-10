package runner;

import java.util.ArrayList;
import java.util.List;

import devs.BackEndDeveloper;
import devs.FrontEndDeveloper;
import interfaces.Developer;
import project.Project;

public class Runner {

	public static void main(String[] args) {
		// single
		BackEndDeveloper backend = new BackEndDeveloper();
		FrontEndDeveloper frontend = new FrontEndDeveloper();

		Project proj = new Project();
		
		proj.implementOneDev(frontend);
		proj.implementOneDev(backend);
		
		System.out.println("\n======================================================\n");
		
		//List of developers first version
		List<Developer> devs = new ArrayList<>();
		devs.add(frontend);
		devs.add(backend);
		
		Project multiDevs = new Project(devs);
		multiDevs.implementList();
		
		System.out.println("\n======================================================\n");
		
		//List of developers second version
		Project listDev = new Project();
		listDev.implementListTwo(devs);
	}

}
