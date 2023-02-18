package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundPage {
	WebDriver driver; 
	 public BackgroundPage(WebDriver driver) {
	  this.driver = driver;
	 }
	 @FindBy(how = How.XPATH, using = "//button[text()='Set SkyBlue Background']") WebElement setSkyBlueBackgroundButtonElement;
	 @FindBy(how = How.XPATH, using = "/html/body") WebElement backgroundColorElement;
	 @FindBy(how = How.XPATH, using = "//button[text()='Set White Background']") WebElement setWhiteBackgroundButtonElement;
	 
	 public void setSkyBlueBackgroundButtonExists() {
		 setSkyBlueBackgroundButtonElement.isDisplayed();
	 }
	 public void clickSetSkyBlueBackgroundButton() {
		 setSkyBlueBackgroundButtonElement.click();
	 }
	 public void validationOfChangeToSkyBlue() {
		 backgroundColorElement.getAttribute("style");
		 System.out.println("When click on skyblue background:" + backgroundColorElement.getAttribute("style"));
	 }
	 
	 public void setWhiteBackgroundButtonExists() {
		 setWhiteBackgroundButtonElement.isDisplayed();
	 }
	 public void clickSetWhiteBackgroundButton() {
		 setWhiteBackgroundButtonElement.click();
	 }
	 public void validationOfChangeToWhite() {
		 backgroundColorElement.getAttribute("style");
		 System.out.println("When click on white background:" + backgroundColorElement.getAttribute("style"));
	 }
	 

}
