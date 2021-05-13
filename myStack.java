// Description: This class defines the stack that we are
// going to use in our program "VaccineStock" 
// and it is implemented using the
// Linked List Abstract Data Type.
//--------------------------------------
public class myStack<T extends Object>
{
	private int size; // our size variable for getting the size of the stack.
	
	private Item<T> first; //object that holds the first item of the stack.
	
	
	public Item pop() 
	{
		/*
		 * Summary: Pops an item from the top of the stack.
		 * PreCondition: none;
		 * PostCondition: returns the item at the top of the stack.
		 * 
		 * 
		 * Definition: If the stack is empty, it informs the user with a message. When it is not, 
		 * it takes the top of the stack and holds it in a variable then returns it. 
		 * */
		Item itemToPop = new Item();
		
		
		if(isEmpty()) 
		{
			System.out.println("Stack is empty");
		}
		else 
		{
			itemToPop = first;
			
			first = first.next;
			size--;
		}
		return itemToPop;
	}
	public void push(Item<T> item)
	{
		/*
		 * Summary: Pushes the given item to the top of the stack.
		 * PreCondition: it takes a generic Item called item.
		 * Post Condition: item is pushed to the top of the stack.
		 * 
		 * Definition: Creates a reference to the item that is going to be pushed, and 
		 * assigning the pointed item that the item that is going to be added to the stack to the top 
		 * item of the stack.
		 * and than make it point back to the item that we inserted to the stack.
		 * 
		 * */
		Item<T> temp = new Item<T>();
		
		temp = item;
		temp.next = first;
		
		first = temp;
		size++;
				
	}
	public boolean isEmpty()
	{
		/*Summary: Checks if the stack is empty.
		 * precondition: none
		 * postcondition: returns true if the stack is empty, returns false if not.
		 * 
		 * */
		return first == null;
	}
	public void print()
	{
		/* Summary:Prints all of the Items of the stack from top to bottom.
		 * precondition: none
		 * postcondition: all of the items of the stack and their information are printed from top to the bottom.
		 * 
		 * Definition: Creates a reference to the Item that is at the top of the stack.
		 * When it is not null, it prints out its information such as serialNumber, countryName, vaccineNumber
		 * */
		Item<T> temp = first;
		{
			while(temp !=null)
			{
				
				System.out.printf("%d,%s,%d\n" ,temp.getSerialNumber(),temp.getCountryName(),temp.getNumberOfVaccines());
				temp = temp.next;
			
			}
			return;
		}
		

	
		
	}
	public int size()
	{
		return this.size;
	}
	public Item peek() 
	{
		/* Summary = returns the most recent added item to the stack or at the top of the stack.
		 * precondition: none
		 * post condition: returns the Item at the top of the stack.
		 * 
		 * Definition: holds the top Item of the stack if it is not null and returns it.
		 * 
		 * */
		
		Item<T> itemToPeek = new Item<T>();

		
		if(first != null) 
		{
			itemToPeek = first;	
		}
			
			
		
		return itemToPeek;
	}
	
	
	
	
}
