package carpool;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class TestScript extends TestCase{

	Employee emp = new Employee();
	String actionButton="";
	EmployeeService service = new EmployeeService();
	
	@Given("^employee \"([^\"]*)\" enter the details like \"([^\"]*)\" as source, \"([^\"]*)\" as destination and time is \"([^\"]*)\"$")
	public void setEmployee_FirstSet(String empName, String source, String destination, String time) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		emp = new Employee();
		emp.setEmpName(empName);
		emp.setSource(source);
		emp.setDestination(destination);
		emp.setTime(time);
	}

	@Given("^his email is \"([^\"]*)\" and phone is \"([^\"]*)\"$")
	public void setEmployee_SecondSet(String email, String phone) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    emp.setEmail(email);
	    emp.setPhone(phone);
	}

	@When("^click on \"([^\"]*)\" button$")
	public void buttonclick(String actionButton) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    this.actionButton=actionButton;
	}

	@Then("^data get saved and message \"([^\"]*)\" get displayed with \"([^\"]*)\" button$")
	public void data_get_saved_and_message_get_displayed_with_button(String message, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		assertEquals(message, service.shareCab(emp));
	}

	@Then("^clicking on \"([^\"]*)\" will take him to \"([^\"]*)\" page$")
	public void clicking_on_will_take_him_to_page(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Given("^his email is \"([^\"]*)\"$")
	public void his_email_is(String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		emp.setEmail(email);
	}
}
