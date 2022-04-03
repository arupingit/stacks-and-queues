package com.arup.stacksAndQueues.final450;

public class MyStack {

	private int maxSize;
	private long[] stacksArray;
	private int top;
	
	public MyStack(int size) {
		this.maxSize = size;
		this.stacksArray = new long[size];
		this.top = -1;
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public boolean isFull(){
		return (top == (maxSize-1));
	}
	
	public long peek(){
		return stacksArray[top];
	}
	
	public void push(long value){
		stacksArray[++top] = value;
	}
	
	public long pop(){
		return stacksArray[top--];
	}
}
