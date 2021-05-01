// Title: Linked list, STACK, QUEUE
// Author : Burak Katı
// ID:27775185978	
// Section: 01
// Assignment: 1

// Description: This class is the tester class that we are 
// going to use.It tests the basic operations on the stack. 
public class Tester {
	
	
	public static void main(String[] args) {
		myStack<Item> stack = new myStack<Item>();
		
		Item item1 =new Item(1,"a",10);
		Item item2 =new Item(2,"b",20);
		Item item3 =new Item(3,"c",30);
		Item item4 =new Item(4,"d",40);

		stack.push(item1);
		System.out.println("Pushed item1");
		stack.push(item2);
		System.out.println("Pushed item2");
		stack.pop();
		System.out.println("Popped item1");
		stack.pop();
		System.out.println("popped item2");
		stack.print(); //error stack is empty
		stack.push(item3);
		System.out.println("pushed item3");
		stack.push(item4);
		System.out.println("pushed item4");
		stack.print(); // prints out item4 and item3
	}

}
