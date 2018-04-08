import java.io.*;
import java.util.*;

public class ArrayStack {
	
	int maxSize;
	private double stack[];
	int top;
	
	public ArrayStack(int size) {
		
		maxSize = size;
		stack = new double[maxSize];
		top = -1 ;
	}
	
	public void push(double item) {
		if(top == maxSize -1) {
			
		System.out.println("Stack Overflow!");
		return;
		}			
		else {
			stack[++top] = item;
		}
	}
	
	public double pop(){
		return stack[top--];
		
	}
	
	public boolean isEmpty() {
		return (top == -1);	
	}
		
	public double peek(int n) {
		return stack[n];
	}
	
	public int count() {
		return maxSize;
	}

}
