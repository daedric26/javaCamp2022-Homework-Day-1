
public class main {

	public static void main(String[] args) {
		// For
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);	
		}
		System.out.println("Döngü Bitti");
		
		//For Döngüsü ile tek sayılar
		
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);	
		}
		System.out.println("Döngü Bitti");
		
		// For Döngüsü ile çift sayılar
		
		for(int i=2; i<=10; i+=2) {
			System.out.println(i);	
		}
		System.out.println("Döngü Bitti");
		
		// While Döngüsü
		int i=1;
		while(i<10) {
		System.out.println(i);
		i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		//Do-While Döngüsü
		int j=1;
		do {
			System.out.println(j);
			j++;
		} while (j<10);
		System.out.println("Do-While Döngüsü Bitti");
		
	} 	

}
