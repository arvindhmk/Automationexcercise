package stepdefinitions;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class postRequestwithdatadriven 
{
	HttpPost httpPost;
	StringEntity stringEntity;
	HttpEntity entity;
	CloseableHttpClient httpclient;
	String responseBody=null;
	
	@Given("^Submit a \"([^\"]*)\" Request with data \"([^\"]*)\"$")
    public void submit_a_something_request_with_data_something(String Request, String URI) 
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
	       
		System.out.println("Submitting JSON "+Request+"request"+postrequest);
		try {
			stringEntity = new StringEntity(postrequest);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		httpPost.setEntity(stringEntity);
		System.out.println("Executing POST request :-" + httpPost.getRequestLine());
 
    }
    
    @Then("^Verify the Http status code of Request Submitted \"([^\"]*)\"$")
    public void verify_the_http_status_code_of_request_submitted_something(String statuscode)
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
        System.out.println("Retrieved Status Code-"+""+status);
        
        if (status==Integer.parseInt(statuscode)) 
        {
         System.out.println("Post request success-"+status);
        	
        } else {
            System.out.println("Unexpected Response status");
        }
        Header[] headers = response.getAllHeaders();
        for (Header header : headers) {
        	System.out.println("Key : " + header.getName()
        	      + " ,Value : " + header.getValue());
	}
       
     try {
		responseBody = EntityUtils.toString(response.getEntity());
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     System.out.println("Response Body "+ responseBody);
    }

}