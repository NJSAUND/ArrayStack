public class TestArrayStack {

	public static void main(String[] args) throws Exception {
		
		ArrayStack myStack = new ArrayStack(5); // initiates new array from ArrayStack
		
		System.out.println(myStack.isEmpty());//will return true: is empty
		myStack.push(1);
		System.out.println(myStack.peek(0));//peeks at first index
		System.out.println(myStack.isEmpty());
		System.out.println("Count: "+ myStack.count());//shows total used indices
		myStack.pop();//pop out top index
		System.out.println("Count: "+ myStack.count());//shows total used indices
		myStack.push(2);//pushes n to array
		System.out.println(myStack.peek(0));//peeks at first index
		myStack.push(3);//pushes n to array
		System.out.println(myStack.peek(1));//peeks at second index
		myStack.push(4);//pushes n to array
		System.out.println(myStack.peek(2));//peeks at third index
		myStack.push(5);//pushes n to array
		System.out.println(myStack.peek(3));//peeks at fourth index
		myStack.push(6);//pushes n to array
		System.out.println(myStack.peek(4));//peeks at fifth index
				
		myStack.pop();//pop out top index
		
		System.out.println();
		System.out.println(myStack.peek(myStack.top));//shows that it is LIFO
		System.out.println();
		myStack.push(7);//pushes n to array
		System.out.println(myStack.peek(4));//peeks at fifth index
		System.out.println("Count: "+ myStack.count());//shows total used indices

		System.out.println("\nSUCCESS");
		
	}

}
