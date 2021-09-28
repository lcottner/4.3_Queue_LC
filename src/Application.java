import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Queue myq=new Queue();
		
		System.out.println("\n-------------");
		System.out.println("Exercise 3");
		
		myq.enqueue("Jane");
		myq.display();
		myq.enqueue("Jess");
		myq.display();
		myq.enqueue("Jill");
		myq.display();
		myq.enqueue(myq.dequeue());
		myq.display();
		myq.enqueue(myq.getFront());
		myq.display();
		myq.enqueue("Jim");
		myq.display();
		String name=myq.dequeue();
		myq.display();
		myq.enqueue(myq.getFront());
		myq.display();
		
		System.out.println("\n-------------");
		

	Queue bbq = new Queue();
	Scanner scan=new Scanner(System.in);
	String res="";
	
	for (int i=0; i<1000; i++)
	{
	System.out.println("\nEnter 1 to Enqueue and 2 to Dequeue or 3 to Quit");
	res=scan.nextLine();	
	
	if (res.equals("1")) {
		System.out.println("Type out what you want to enqueue");
		res=scan.nextLine();	
		bbq.enqueue(res);
		bbq.display();
	}
	else if(res.equals("2")) {
		bbq.dequeue();
		bbq.display();
	}
	else if(res.equals("3")) {
		System.out.print("Your final queue: ");
		bbq.display();
		break;
	}
	else {
		System.out.println("The command was not understood");
	}
		
	}
	
	}
	}