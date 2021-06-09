package cohort;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) throws Exception
	{
		
		ChromeDriver driver=new ChromeDriver();	//open firefox browser
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.ebay.com");  		//open the given url
		driver.findElement(By.id("gh-ac")).sendKeys("Laptops");	
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(5000);
		List<WebElement> lst=driver.findElements(By.xpath("//h3[contains(text(),'Lenovo')]"));
		String str;
		System.out.println("Lenovo Computers");
		for(int i=0;i<lst.size();i++)
		{
			str=lst.get(i).getText();
			System.out.println("name:"+str);

	    }
		Thread.sleep(5000);
		driver.close();

}
}
