package chase.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MortgazeElements {

	@FindBy(xpath = "//*[@id=\"slick-slide04\"]/a/div[1]")
	public WebElement homeLoan;
	
	@FindBy(xpath = "//*[@id=\"Module3\"]/div/div/div[2]/div[1]/div/div/div/div[3]/a[1]")
	public WebElement getStartedBtn;
	
	//window handle
	
	@FindBy(xpath = "//*[@id=\"SubHeaderOriginal\"]/ul/li[3]/a")
	public WebElement calculatorLink;
	
	
	@FindBy(xpath = "//body/div[1]/div[5]/main[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]")
	public WebElement mortgazeCalculatorLink;
	
	
	
			
	@FindBy(xpath = "/html/body/app-root/section/app-loan-form/div[1]/form/div/div[1]")
	public WebElement calculationPopup;
			
	
	@FindBy(xpath = "/html/body/app-root/section/app-loan-form/div[1]/form/div/div[1]/div[1]/div/div/select")
	public WebElement homePerchage;
	
	
	@FindBy(xpath = "/html/body/app-root/section/app-loan-form/div[1]/form/div/div[1]/div[2]/div/div/input")
	public WebElement homePrice;
	
	//@FindBy(xpath = "/html/body/app-root/section/app-loan-form/div[1]/form/div/div[1]/div[3]/div/div/input[1]")
	//public WebElement downPayment1;
	
	
	
	@FindBy(xpath = "/html/body/app-root/section/app-loan-form/div[1]/form/div/div[1]/div[3]/div/div/input")
	public WebElement propertyValue;
		
	
	
	@FindBy(xpath = "/html/body/app-root/section/app-loan-form/div[1]/form/div/div[1]/div[4]/div/div/input")
	public WebElement zipCode;
	
	@FindBy(xpath = "/html/body/app-root/section/app-loan-form/div[1]/form/div/div[1]/div[5]/div/div/select")
	public WebElement creditScore;
	
	@FindBy(xpath = "/html/body/app-root/section/app-loan-form/div[1]/form/div/div[1]/div[6]/div/div/select")
	public WebElement loan;
	
	//@FindBy(xpath = "")
	//public WebElement propertyValue;
	
	@FindBy(xpath = "/html/body/app-root/section/app-loan-form/div[1]/form/div/div[3]/button")
	public WebElement getMyOptionBtn;
	
	@FindBy(xpath = "")
	public WebElement avaiabilityMsg;
	
	
	
}
