package com.arup.stacksAndQueues.final450;

public class TestTwoStack {

	public static void main(String[] args) {
		TwoStack twoStack = new TwoStack(5);
		twoStack.push1(10);
		twoStack.push1(20);
		twoStack.push2(50);
		System.out.println(twoStack.pop2());
		System.out.println(twoStack.pop1());
		System.out.println(twoStack.pop1());
	}

}
