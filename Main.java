
public class Main {

	public static void main(String[] args) {
//		
//		Clock A =new Clock(24,50);
//		A.Display();
//		A.convert();
//		A.Display();
//		

		Address adres1 = new Address("Atatürk Cd.", "Kadıköy", "İstanbul");
        Address adres2 = new Address("Cumhuriyet Mh.", "Bornova", "İzmir");

        // Ev nesneleri oluşturma
        House ev1 = new House("Daire", 3, adres1, 120, 500000);
        House ev2 = new House("Villa", 5, adres2, 250, 1500000);

        // Emlakçı nesnesi oluşturma ve ev listesi ekleme
        House[] evler = new House[5];  // 5 ev kapasiteli dizi
        RealEstate emlakci = new RealEstate("Ahmet Emlak", evler);

        emlakci.addHouse(ev1);  // Ev ekleme
        emlakci.addHouse(ev2);

        // Tüm evleri listeleme
       System.out.println(emlakci);
	}

}
