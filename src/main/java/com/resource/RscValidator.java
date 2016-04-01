package com.resource;

public abstract class RscValidator {
	public ValidatorConfiguration config;
	public RscValidator(){}
	public RscValidator(ValidatorConfiguration config){
		this.config = config;
	}
	
	public void set_config(ValidatorConfiguration config){
		this.config = config;
	}
	public abstract void init();
	public abstract void head();
	public abstract void options();
	public abstract void get();
	public abstract void post();
	public abstract void put();
	public abstract void delete();
}
