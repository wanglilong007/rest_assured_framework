package root;

import org.hamcrest.Matchers;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.module.jsv.JsonSchemaValidator;
import com.resource.RscValidator;

public class Version extends RscValidator {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		this.config.path = "/version";
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		//{"date": "", "commit": "", "version": "3.1.0", "build": "85"}
		//get response Data
		RestAssured.get(this.config.domain+this.config.path).
		then().
			contentType("application/json").
			assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("version1.json")).
			assertThat().body("build", Matchers.equalTo("85"));
	}

	@Override
	public void post() {
		// TODO Auto-generated method stub
		RestAssured.post(this.config.domain+this.config.path).
		then().
			statusCode(405);
	}

	@Override
	public void put() {
		// TODO Auto-generated method stub
		RestAssured.put(this.config.domain+this.config.path).
		then().
			statusCode(405);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		RestAssured.delete(this.config.domain+this.config.path).
		then().
			statusCode(405);
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
