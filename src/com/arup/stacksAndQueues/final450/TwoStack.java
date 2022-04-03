package com.arup.stacksAndQueues.final450;

public class TwoStack {

	private int[] arrayTwoStack;
	private int capacity;
	private int firstStackHeadPointer;
	private int secondStackHeadPointer;
	
	public TwoStack(int capacity){
		this.arrayTwoStack =  new int[capacity];
		this.firstStackHeadPointer = -1;
		this.secondStackHeadPointer = capacity;
		this.capacity = capacity;
	}
	
	public boolean isEmpty(){
		return ((this.secondStackHeadPointer-this.firstStackHeadPointer-1) == this.capacity);
	}
	
	public boolean isFull(){
		return (this.firstStackHeadPointer+1 == this.secondStackHeadPointer);
	}
	
	public void push1(int value){
		if(this.isFull()){
			return;
		}
		this.arrayTwoStack[++firstStackHeadPointer] = value;
	}
	
	public int pop1(){
		if(firstStackHeadPointer==-1){
			return Integer.MIN_VALUE;
		}
		return arrayTwoStack[firstStackHeadPointer--];
	}
	
	public void push2(int value){
		if(this.isFull()){
			return;
		}
		this.arrayTwoStack[--secondStackHeadPointer] = value;
	}
	
	public int pop2(){
		if(secondStackHeadPointer==this.capacity){
			return Integer.MIN_VALUE;
		}
		return this.arrayTwoStack[this.secondStackHeadPointer++];
	}
}
