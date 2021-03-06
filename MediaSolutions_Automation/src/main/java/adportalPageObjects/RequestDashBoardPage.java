package adportalPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequestDashBoardPage {
	  WebDriver driver;
	 
	 

	By button_GetStarted= By.xpath("//span[contains(text(),'Get Started')]");
	
	By button_Continue =By.xpath("//datatable-row-wrapper[1]//datatable-body-row[1]//div[2]//datatable-body-cell[6]//div[1]//button[1]");
	
	
	 public RequestDashBoardPage (WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 public  void click_GetStarted () 
	 {
			driver.findElement(button_GetStarted).click();
			
	 }	
	 
	 public  void click_Continue () 
	 {
			driver.findElement(button_Continue).click();
			
	 }	
	
	 
		 
	 
	 
	public void dashBoardPage_Title_verification() {
		String expectedTitle = "SPP - Creative Requests";
		String actualTitle = driver.getTitle();
		System.out.println("The Title this page is:" + " " + actualTitle);

		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("You have landed on the Request DashBoard page");
		} 
		else {
			System.out.println("Please revisit LogIn page and enter valid credentials");
		}
	}
	public void explicitly_Wait_For_GetStartedButton() {
		 WebDriverWait wait = new WebDriverWait(driver,25);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		  xpath("//span[contains(text(),'Get Started')]"))); 
	}
	
	
	
	
}
