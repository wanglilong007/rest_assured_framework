package com.huawei;

public abstract class Decorator extends Component{
	public Component c;
	public abstract void before();
	public abstract void after();
}
