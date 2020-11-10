package sqli.df.tp.tp_test;

public class Client {
	private String mr1_as_person;
	private String mr2_as_person;
	private String etat;
	
	
	public void mr1_as_person(String arg1) throws Throwable {
		   mr1_as_person=arg1;
	}
	
	
	public void mr2_as_person(String arg1) throws Throwable {
		  mr2_as_person=arg1;
	} 
	
	
	public void mr_Pignon_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		setEtat(arg1);
		
	}
	
	public String getMr1_as_person() {
		return mr1_as_person;
	}

	public void setMr1_as_person(String mr1_as_person) {
		this.mr1_as_person = mr1_as_person;
	}


	public String getMr2_as_person() {
		return mr2_as_person;
	}


	public void setMr2_as_person(String mr2_as_person) {
		this.mr2_as_person = mr2_as_person;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}

}
