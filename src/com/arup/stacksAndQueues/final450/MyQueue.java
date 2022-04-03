package com.arup.stacksAndQueues.final450;

public class MyQueue {
	
	int front, rear, size;
	int capacity;
	int[] queueArray;
	
	public MyQueue(int capacity){
		this.queueArray = new int[capacity];
		this.front = 0;
		this.rear = capacity - 1;
		this.capacity = capacity;
		this.size = 0;
	}
	
	public boolean isFull(){
		return this.size == this.capacity;
	}

	public boolean isEmpty(){
		return this.size == 0;
	}
	
	public void enQueue(int value){
		if(this.isFull()){
			return;
		}
		this.rear = (this.rear+1) % this.capacity;
		this.queueArray[rear] = value;
		++this.size;
	}
	
	public int deQueue(){
		if(this.isEmpty()){
			return Integer.MIN_VALUE;
		}
		int value = this.queueArray[front];
		front = (this.front+1) % this.capacity;
		--this.size;
		return value;
	}
	
	public int front(){
		if(this.isEmpty()){
			return Integer.MIN_VALUE;
		}
		return this.queueArray[this.front];
	}
	
	public int rear(){
		if(this.isEmpty()){
			return Integer.MIN_VALUE;
		}
		return this.queueArray[this.rear];
	}
}
