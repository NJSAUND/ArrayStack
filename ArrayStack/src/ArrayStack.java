import java.io.*;
import java.util.*;

public class ArrayStack {
	
	int maxSize;//allows variable to be used across class
	private double stack[]; //initiates array
	int top; //tracks the top of the array
	
	public ArrayStack(int size) {
		
		maxSize = size; //allows variable to be used across class
		stack = new double[maxSize]; //sets array size to int size
		top = -1 ; //starts at index -1 as 0, since index 0 is the first one
	}
	
	public void push(double item) throws Exception {//push method to push double item onto stack
		if(top == maxSize) {
			throw new Exception("Stack overflow!");//error handling if more than maxSize
		}			
		else {
			stack[++top] = item; //adds to stack
		}
	}
	
	public double pop() throws Exception {//pop method 
		if(top == -1) {//if top is outside of array displays error
				throw new Exception("Stack is empty: cannot pop!");
		}
		
		return top--;
			
	}
	
	public boolean isEmpty() {//isEmpty method
		return top == -1;	//returns false and true depending on if its empty
	}
		
	public double peek(int n) throws Exception{
		if (n > top) {//if n is less than top throw error
			throw new Exception("Desired input has not be initialized yet!"); //Only allows the inputted numbers to be peeked. Won't peek at a spot that hasn't been pushed into
		}
		else if(top > -1) {//if top is greater than -1 it will continue as norml
			return stack[n];
		}
		else {//throws error for exceeding boundary or size
			throw new Exception("Desired input is outside of array!");
		}
	}
	
	public int count() { //count method
		return top+1; //the top is at the current index, so by adding one to account for index 0 we have the total inputs.
	}

}
