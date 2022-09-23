
public class main {

	public static void main(String[] args) {
		
		int sayi1 = 70;
		int sayi2 = 60;
		int sayi3 = 51;
		
		int enBuyuk = sayi3;
		
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		
		if (enBuyuk < sayi1) {
			enBuyuk = sayi1; 
		}
		
		System.out.println("En Büyük = "+enBuyuk);
		
	}

}
