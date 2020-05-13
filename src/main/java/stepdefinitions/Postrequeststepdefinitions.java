package stepdefinitions;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Postrequeststepdefinitions 
{
	HttpPost httpPost;
	StringEntity stringEntity;
	 HttpEntity entity;
	 CloseableHttpClient httpclient;
	
	@Given("^Submit a POST Request with data endpoint \"([^\"]*)\"$")
	public void submit_a_POST_Request_with_data_endpoint(String URI) 
	{
	    System.out.println("API Endpoint "+URI);
	}

	@When("^Send POST HTTP Request with Json body \"([^\"]*)\"$")
	public void send_POST_HTTP_Request_with_Json_body(String URI) 
	{
		httpclient= HttpClients.createDefault();
		httpPost = new HttpPost(URI);
	    httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");
	       String postrequest = "{" +
	                "\"name\": \"kumar\", " +
	                "\"salary\": \"1000\", " +
	                "\"age\": \"30\"" +
	                "}";
	       
		System.out.println("Submitting JSON postrequest:"+postrequest);
		try {
			stringEntity = new StringEntity(postrequest);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		httpPost.setEntity(stringEntity);
		System.out.println("Executing POST request :-" + httpPost.getRequestLine());
	    
	}

	@Then("^Verify the Http status code of POST Request Submitted \"([^\"]*)\"$")
	public void verify_the_Http_status_code_of_POST_Request_Submitted(String statuscode) 
	{

		HttpResponse response=null;
		try {
			response = httpclient.execute(httpPost);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int status = response.getStatusLine().getStatusCode();
        System.out.println("Retrieved Status Code-"+" "+status);
        
        if (status==Integer.parseInt(statuscode)) 
        {
         System.out.println("Post request success "+status);
        	
        } else {
            System.out.println("Unexpected Response status");
        }   
	}
}
