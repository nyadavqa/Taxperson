import java.util.Scanner;

public class TaxTest {

	public static void main (String[] args)
	{
		Item a1 = new Item ("wallet", "luxury", 500);
		Item a2 = new Item ("bag", "necessity", 1000);
		Item a3 = new Item ("watch", "LuxURy", 500);
		Item a4 = new Item ("shoe", "NeceSSity", 1000);
		Item a5 = new Item ("luggage", "INVALID", 200);
	
		if (a1.calculateTax() == 45)
			System.out.println("passed : luxury tax");
		else
			System.out.println("failed : luxury tax");
		if (a2.calculateTax() == 10)
			System.out.println("passed : necessity tax");
		else
			System.out.println("failed : necessity tax");	
		if (a3.calculateTax() == 45)
			System.out.println("passed : Case sensitivity in Luxury name");
		else
			System.out.println("failed : Case sensitivity in Luxury name");	
		if (a4.calculateTax() == 10)
			System.out.println("passed : Case sensitivity in necessity name");
		else
			System.out.println("failed : Case sensitivity in necessity name");	
		if (a5.calculateTax() == -1)
			System.out.println("passed : invalid luxury/necessity passed");
		else
			System.out.println("passed : invalid luxury/necessity passed");
	}
}
