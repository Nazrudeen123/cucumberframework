package pom.testcase;

import org.apache.bcel.generic.FNEG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.page.FormPage;

public class Formtestcase {
	WebDriver driver;
	FormPage fp;

	@Given("^Launch the Browser$")
	public void launch_the_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Selenium Jars\\Jar\\chromedriver.exe");
		driver = new ChromeDriver();
		fp=new FormPage(driver);
	}

	@Then("^Enter url (.*)$")
	public void Loadurl(String url) throws Throwable {
		driver.get(url);
	}
	@When("^Enter First Name (.*)$")
	public void enter_First_Name_Nazir(String fn) throws Throwable {
	fp.inputFirstName(fn);
		
	}

	@Then("^Enter Last Name (.*)$")
	public void enter_Last_Name_Deen(String ln) throws Throwable {
		fp.inputLastName(ln);
	}
	@Then("^Enter E-Mail (.*)$")
	public void enter_E_Mail_nzr_gmail_com(String emailid) throws Throwable {
		fp.inputEmail(emailid);
	}

	@Then("^Enter Phone# (.*)$")
	public void enter_Phone(String ph) throws Throwable {
		fp.inputPhone(ph);
	}

	@Then("^Enter Address (.*)$")
	public void enter_Address_Chennai(String ad) throws Throwable {
		fp.inputAddress(ad);
	}

	@Then("^Enter City (.*)$")
	public void enter_City_Adyar(String city) throws Throwable {
		fp.inputCity(city);
	}

	@Then("^Enter State (.*)$")
	public void enter_State_TN(String state) throws Throwable {
		fp.inputState(state);
	}

	@Then("^Enter Zip Code (.*)$")
	public void enter_Zip_Code(String zip) throws Throwable {
		fp.inputZipcode(zip);
	}

	@Then("^Enter Website (.*)$")
	public void enter_Website_WWW(String website) throws Throwable {
		fp.inputWebsite(website);
	}

	@Then("^Enter Hosting$")
	public void enter_Hosting_Yes() throws Throwable {
		fp.clickHostingYes();
	}

	@Then("^Enter Project Description (.*)$")
	public void enter_Project_Description_MMM(String pd) throws Throwable {
		fp.inputProject(pd);
	}

	@Then("^Enter Click the button Send$")
	public void enter_Click_the_button_Send() throws Throwable {
		fp.clickbutton();
	}



}
