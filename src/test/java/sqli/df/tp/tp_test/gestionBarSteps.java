package sqli.df.tp.tp_test;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class gestionBarSteps {

	private Client client1;
	private Client client2;
	private GestionBar nameBar;
	private GestionBar nbplacemax;
	private GestionBar peopletogether;
	private GestionBar nbpeople;
	private GestionBar status;

	@Given("^Mr \"([^\"]*)\" as person$")
	public void mr1_as_person(String arg1) throws Throwable {
	  client1 = new Client();
	  client1.setMr1_as_person(arg1);
	}

	@Given("^Mr \"([^\"]*)\" as a person$")
	public void mr2_as_a_person(String arg1) throws Throwable {
	    client2 = new Client();
	    client2.setMr2_as_person(arg1);
	}

	@Given("^Go to the bar \"([^\"]*)\"$")
	public void go_to_the_bar(String arg1) throws Throwable {
	    nameBar = new GestionBar(); 
	    nameBar.setName(arg1);
	}
	@Given("^Maximum seating capacity is fixed to (\\d+)$")
	public void maximum_seating_capacity_is_fixed_to(int arg1) throws Throwable {
	    nbplacemax = new GestionBar();
        nbplacemax.setMaximum_seating(arg1);
	}

	@When("^These (\\d+) people arrive together$")
	public void these_people_arrive_together(int arg1) throws Throwable {
		peopletogether = new GestionBar();
		peopletogether.setNbPeople(arg1);
	}

	@When("^There are (\\d+) in the bar$")
	public void there_are_in_the_bar(int arg1) throws Throwable {
	    nbpeople = new GestionBar();
	    nbpeople.setNbPeople(arg1);
	}

	@Then("^They are true the right of entry$")
	public void they_are_true_the_right_of_entry() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(nbpeople.getNbPeople()<nbplacemax.getMaximum_seating());
	}

	@Then("^They are false the right of entry$")
	public void they_are_false_the_right_of_entry() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertFalse(nbpeople.getNbPeople()>nbplacemax.getMaximum_seating());
	}
		
	@Then("^The bar is \"([^\"]*)\"$")
	public void the_bar_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		status= new GestionBar();
		status.setStatus(arg1);
	}

}
