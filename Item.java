
// Title: Linked list, STACK, QUEUE
// Author : Burak Katı
// ID:27775185978	
// Section: 01
// Assignment: 1

// Description: This class defines the Items to be be held in the stack which is implemented using linked list.
//--------------------------------------
public class Item<T> {
	

	private int serialNumber;  // holds the serialNumber of the vaccines.
	private String countryName; // holds where the vaccines came from.
	private int numberOfVaccines; //holds the number of the vaccines.
		
	Item next; // a reference to the item that every item points to.
	
	public Item(int serialNumber, String countryName, int numberOfVaccines) {
		/*Summary: initializes the Item using the data.
		 * precondition: serialNumber is an integer, countryName is a  String and numberOfVaccines is an int
		 * postcondition: Item is initialized with the data.
		 * 
		 * 
		 * */
		
		this.serialNumber = serialNumber;
		this.countryName = countryName;
		this.numberOfVaccines = numberOfVaccines;
		
		
	}
	public Item() 
	{
		//Default  constructor for the Item.
	}
	
	public int getSerialNumber()
	{
		//returns the serialNmber of the Item.
		return this.serialNumber; 
	}
	public String getCountryName()
	{
		//returns the CountryName of the Item
		return this.countryName;
	}
	public int getNumberOfVaccines()
	{
		//returns the Number of Vaccines that is held by the Item.
		return this.numberOfVaccines;
	}
	


}
