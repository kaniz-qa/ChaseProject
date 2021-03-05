package chase.stepDef;

import chase.actions.MortgazeActions;
import io.cucumber.java.en.*;

public class MortgazeStepDef {

	
	MortgazeActions mortgazeAct = new MortgazeActions();
	
	@Given("User navigate the url")
	public void user_navigate_the_url() {
		mortgazeAct.homePage();
	}

	@When("Click on home loan link")
	public void click_on_home_loan_link() throws Throwable {
		mortgazeAct.homeLoan();
	}

	@When("Click on get start button from buying home")
	public void click_on_get_start_button_from_buying_home() throws Throwable {
		mortgazeAct.getStartedBtn();
	}

	@When("Click on calculator")
	public void click_on_calculator() throws Throwable {
		mortgazeAct.calculator();
	}

	@When("Scroll down and click on Mortgage calculator")
	public void scroll_down_and_click_on_Mortgage_calculator() throws Throwable {
		mortgazeAct.mortgazeCalcultor();
	}

	@When("Select home purchage")
	public void select_home_purchage() throws Throwable {
		mortgazeAct.homePerchage();
	}

	@When("Input home price")
	public void input_home_price() throws Throwable {
		mortgazeAct.homePrice();
	}

	@When("Input down payment")
	public void input_down_payment() throws Throwable {
		mortgazeAct.downPayment();
	}

	@When("Input zipcode")
	public void input_zipcode() throws Throwable {
		mortgazeAct.zipcode();
	}

	@When("Select credit score")
	public void select_credit_score() throws Throwable {
		mortgazeAct.creditScore();
	}

	@When("Choosing loan")
	public void choosing_loan() throws Throwable {
		mortgazeAct.loan();
	}

	@When("Input current property value")
	public void input_current_property_value() throws Throwable {
		mortgazeAct.propertyValue();
	}

	@When("Click on get my options")
	public void click_on_get_my_options() throws Throwable {
		mortgazeAct.getMyOptionBtn();
	}

	@Then("I can see my avaiability msg")
	public void i_can_see_my_avaiability_msg() throws Throwable {
		mortgazeAct.availableMsg();
	}

	
	
	
}
