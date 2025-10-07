
public class RealEstate {

	private static int housecounter=0;
	private String agent_name;
	private House[] house_list;
	
	public RealEstate(String ag,House[] h)
	{
		this.agent_name=ag;
		this.house_list=h;
	}

	public String getAgent_name() {
		return agent_name;
	}

	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}

	public House[] getHouse_list() {
		return house_list;
	}

	public void setHouse_list(House[] house_list) {
		this.house_list = house_list;
	}
	
	public void addHouse(House h)
	{
		house_list[housecounter]=h;
		housecounter++;
	}
	@Override
	public String toString() {
	    String result = "Emlakçı: " + agent_name + "\nSatılık Evler:\n";
	    for (House house : house_list) {
	        if (house != null) {
	            result += house.toString() + "\n";
	        }
	    }
	    return result;
	}

}
