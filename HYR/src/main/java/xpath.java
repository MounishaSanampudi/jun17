import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath {
	public static void main(String[] args)throws Exception {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.w3schools.com/xml/xpath_examples.asp");
		
	/*List<WebElement> str=driver.findElements(By.tagName("a"));
	for(WebElement mou:str ) {
	
	System.out.println(mou.getText());
	

}*/
		System.out.println(driver.getTitle());
	}}
