import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Example {
	public static void main(String args[]) throws Exception{

		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("siva.html");
		extent.attachReporter(spark);
	
		//Desktop.getDesktop().browse(new File("mouni.html").toURI());
		//Desktop.getDesktop().browse(new File("mouni.html").toURI());
		/*Another way
		 *one method is file and another method id string  
		 * In string we have to give absolute path
		 * IN file we have to give the instance of the file
		 */
		/*File file=new File("mouni.html");
		ExtentSparkReporter spark =new ExtentSparkReporter(file);*/
		
	ExtentTest test1=extent.createTest("mouni gud girl").assignAuthor("mouni").addScreenCaptureFromPath("C:\\Users\\Mouni\\Pictures\\Screenshots");
	test1.pass("s she is...!!!!!!!!");
	test1.pass("dirty");
	
	
	ExtentTest test2=extent.createTest("kunal bad boy");
	test2.log(Status.FAIL,"s he is...!!!!!!");
	
	extent.createTest("mouni kunal frns").log(Status.PASS, "s they are...!!!!!!!!!!!");
	//all three methods are same no difference
	List<String> mouni=new ArrayList<String>();
	mouni.add("2000");
	mouni.add("1999");
	mouni.add("2004");
	
	Map<Integer,String>mapData=new HashMap<Integer, String>();
	mapData.put(101, "jnasj");
	mapData.put(109, "hbsjx");
	
	extent.createTest("siva worst").pass(MarkupHelper.createLabel("s he is", ExtentColor.GREEN));
	extent.createTest("screenshot","this is the first screenshot").info(MarkupHelper.createLabel("the first sc is ready",ExtentColor.LIME));
	
	
	extent.createTest("rupa my mom").pass(MarkupHelper.createLabel("she is so lovely", ExtentColor.ORANGE));
	
	extent.createTest("add to list").pass(MarkupHelper.createOrderedList(mouni));
	extent.createTest("add to list").info(MarkupHelper.createUnorderedList(mouni));
	extent.createTest("Add hash values").log(Status.PASS, "i am goonna add vales").pass(MarkupHelper.createOrderedList(mapData));
	
	extent.flush();
	
	
	

	}
}
