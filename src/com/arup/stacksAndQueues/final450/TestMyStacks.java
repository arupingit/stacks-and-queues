package com.arup.stacksAndQueues.final450;

public class TestMyStacks {

	public static void main(String[] args) {
		MyStack myStack = new MyStack(5);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		
		for(int i=0; i<5; i++){
			System.out.println(myStack.pop());
		}
	}

}
