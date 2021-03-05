package chase.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import chase.elements.MortgazeElements;
import chase.utilities.SetupDrivers;


public class MortgazeActions {
	
	MortgazeElements mortgazeEle;
	
	public MortgazeActions() {
		
		this.mortgazeEle = new MortgazeElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, mortgazeEle);
		
	}
	
	
	public void homePage() {
		SetupDrivers.chromeDriver.get("https://www.chase.com/");
		SetupDrivers.chromeDriver.manage().window().maximize();				
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	public void homeLoan() throws Throwable {
		mortgazeEle.homeLoan.click();
		Thread.sleep(2000);
	}

	
	public void getStartedBtn() throws Throwable {
		mortgazeEle.getStartedBtn.click();
		
		for (String winHandle : SetupDrivers.chromeDriver.getWindowHandles()) {
			SetupDrivers.chromeDriver.switchTo().window(winHandle);
		}
		
		Thread.sleep(2000);
	}

	
	public void calculator() throws Throwable {
		mortgazeEle.calculatorLink.click();
		Thread.sleep(2000);
	}
	
	public void mortgazeCalcultor() throws Throwable {
		mortgazeEle.mortgazeCalculatorLink.click();
		
		 //Alert alert = SetupDrivers.chromeDriver.switchTo().alert();
		// alert.accept();
		 
		Thread.sleep(2000);
	}
	
	
	
	public void homePerchage() throws Throwable {
		
		
		 
		Select homePerchage = new Select(mortgazeEle.homePerchage);
		homePerchage.selectByVisibleText("Refinance");
		Thread.sleep(2000);
	}
	
	
	public void homePrice() throws Throwable {
		mortgazeEle.homePrice.sendKeys("10000");
		Thread.sleep(2000);
	}
	
	public void downPayment() throws Throwable {
		mortgazeEle.propertyValue.sendKeys("5000");
		
		Thread.sleep(2000);
	}
	
	public void zipcode() throws Throwable {
		mortgazeEle.zipCode.sendKeys("06360");
		Thread.sleep(2000);
	}
	
	public void creditScore() throws Throwable {
		Select  credit =new Select(mortgazeEle.creditScore);
		credit.selectByVisibleText("Very Good (700 - 739)");
		
		Thread.sleep(2000);
	}
	
	public void loan() throws Throwable {
		Select loan = new Select(mortgazeEle.loan);
		loan.selectByVisibleText("Low Interest");
		Thread.sleep(2000);
	}
	
	
	public void propertyValue() throws Throwable {
		mortgazeEle.propertyValue.sendKeys("5000");
		Thread.sleep(2000);
	}
	
	public void getMyOptionBtn() throws Throwable {
		mortgazeEle.getMyOptionBtn.click();
		Thread.sleep(2000);
	}
	
	public void availableMsg() throws Throwable {
		mortgazeEle.avaiabilityMsg.isDisplayed();
		Thread.sleep(2000);
	}
	
}
