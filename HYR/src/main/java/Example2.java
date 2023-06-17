import java.io.File;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 {
	
	public static void main(String args[]) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com/");
		TakesScreenshot tc=(TakesScreenshot) driver;
		
		String srcfile=tc.getScreenshotAs(OutputType.BASE64);
		byte[] bytearr=Base64.getDecoder().decode(srcfile);
		File destfile=new File(".\\screenshots.\\img4.jpg");
		FileOutputStream fos=new FileOutputStream(destfile);
		fos.write(bytearr);
		//FileUtils.copyFile(srcfile,destfile);
		System.out.println("sc saved");
		//String rcfile=tc.getScreenshotAs(OutputType.FILE(""));
		driver.quit();
		
		
		
	
	}

}
