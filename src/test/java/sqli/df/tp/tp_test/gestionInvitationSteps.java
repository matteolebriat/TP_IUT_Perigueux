package sqli.df.tp.tp_test;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class gestionInvitationSteps{
	private GestionBar name;
	private GestionBar nbpeople;
	private GestionBar maxplace;
	private GestionCocktail nbCocktail;
	private GestionCocktail totalPrice;

	@Given("^Mr Pignon and Mr Le blanc go to bar \"([^\"]*)\"$")
	public void mr_Pignon_and_Mr_Le_blanc_go_to_bar(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		name = new GestionBar();
		name.setName(arg1);
	}

	@Given("^There are only (\\d+) seats in the bar\\.$")
	public void there_are_only_seats_in_the_bar(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		maxplace=new GestionBar();
		maxplace.setMaximum_seating(arg1);
	}

	@When("^They arrive, there are (\\d+) in the bar$")
	public void they_arrive_there_are_in_the_bar(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		nbpeople=new GestionBar();
		nbpeople.setNbPeople(arg1);
	}

	@When("^They have true to enter the bar$")
	public void they_have_true_to_enter_the_bar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(nbpeople.getNbPeople()<maxplace.getMaximum_seating());
	}

	@Then("^Mr Le Blanc orders (\\d+) more cocktails$")
	public void mr_Le_Blanc_orders_more_cocktails(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		nbCocktail=new GestionCocktail();
		nbCocktail.setNbCocktail(arg1);
		Assert.assertEquals(2,arg1);
	}

	@Then("^Mr\\. Leblanc checks the bill and pays (\\d+)$")
	public void mr_Leblanc_checks_the_bill_and_pays(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		totalPrice=new GestionCocktail();
		totalPrice.setTotalPrice(arg1);
		Assert.assertEquals(40, arg1);
	}
}