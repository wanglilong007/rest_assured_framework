package com.wanglilong;

import com.resource.*;

/**
 * @author wWX216938
 *
 */
public class App {

	public static void main(String[] args) {
		
		//create resource validator
		ValidatorConfiguration config = new ValidatorConfiguration();
		config.domain = "http://10.68.51.98:8888";

		ValidatorFactory f = new ValidatorFactory(config);
		ValidateCaller vc = new ValidateCaller();
		
		//register Resource Validator
		RscValidator version = f.createValidator("root.Version");
		vc.RegisterValidator(version);
		
		//execute validate
		vc.validate();
	}
}
