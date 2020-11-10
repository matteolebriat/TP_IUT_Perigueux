package sqli.df.tp.tp_test;

public class GestionBar {
	
	private String name;
	private int maximum_seating;
	private int peopleTogether;
	private int nbpeople;
	private String status;

	public void go_to_the_bar(String arg1)  throws Throwable {
		name=arg1;
	}
	
	public void maximum_seating_capacity_is_fixed_to(int arg1) throws Throwable {
		maximum_seating=arg1;
	}
	
	public void these_people_arrive_together(int arg1) throws Throwable {
		peopleTogether=arg1;
	}
	
	public void there_are_in_the_bar(int arg1) throws Throwable {
		nbpeople = arg1;
	}
	
	public void the_bar_is(String arg1) throws Throwable {
		setStatus(arg1);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String arg1) {
		this.name = arg1;
	}

	public int getMaximum_seating() {
		return maximum_seating;
	}

	public void setMaximum_seating(int arg1) {
		this.maximum_seating = arg1;
	}
	
	public int getPeopleTogether() {
		return peopleTogether;
	}

	public void setPeopleTogether(int arg1) {
		this.peopleTogether = arg1;
	}


	public int getNbPeople() {
		return nbpeople;
	}

	public void setNbPeople(int arg1) {
		this.nbpeople = arg1;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



}
