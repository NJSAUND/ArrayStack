public class TestArrayStack {

	public static void main(String[] args) throws Exception {
		int size = 4;
		ArrayStack myStack = new ArrayStack(size); // initiates new array from ArrayStack
		
	
		myStack.push(1);
		System.out.println(myStack.peek(0));//peeks at first index
		System.out.println(myStack.peek(1));//peeks at first index
		System.out.println(myStack.peek(2));//peeks at second index
		//System.out.println(myStack.peek(3));//peeks at third index
		System.out.println("Count: "+ myStack.count());//shows total used indices
	//	myStack.pop();
		//System.out.println("Count: "+ myStack.count());//shows total used indices
		
		myStack.push(2);//pushes n to array	
		System.out.println("\n"+ myStack.peek(0));//peeks at first index
		System.out.println(myStack.peek(1));//peeks at first index
		//System.out.println(myStack.peek(2));//peeks at second index
		System.out.println("Count: "+ myStack.count()+ "\n");//shows total used indices
		
		
		
		myStack.push(3);
		System.out.println(myStack.peek(0));//peeks at first index
		System.out.println(myStack.peek(1));//peeks at first index
		System.out.println(myStack.peek(2));//peeks at second index
		System.out.println("Count: "+ myStack.count()+ "\n");//shows total used indices
		
		myStack.pop();
		
		myStack.push(4);
		System.out.println(myStack.peek(0));//peeks at first index
		System.out.println(myStack.peek(1));//peeks at first index
		System.out.println(myStack.peek(2));//peeks at second index
		System.out.println(myStack.peek(3));//peeks at second index
		System.out.println("Count: "+ myStack.count()+ "\n");//shows total used indices
		
		
		myStack.push(5);
		System.out.println(myStack.peek(0));//peeks at first index
		System.out.println(myStack.peek(1));//peeks at first index
		System.out.println(myStack.peek(2));//peeks at second index
		System.out.println(myStack.peek(3));//peeks at second index
		System.out.println("Count: "+ myStack.count()+ "\n");//shows total used indices
		
		myStack.push(6);
		System.out.println(myStack.peek(0));//peeks at first index
		System.out.println(myStack.peek(1));//peeks at first index
		System.out.println(myStack.peek(2));//peeks at second index
		System.out.println(myStack.peek(3));//peeks at second index
		System.out.println(myStack.peek(4));//peeks at second index
		System.out.println("Count: "+ myStack.count()+ "\n");//shows total used indices
		
	}

}
