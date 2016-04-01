package com.huawei;

public class Cat extends Component {
	public String color;
	
	public void set_color(String color){
		this.color = color;
	}
	
	public String get_color(){
		return this.color;
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("i only say cat");
	}
}
