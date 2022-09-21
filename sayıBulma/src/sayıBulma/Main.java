package sayıBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 13;
		boolean varMi = false;
		
		for(int sayi:sayilar) {
			if(sayi == aranacak) {
				varMi =true;
				break;          // sayıyı bulduğu anda döngüden çıksın.Boş yere öteki sayılara bakmasına gerek yok.
			}
		}
		
		if(varMi) {
			System.out.println("sayi dizi içinde var");
		}else {
			System.out.println("sayi dizi içinde yok");
		}

	}
}
