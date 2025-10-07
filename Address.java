
public class Address {
	
	private String street;
	private String town;
	private String city;
	
	Address(String s,String t,String c)
	{
		this.street=s;
		this.city=c;
		this.town=t;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
	    return street + ", " + town + ", " + city;
	}
}
