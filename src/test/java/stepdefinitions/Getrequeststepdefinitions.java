package stepdefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class Getrequeststepdefinitions 
{
	CloseableHttpClient httpClient;
	HttpGet httpGet;
	String responsetext;
	WebDriver driver = null;
    String serviceuri = null;
    		
	@Given("^serviceurl \"([^\"]*)\"$")
	public void serviceurl(String URI) 
    {
    
    	System.out.println("Service URI "+URI);
    }
   
    @When("^Send the Http Get request for endpoint \"([^\"]*)\"$")
    public void send_the_http_get_request_for_something(String getRequest)
    {
    	serviceuri = getRequest;
		httpClient = HttpClients.createDefault();
		httpGet = new HttpGet(getRequest);
		
		System.out.println("Executing GET Request for "+httpGet.getRequestLine().getUri());
    	
    }

    
    @SuppressWarnings("deprecation")
	@Then("^Verify the valid Http response code is (\\d+)$")
    public void verify_the_valid_Http_response_code_is(int statuscode)    {
    
    	 
    	httpClient = HttpClients.createDefault();
		httpGet = new HttpGet(serviceuri);
		
		try {
			CloseableHttpResponse response = httpClient.execute(httpGet);
			statuscode = response.getStatusLine().getStatusCode();
			responsetext = response.getStatusLine().getReasonPhrase();
				Assert.assertTrue("Unexpected ResponseCode", statuscode==200);
				System.out.println("Passed=>" + statuscode + "=" + responsetext);
			

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

        
    }
    	
    }


