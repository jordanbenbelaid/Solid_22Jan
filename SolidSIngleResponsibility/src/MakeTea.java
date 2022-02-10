
public class MakeTea {

	private CupOfTea cupOfTea;
	
	public MakeTea(CupOfTea cupOfTea) {
		this.cupOfTea = cupOfTea;
	}
	
	public void boilingWater(int temp) {
		System.out.println("Water is being boiled now");
//		cupOfTea.setTemp(temp);
	}
	
	public void addingMilk() {
		System.out.println("Milk is added last always");
	}
	
	public void addSugar(int sugar) {
		cupOfTea.setNoOfSugars(sugar);
	}
}
