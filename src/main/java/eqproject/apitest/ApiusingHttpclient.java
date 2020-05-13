package eqproject.apitest;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApiusingHttpclient {
	WebDriver driver = null;

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String str = "https://www.equifax.com/business/all-products/";
		driver.get(str);
		driver.findElement(By.xpath("//a[@href='#products-tab']")).click();
	}

	public void getLinks() {
		WebElement productlinks = driver.findElement(By.xpath("//div[@class='tab-content']"));
		List<WebElement> links = productlinks.findElements(By.tagName("a"));
		int linkcount = productlinks.findElements(By.tagName("a")).size();
		System.out.println("Linkcount=>" + linkcount);
		for (int i = 0; i < linkcount; i++) {
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifyresponse(url);
		}
	}

	public static void verifyresponse(String linkurl) {

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(linkurl);
		try {
			CloseableHttpResponse response = httpClient.execute(httpGet);
			int status = response.getStatusLine().getStatusCode();
			String responsetext = response.getStatusLine().getReasonPhrase();
			if (status >= 200 && status <= 300) {
				System.out.println("Passed=>" + status + "=" + responsetext);
			} else {
				System.out.println("Failed");
			}

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

	public void teardown() {
		driver.close();
	}

	public static void main(String[] args) {
		ApiusingHttpclient api = new ApiusingHttpclient();
		api.setup();
		api.getLinks();
		api.teardown();
	}

}
