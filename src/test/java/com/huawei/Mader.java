package com.huawei;

public class Mader extends Decorator {

	public Mader(){}
	public Mader(Component c){
		this.c = c;
	}
	@Override
	public void before() {
		// TODO Auto-generated method stub
		System.out.println("say mad hello");
	}

	@Override
	public void after() {
		// TODO Auto-generated method stub
		System.out.println("say mad bye");
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		before();
		c.say();
		after();
	}

}
