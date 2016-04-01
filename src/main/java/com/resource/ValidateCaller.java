package com.resource;

import java.util.ArrayList;

public class ValidateCaller {
	private ArrayList<RscValidator> rsclist;

	public ValidateCaller(){
		rsclist = new ArrayList<RscValidator>();
	}
	
	public void RegisterValidator(RscValidator rv){
		rsclist.add(rv);
	}
	
	public void validate(){
		for(int i=0; i<rsclist.size(); i++){
			RscValidator rv = rsclist.get(i);
			rv.init();
			String rsc_path = rv.config.domain+rv.config.path;
			System.out.println("head "+rsc_path);
			rv.head();
			System.out.println("options "+rsc_path);
			rv.options();
			System.out.println("get "+rsc_path);
			rv.get();
			System.out.println("put "+rsc_path);
			rv.put();
			System.out.println("post "+rsc_path);
			rv.post();
			System.out.println("delete "+rsc_path);
			rv.delete();
		}
	}
}
