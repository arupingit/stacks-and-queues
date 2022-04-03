package com.arup.stacksAndQueues.final450;

public class TestMyQueue {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue(5);
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		
		for(int i=0;i<5;i++){
			System.out.println(queue.deQueue());
		}
	}

}
