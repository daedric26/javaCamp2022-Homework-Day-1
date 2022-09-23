
public class main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[5];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ahmet";
		ogrenciler[4]="Mehmet";
		
		for (int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("---------------------------");
		
		// Farklı Yontem
		
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	    
	}

}
