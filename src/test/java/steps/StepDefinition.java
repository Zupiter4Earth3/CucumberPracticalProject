package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BackgroundPage;
import pages.TestBase;

public class StepDefinition extends TestBase{
	BackgroundPage backgroundPage;
	@Before
	public void beforeRun() {
		initDriver();
		backgroundPage = PageFactory.initElements(driver, BackgroundPage.class); 
	}
	
	
	@Given("{string} button exists")
	public void button_exists(String setBackgroundColor) {
		if(setBackgroundColor.equalsIgnoreCase("Set SkyBlue Background")) {
			backgroundPage.setSkyBlueBackgroundButtonExists();
			}else if(setBackgroundColor.equalsIgnoreCase("Set SkyWhite Background")) {
				backgroundPage.setWhiteBackgroundButtonExists();
			}else {
				System.out.println("Background color buttton does not exist");
			}
	}

	@When("I click on the button {string}")
	public void i_click_on_the_button(String button) {
		if(button.equalsIgnoreCase("SkyBlue")) {
			backgroundPage.clickSetSkyBlueBackgroundButton();
			}else if(button.equalsIgnoreCase("White")) {
				backgroundPage.clickSetWhiteBackgroundButton();
			}else {
				System.out.println("Button is disabled");
			}
		
	   
	}

	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
		backgroundPage.validationOfChangeToSkyBlue();
	   
	}

	

	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() {
		backgroundPage.validationOfChangeToWhite();
	    
	}
	@After
	public void afterRun() {
		tearDown(); 
	}


}
