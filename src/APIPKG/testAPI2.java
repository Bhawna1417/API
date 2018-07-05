package APIPKG;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class testAPI2 {
	

	 
	 @SuppressWarnings("unchecked")
	@Test
	public void RegistrationSuccessful()	{		
		// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
		RequestSpecification request = RestAssured.given();
       request.header("Content-Type","application/json");
       request.header("app-id","2");

		// RestAssured.baseURI ="http://192.168.1.77";
	// RestAssured.port = Integer.valueOf(3000);
	 
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Arpi"); // Cast
		requestParams.put("phone", "12121212");
		requestParams.put("isd", "+91");
		requestParams.put("email", "arpi@yopmail.com");

		request.body(requestParams.toJSONString());
		Response response = request.post("http://192.168.1.157:3000/api/register/cycled");
		
		System.out.println("response:"+response);
		//request.given().contentType(ContentType.JSON); 

		
		int statusCode = response.getStatusCode();
		System.out.println("status:"+statusCode);
//		Assert.assertEquals(statusCode, 200);
//String successCode = response.jsonPath().get("SuccessCode");
//Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	}


	}
	



