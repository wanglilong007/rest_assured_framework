package root;

import com.resource.RscValidator;
import com.jayway.restassured.RestAssured;
import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;

public class Nodes extends RscValidator {
	@Override
	public void init() {
		// TODO Auto-generated method stub
		this.config.path = "/nodes";
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		//get response Data
		RestAssured.given().
			auth().basic("wanglilong", "123abc").
		when().
			get(this.config.domain+this.config.path).
		then().
			statusCode(200);
	}

	@Override
	public void post() {
		// TODO Auto-generated method stub
		Map<String, Object>  jsonAsMap = new HashMap<>();
		jsonAsMap.put("name", "esurvey2");
		jsonAsMap.put("os", "linux");
		jsonAsMap.put("ip", "10.68.51.56");
		RestAssured.given().
			auth().basic("wanglilong", "123abc").
			contentType("application/json").
			body(jsonAsMap).
		when().
			post(this.config.domain+this.config.path).
		then().
			contentType("application/json").
			body("name", Matchers.equalTo("esurvey2")).
			statusCode(200);
	}

	@Override
	public void put() {
		// TODO Auto-generated method stub
		RestAssured.given().
			auth().basic("wanglilong", "123abc12").
		when().
			put(this.config.domain+this.config.path).
		then().
			statusCode(401);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
	}

	@Override
	public void head() {
		// TODO Auto-generated method stub
	}

	@Override
	public void options() {
		// TODO Auto-generated method stub
	}


}
