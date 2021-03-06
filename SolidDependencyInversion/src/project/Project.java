package project;

import java.util.List;

import interfaces.Developer;

public class Project {
	
	//Singular developer
	public void implementOneDev(Developer dev) {
		dev.develop();
	}
	
	
	//List of developers
	private List<Developer> developers;
	
	//Empty constructor
	public Project() {}
	
	//All arguments constructor
	public Project(List<Developer> developers) {
		this.developers = developers;
	}	
	
	//List of developers method 1 - requires stuff from line 15 onwards
	public void implementList() {
		for(Developer dev : developers) {
			//implementOneDev(dev); 		------ 	Implements the singular developer method instead of repeating dev.develop()
			dev.develop();
		}
	}
	
	//List of developers method 2 - KEY DIFFERENCE: we create the list in the parameter, rather than using the list we created earlier
	public void implementListTwo(List<Developer> developers) {
		for(Developer dev : developers) {
			//implementOneDev(dev); 		------ 	Implements the singular developer method instead of repeating dev.develop()
			dev.develop();
		}
	}
	
}
