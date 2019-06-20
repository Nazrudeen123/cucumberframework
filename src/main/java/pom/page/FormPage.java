package pom.page;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pom.locator.FormLocator;

public class FormPage extends FormLocator{
	WebDriver driver;

	public FormPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputFirstName(String name) {
		System.out.println(FIRSTNAME_NAME);
		System.out.println(name);
		WebElement FN = driver.findElement(By.name(FIRSTNAME_NAME));
		FN.clear();
		FN.sendKeys(name);
	}

	public void inputLastName(String name) {
		WebElement LN = driver.findElement(By.name(LASTNAME_NAME));
		LN.clear();
		LN.sendKeys(name);
	}

	public void inputEmail(String name) {
		WebElement Email = driver.findElement(By.name(EMAIL_NAME));
		Email.clear();
		Email.sendKeys(name);
	}

	public void inputPhone(String name) {
		WebElement Phone = driver.findElement(By.name(PHONE_NAME));
		Phone.clear();
		Phone.sendKeys(name);
	}

	public void inputAddress(String name) {
		WebElement Address = driver.findElement(By.name(ADDRESS_NAME));
		Address.clear();
		Address.sendKeys(name);
	}

	public void inputCity(String name) {
		WebElement City = driver.findElement(By.name(CITY_NAME));
		City.clear();
		City.sendKeys(name);
	}

	public void inputState(String name) {
		List<WebElement> State = driver.findElements(By.name(STATE_NAME));
		Iterator<WebElement> itr = State.iterator();
		while (itr.hasNext()) {
			WebElement webElement = (WebElement) itr.next();
			if(webElement.getText().trim().equalsIgnoreCase(name)){
				webElement.click();
				
			}
		}
		
	}

	public void inputZipcode(String name) {
		WebElement Zipcode = driver.findElement(By.name(ZIPCODE_NAME));
		Zipcode.clear();
		Zipcode.sendKeys(name);
	}

	public void inputWebsite(String name) {
		WebElement Website = driver.findElement(By.name(WEBSITE_NAME));
		Website.clear();
		Website.sendKeys(name);
	}

	public void clickHostingYes() {
		WebElement HostingYes = driver.findElement(By.xpath(HOSTINGYES_XPATH));
		HostingYes.click();
	}
	public void clickHostingNo(){
		WebElement HostingNo=driver.findElement(By.xpath(HOSTINGNO_XPATH));
		HostingNo.click();
	}

	public void inputProject(String name) {
		WebElement Project = driver.findElement(By.name(PROJECT_NAME));
		Project.clear();
		Project.sendKeys(name);
	}

	public void clickbutton() {
		WebElement button = driver.findElement(By.xpath(BUTTON_XPATH));
		button.click();
	}
}
