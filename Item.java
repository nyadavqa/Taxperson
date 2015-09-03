import java.util.Scanner;

public class Item {
	private String itemName;
	public enum TYPE { luxury, necessity };
	private TYPE itemType;
	private int itemCost;
	public Item (String name, String type, int cost) {
		itemName = name;
		if (type.equalsIgnoreCase("luxury"))
			itemType = TYPE.luxury;
		else if (type.equalsIgnoreCase("necessity"))
			itemType = TYPE.necessity;
		itemCost = cost;
	}
	public int calculateTax() {
		if (this.itemType == TYPE.luxury) {
			return (int) (this.itemCost * 0.09);
		}
		else if (this.itemType == TYPE.necessity){
			return (int) (this.itemCost * 0.01);
		}
		else {
			return -1;
		}
			
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Product Name");
		String name = s.next();
		System.out.println("Enter the Product Type Necessity / Luxury ");
		String type = s.next();
		System.out.println("Enter the Product cost");
		int cost = s.nextInt();
		
		Item item = new Item(name, type ,cost);
		System.out.println("Item tax = "+item.calculateTax());
		s.close();
		
	}
	
}


