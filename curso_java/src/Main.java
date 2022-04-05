import java.util.Locale;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: %n"
				+ "%s, wich price is %.2f "
				+ "%s, wich price is %.2f "
				+ "%n%n"
				+ "Record: %d years old, code %d and gender: %c"
				+ "%n%n"
				+ "Measure with eight decimal places: %.8f"
				+ "%n"
				+ "Rounded (three decimal places: %.3f)"
				+ "%n"
				+ "US decimal point: %.3f"
				, product1, price1, product2, price2, age, code, gender, measure, measure, measure);
		

	}

}
