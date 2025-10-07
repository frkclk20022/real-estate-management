
public class House {

	private String kind;
	private int room;
	private Address adres;
	private int area;
	private int price;
	public House(String kind, int room, Address adres, int area, int price) {
//		super();
		this.kind = kind;
		this.room = room;
		this.adres = adres;
		this.area = area;
		this.price = price;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public Address getAdres() {
		return adres;
	}
	public void setAdres(Address adres) {
		this.adres = adres;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
	    return kind + " - " + room + " oda - " + area + " m² - " + price + " TL - " + adres;
	}

	
}
