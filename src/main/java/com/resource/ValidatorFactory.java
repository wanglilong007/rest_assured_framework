package com.resource;

public class ValidatorFactory {
	public ValidatorConfiguration config;
	
	public ValidatorFactory(){}
	public ValidatorFactory(ValidatorConfiguration config){
		this.config = config;
	}
	
	public void set_config(ValidatorConfiguration config){
		this.config = config;
	}
	
	@SuppressWarnings("unchecked")
	public RscValidator createValidator(String rsc){
		Class<RscValidator> vc = null;
		try {
			vc = (Class<RscValidator>) Class.forName(rsc);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		RscValidator validator = null;
		try {
			validator = (RscValidator) vc.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		validator.set_config(config);
		return validator;
	}
}
