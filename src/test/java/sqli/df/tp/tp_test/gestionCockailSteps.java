package sqli.df.tp.tp_test;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class gestionCockailSteps {
	private GestionBar nameBar;
	private GestionBar nbpeople;
	private GestionBar nbplacemax;
	private GestionBar status;
	private GestionCocktail price;
	private GestionCocktail totalPrice;
	private Client etat;

	@Given("^They both go to the bar \"([^\"]*)\"$")
	public void they_both_go_to_the_bar(String arg1) throws Throwable {
		nameBar=new GestionBar();
		nameBar.setName(arg1);
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^Maximum seating capacity is fixed to $")
	public void maximum_seating_capacity_is_fixed_to(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		nbplacemax= new GestionBar();
		nbplacemax.setMaximum_seating(arg1);
	}


	@When("^They arrive there are (\\d+) people in the bar$")
	public void they_arrive_there_are_people_in_the_bar(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		nbpeople= new GestionBar();
		nbpeople.setNbPeople(arg1);

	}	
	@When("^The bar is (\\d+)$")
	public void the_bar_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		status = new GestionBar();
		status.setStatus(arg1);	
		}


	@Then("^They each order a cocktail of the month at (\\d+)$")
	public void they_each_order_a_cocktail_of_the_month_at(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    price = new GestionCocktail();
		price.setPrice(arg1);
		Assert.assertEquals(10, arg1);
	}

	@Then("^At the end the note is (\\d+)$")
	public void at_the_end_the_note_is(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		totalPrice= new GestionCocktail();
		totalPrice.setTotalPrice(arg1);
		Assert.assertEquals(20,arg1);
		
	}

	@Then("^Mr Pignon is \"([^\"]*)\"$")
	public void mr_Pignon_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		etat = new Client();
		etat.setEtat(arg1);
	}

}
