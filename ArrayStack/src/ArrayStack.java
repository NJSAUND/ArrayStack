import java.io.*;
import java.util.*;

public class ArrayStack {
	
	int maxSize;//allows variable to be used across class
	private double stack[]; //initiates array
	int counter; //tracks the top of the array
	
	public ArrayStack(int size) {
		
		maxSize = size; //allows variable to be used across class
		stack = new double[maxSize]; //sets array size to int size
		counter = -1; //starts at index -1 as 0, since index 0 is the first one
	}
	
	public void push(double item) throws Exception {//push method to push double item onto stack
		if(count() < maxSize) {
			
			double newStack[] = new double[++maxSize]; 
			
			/*I tried array copy but that did not work well.  
			This is my second attempt and it does display the correct order, but I believe it causes problems with how pop functions.
			 */
			
			
			for (int i = 0; i<counter-1; i++) {
			
			newStack[i+1] = stack[i]; 
			
			}
		stack = newStack;
		stack[0] = item; //  adds item to stack
		counter++;//adds to counter
			
		}			
			
		else if (count() >= maxSize) {
			throw new Exception("Stack overflow!");//error handling if more than maxSize
			
		}
	}
		
		
		
	public double pop() throws Exception {//pop method 
		if(isEmpty()) {//if top is outside of array displays error
			throw new Exception("Stack is empty: cannot pop!");
	}
		//stack top= stack[counter - 1];
		counter--;
		return stack[0];
		
	}
	
	public boolean isEmpty() {//isEmpty method
		return counter == 0;	//returns false and true depending on if its empty
	}

	public double peek(int n) throws Exception{
		if(counter > -1) {//if top is greater than 0 it will continue as normal
			return stack[n];
		}
		else {//throws error for exceeding boundary or size
			throw new Exception("Desired input is outside of array!");
		}
	}
	
	public int count() { //count method
		return counter;
	}

}
