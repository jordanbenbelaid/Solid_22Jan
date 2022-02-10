
public class CupOfTea {

	private int temp;
	private String taste;
	private int noOfSugars;
	
	public CupOfTea(int temp, String taste, int noOfSugars) {
		super();
		this.temp = temp;
		this.taste = taste;
		this.noOfSugars = noOfSugars;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public int getNoOfSugars() {
		return noOfSugars;
	}

	public void setNoOfSugars(int noOfSugars) {
		this.noOfSugars = noOfSugars;
	}
	
}
