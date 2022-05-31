package cucumbermap;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperation;

public class Login 
{
	@When("User open \"([^\"]*)\" browser with exe as \"([^\"]*)\"$")
	public void user_open_browser_with_exe_as(String bname, String exe) throws Throwable
	{
		Object[] input= new Object[2];
		input[0]=bname;
		input[1]=exe;
		SeleniumOperation.browserLaunch(input);
	}

	@When("User enter URL as \"([^\"]*)\"$")
	public void user_enter_url_as(String url)throws Throwable
	{
		Object[] input1= new Object[1];
		input1[0]=url;
		SeleniumOperation.openApplication(input1);
	    
	}

	@When("User cancel initial Login window")
	public void user_cancel_initial_login_window() throws Throwable
	{
		Object[] input2= new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperation.clickOnElement(input2);
	    
	}

	@When("user navigate on Login button")
	public void user_navigate_on_login_button() throws Throwable
	{
		Object[] input3= new Object[1];
		input3[0]="//*[text()='Login']";
		SeleniumOperation.mouseOver(input3);
	    
	}

	@When("user click on MyProfile")
	public void user_click_on_my_profile() throws Throwable
	{
		Object[] input4= new Object[1];
		input4[0]="//*[text()='My Profile']";
		SeleniumOperation.clickOnElement(input4);
	}

	@When("user enter \"([^\"]*)\" as username")
	public void user_enter_as_username(String uname) throws Throwable
	{
		Thread.sleep(5000);
		Object[] input5= new Object[2];
		input5[0]="//input[@class='_2IX_2- VJZDxU']";
		input5[1]=uname;
		SeleniumOperation.sendKey(input5);
	}

	@When("user enter \"([^\"]*)\" as password")
	public void user_enter_as_password(String pwd) throws Throwable
	{
		Object[] input6= new Object[2];
		input6[0]="//input[@type='password']";
		input6[1]=pwd;
		SeleniumOperation.sendKey(input6);
	}

	@When("^user click on Login button$")
	public void loginB() throws InterruptedException
	{
		Thread.sleep(5000);
		Object[] input7= new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		SeleniumOperation.clickOnElement(input7);
	}

	@Then("Application shows user profile to user")
	public void valid() throws InterruptedException
	{
		Thread.sleep(5000);  
		Object[] input8= new Object[2];
		input8[0]="//*[@class='_1ruvv2']";
		input8[1]="Samriddhi";
		SeleniumOperation.validation(input8);
	}
	@Then("^Application shows appropriate errormessage$")
	public void invalid() throws InterruptedException
	{
		Thread.sleep(5000);
		Object[] input9= new Object[2];
		input9[0]="(//*[text()='Login'])[2]";
		input9[1]="Login";
		SeleniumOperation.validationforInvalid(input9);
	}
	@Then("^browser close$'")
	public void bClose() throws InterruptedException
	{
		Thread.sleep(5000);
		SeleniumOperation.browserClose();
	}
}
