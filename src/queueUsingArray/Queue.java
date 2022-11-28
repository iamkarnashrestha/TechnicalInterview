package queueUsingArray;

//Java program to implement a queue using an array
class Queue {
	static private int front=0, rear=0;
	private static final int LEN = 50;
	static private int queue[] = new int[LEN];


	// function to insert an element
	// at the rear of the queue
	public void Enqueue(int data)
	{
		// check queue is full or not
		if (LEN == rear) {
			System.out.printf("\nQueue is full\n");
			return;
		}
		else {
			queue[rear] = data;
			rear++;
		}
		return;
	}

	// function to delete an element
	// from the front of the queue
	public void Dequeue()
	{
		// if queue is empty
		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		}

		// shift all the elements from index 2 till rear
		// to the right by one
		else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}

			// store 0 at rear indicating there's no element
			if (rear < LEN)
				queue[rear] = 0;

			// decrement rear
			rear--;
		}
		return;
	}

	// print queue elements
	 void Display()
	{
		int i;
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}

		// traverse front to rear and print elements
		for (i = front; i < rear; i++) {
			System.out.printf(" %d <-- ", queue[i]);
		}
		return;
	}

	// print front of queue

	public static void main(String args[]) {
		Queue q = new Queue();

		// inserting elements in the queue
		System.out.println("Queue before inserting element:");
		q.Display();
		//inserting elements in queue
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		System.out.println("Queue after inserting element:");
		q.Display();
		//deleting dequeuing elements
		q.Dequeue();
		q.Dequeue();
		System.out.println("Queue after dequeing");
		q.Display();
		
	}
}

