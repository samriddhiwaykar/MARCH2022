package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperation
{
	public static WebDriver driver=null;
	public static void browserLaunch(Object[]inputParameters)//launch browser
	{
		String bname=(String) inputParameters[0];
		String exe=(String) inputParameters[1];
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", exe);
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			}
		else if (bname.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.geckodriver.driver",exe);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
	}
		public static void openApplication(Object[]inputParameters)//open application
		{
			String URL=(String) inputParameters[0];
			driver.get(URL);
		}
		public static void clickOnElement(Object[]inputParameters)
		{
			String XPATH=(String) inputParameters[0];
			driver.findElement(By.xpath(XPATH)).click();
		}
		public static void mouseOver(Object[]inputParameters)//mouse actions to automate elements
		{	
	String XPath=(String) inputParameters[0];
	Actions act=new Actions(driver);
	WebElement web=driver.findElement(By.xpath(XPath));
	act.moveToElement(web).build().perform();
	}
		public static void sendKey(Object[]inputParameters)
		{
			String XPath=(String) inputParameters[0];
			String val=(String) inputParameters[1];
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath(XPath)).sendKeys(val);
			}	
	public static void validation(Object[]InputParameters)
	{
		String XPATH=(String) InputParameters[0];
				String text=(String) InputParameters[1];	
	String actualText=driver.findElement(By.xpath(XPATH)).getText();			
	
	if(actualText.equalsIgnoreCase(text))
	{
		System.out.println("Text Case Pass");
	}
	else
	{
		System.out.println("Text Case Fail");
		}
	}
	public static void validationforInvalid(Object[]InputParameters)
	{
		String XPATH=(String) InputParameters[0];
				String text=(String) InputParameters[1];	
	String actualText=driver.findElement(By.xpath(XPATH)).getText();			
	
	if(actualText.equalsIgnoreCase(text))
	{
		System.out.println("Text Case Pass");
	}
	else
	{
		System.out.println("Text Case Fail");
		}
	}
	
	public static void browserClose()
	{
		driver.close();
	
	}}
