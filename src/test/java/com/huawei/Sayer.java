package com.huawei;

public class Sayer extends Decorator {
	
	public Sayer(){}
	public Sayer(Component c){
		this.c = c;
	}
	@Override
	public void before() {
		// TODO Auto-generated method stub
		System.out.println("say hello");
	}

	@Override
	public void after() {
		// TODO Auto-generated method stub
		System.out.println("say bye");
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		before();
		c.say();
		after();
	}

}
