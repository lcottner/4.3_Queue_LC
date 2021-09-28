
public class Queue {
	private LinkedList myList=new LinkedList();
	private Node aNode;
	
	public void enqueue(String a) {
		aNode=new Node();
		aNode.setData(a);
		myList.addNode(aNode);
	}
	
	public String dequeue() {
		if (myList.isEmpty()==false) {
			return myList.deq();
		}
			
		else {
			System.out.println("There is nothing in the queue");
		}
		return "bug";
	}
	
	public void display() {
		if (myList.isEmpty()==true)
			System.out.println("The queue is currently empty");
		else {
		System.out.print("\nYour current queue: ");
		Node tempnode=myList.getList();
		do 
		{
			System.out.print(tempnode.data + " ");
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
		}
	}
	
	public String getFront() {
		return myList.getFirst();
	}
	
	}

