package APIPKG;

import org.testng.Assert;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import groovy.json.JsonException;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestAPI {
	
		
	public void httpPost() throws JsonException,InterruptedException {
			
		//Initializing Rest API's URL
		String APIUrl = "http://{API URL}";
			
		//Initializing payload or API body
		String APIBody = "{API Body}"; //e.g.- "{\"key1\":\"value1\",\"key2\":\"value2\"}"
					
		// Building request using requestSpecBuilder
		RequestSpecBuilder builder = new RequestSpecBuilder();
			
		//Setting API's body
		builder.setBody(APIBody);
			
		//Setting content type as application/json or application/xml
		builder.setContentType("application/json; charset=UTF-8");
			
		RequestSpecification requestSpec = builder.build();

		//Making post request with authentication, leave blank in case there are no credentials- basic("","")
		Response response = given().body( "{\"name\":\"aad\","+"\"phone\":\"987654123\","
				+ "\"id\":\"+91\","+"\"email\":\"bhawna@yopmail.com\"}");
		when().ContentType(ContentType.JSON).post("http://192.168.1.77:3000/api/register/cycled");
					

		}
