
public class BedroomAdder {

	public void addSquareFeet(Apartment apartment) {
		apartment.setSquareFootage(apartment.getSquareFootage() + 40);
	}
	
	public void addBedroom(Penthouse penthouse) {
		addSquareFeet(penthouse);
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 2);
	}
}
