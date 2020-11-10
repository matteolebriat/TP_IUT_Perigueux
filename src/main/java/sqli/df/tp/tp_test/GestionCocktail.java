package sqli.df.tp.tp_test;

public class GestionCocktail {
	private int price;
	private double totalPrice;
	private int nbCocktail;

	public void they_each_order_a_cokatil_of_the_month_at(int arg1) throws Throwable{
		price=arg1;
	}

	public void at_the_end_the_note_is(int arg1) throws Throwable {
		setTotalPrice(price+price);
	}
	
	public void mr_Le_Blanc_orders_more_cocktails(int arg1) throws Throwable {
		setNbCocktail(arg1);
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getNbCocktail() {
		return nbCocktail;
	}

	public void setNbCocktail(int nbCocktail) {
		this.nbCocktail = nbCocktail;
	}

}
