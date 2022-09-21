package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		/*
		System.out.println("Eleman sayısı:"+ mesaj.length());
		System.out.println("Mesajın 5'inci elemanı: "+ mesaj.charAt(4));  // İndex numarası dizilerde olduğu gibi sıfırdan başlar.
		System.out.println(mesaj.concat("Yaşasın!"));  // metin birleştirme
		System.out.println(mesaj.startsWith("A"));    // mesaj A harfi ile başlıyor mu? evet ise true, hayır ise false döner
		System.out.println(mesaj.endsWith("."));    // mesaj nokta işareti ile bitiyor mu? evet ise true, hayır ise false döner
		
		char[] karakter = new char[5];
		mesaj.getChars(0, 5, karakter, 0);
		System.out.println(karakter);
		
		System.out.println(mesaj.indexOf("av"));    // => mesaj ifadesinde 'av' karakterini arar, bulduğu gibi index numarasını döndürür
		System.out.println(mesaj.lastIndexOf("a"));   // => karakteri aramaya sondan başlar. karakter bulunduğunda normal index numarası döndürülür.
		*/
		
		System.out.println(mesaj.replace(' ', '-'));    // mesaj ifadesindeki boşluklar, tre ile değiştirildi
		System.out.println(mesaj.substring(3));        // mesaj ifadesini index=3'den başlayarak yazar.
		System.out.println(mesaj.substring(3, 11));   // mesaj ifasesini belirtilen başlangıç ve son index numarası arasında kalan yeri yazar.
		
		for(String kelime : mesaj.split(" ")) {     // split => mesaj ifadesini boşluk karakterine göre parçalara ayırdı(diziye çevirdi) for ile bunları yazdırdık
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());          // mesaj ifadesinin başında ve sonunda boşluklar varsa bunları yok eder.
		
	}

}
