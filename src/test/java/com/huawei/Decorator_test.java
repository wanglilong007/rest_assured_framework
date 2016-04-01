package com.huawei;

public class Decorator_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Sayer sayer = new Sayer(cat);
		Mader mader = new Mader(sayer);
		Mader m = new Mader(cat);
		sayer.say();
		m.say();
		//mader.say();
	}

}
