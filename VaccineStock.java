// Description: This class is the Driver class that we are 
// going to use.It asks the user for input and does the user's 
// desired operation upon the stack until they type "exit"
// or "EXIT".
import java.util.Scanner;

public class VaccineStock {

	private int serialNumber; // holds the serialNumber of the vaccines.
	private String countryName; // holds where the vaccines came from.
	private int numberOfVaccines; //holds the number of the vaccines.
	
	static Scanner scan; //our scanner for the input
	
	private String choice = ""; // the choice string that holds the user's choice.
	
    static myStack<Item> stack; // our generic stack that holds "Item"s
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
	    stack = new myStack<Item>(); // initializing our stack
		VaccineStock vs = new VaccineStock(); //the object for calling the action method within this class
		
	    vs.action(); 
	
	}
	
	void popItem() //Triggers the pop method of the stack. Pops the most recent pushed item from the stack.
	{
		stack.pop();
	}
	void pushItem(Item item) //Triggers the push method of the stack. Pushes an item to the top of the stack.
	{
		stack.push(item);
	}
	
	int action() // method for taking the user's input.
	{

		while(!choice.equalsIgnoreCase("EXIT")) // flag for input taking as long as it is not "EXIT".
		{
			System.out.println("ENTER COMMAND(ADD/DELETE/EXIT)?");

			choice = scan.next(); //taking the input from the user.
			
			if(choice.equalsIgnoreCase("ADD")) // checks if the input is ADD,
			{
				System.out.println("ENTER ITEM DATA?"); //asking for the item's data.
				this.serialNumber = scan.nextInt();	//initializing the item's data using the input from user.
				this.countryName = scan.next(); //initializing the item's data using the input from user.
				this.numberOfVaccines = scan.nextInt(); //initializing the item's data using the input from user.
				
				Item item = new Item(this.serialNumber,this.countryName,this.numberOfVaccines); // creating a new Item with the data collected from user.

				pushItem(item); // pushing the Item to the stack.
				
			}
			if(choice.equalsIgnoreCase("DELETE") || choice.equalsIgnoreCase("REMOVE")) //checks if the input is REMOVE
			{
				//when stack is not empty, pops an item from the stack and prints its information
				if(!stack.isEmpty()) { 
					Item popped = stack.pop();
					System.out.printf("%d, %s, %d\n",popped.getSerialNumber(),popped.getCountryName(),popped.getNumberOfVaccines());

				}
				//if it is empty, prints out a message to the user.
				else
				{
					System.out.println("Stack is empty");
				}
			}
			

		}
		
		if(!stack.isEmpty()) //When the user chooses EXIT, the program prints the elements of the stack from top to bottom if the stack is not empty.
		{
			stack.print();
		}
		//if it is empty it returns a message to the user.
		else
			System.out.println("Stack is empty");
		return 0;

	}
}
