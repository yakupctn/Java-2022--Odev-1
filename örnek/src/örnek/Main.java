package örnek;

public class Main {

	public static void main(String[] args) {
		
		for(double number=2;number<10000000000;number++) {
			double total = 0;
			
			for(double i=1;i<number;i++) {
				if(number % i == 0) {
					total += i;
				}
			}
			if(total == number) { 
				System.out.println(number); 
			}
		}
		
		
	}

}
