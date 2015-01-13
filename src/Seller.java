/**
 * This is the Seller class that inherits User, and the Seller interface
 * 
 * @author Daniel Wester, Lei Zhang
 */

public class Seller extends User implements SellerADT {
	
	final int MAX_COUNT = 10;
	
	private String auctionStoreName;
	private String preferredPaymentMethod;
	private ItemADT[] itemSelling;
	private int count;
	
	/**
	 * Default constructor, sets defaults
	 */
	public Seller(){
		super();
		setAuctionStoreName("");
		setPreferredPaymentMethod("");
		this.itemSelling = new ItemADT[MAX_COUNT];
		this.count = 0;
	}
	
	/**
	 * Constructor that sets all the variables
	 * 
	 * @param userName String represents the user name.
	 * @param realName String represents the real name.
	 * @param password String represents the password.
	 * @param email String represents the email.
	 * @param auctionStoreName String represents the auction store name.
	 * @param preferredPaymentMethod String represents the preferred payment method.
	 */
	public Seller(String userName, String realName, String password, String email, String preferredPaymentMethod, String auctionStoreName){
		super(userName, realName, password, email);
		setAuctionStoreName(auctionStoreName);
		setPreferredPaymentMethod(preferredPaymentMethod);
		this.itemSelling = new ItemADT[MAX_COUNT];
		this.count = 0;
	}
	
	/**
	 * Sets the preferred payment method.
	 */
	public void setPreferredPaymentMethod(String paymentMethod) {
		this.preferredPaymentMethod = paymentMethod;
	}
	
	/**
	 * Sets the auction store name.
	 */
	public void setAuctionStoreName(String storeName) {
		this.auctionStoreName = storeName;
	}

	/**
	 * Returns a string representation of the preferred payment method.
	 */
	public String getPreferredPaymentMethod() {
		return preferredPaymentMethod;
	}
	
	/**
	 * Returns a string representation of the auction store name.
	 */
	public String getAuctionStoreName() {
		return auctionStoreName;
	}
	
	/**
	 * Checks if there's an empty space in the array, builds the item, then adds the item to the array.
	 */
	public void addItem(String name, String description, int highBid, int buyNow) {
		testSize();
		itemSelling[count] = new Item(name, description, highBid, buyNow);
		count++;
	}

	/**
	 * Checks if there's an empty space in the array, then adds an ItemADT to the array.
	 */
	public void addItem(ItemADT item) {
		testSize();
		itemSelling[count] = item;
		count++;
	}
	
	/**
	 * Private method that is used to make sure array isn't going over set size.
	 */
	private void testSize(){
		if (count >= MAX_COUNT)
			throw new ArrayIndexOutOfBoundsException("You have reached your max items being sold.");
	}
	
	/**
	 * Removes an item from the array from the number being passed.
	 */
	public ItemADT removeItem(int number){
		if (number > count || number < 1)
			throw new ArrayIndexOutOfBoundsException("There are no items to be removed there.");
		ItemADT item = itemSelling[(number - 1)];
		ItemADT itemMoved = itemSelling[(count - 1)];
		itemSelling[(number - 1)] = itemMoved;
		itemSelling[(count - 1)] = null;
		count--;
		return item;
	}

	/**
	 * Returns a string representation of all the seller's info and items for sale.
	 */
	public String printInfo() {
		
		String output = super.printInfo() + "Auction Store: " + 
				getAuctionStoreName() + "\nPreferred Payment: " +
				getPreferredPaymentMethod() + "\n";
		
		ItemADT item;
		
		for (int i = 0; i < count; i++){
			item = itemSelling[i];
			
			output = output + "\nItem " + (i+1) + " for sale\nItem Name:     " + 
				item.getName() + "\nDescription:   " + item.getDescription() + 
				"\nHigh Bid:      " + item.getHighBid() + "\nBuy Now Price: " + 
				item.getBuyNowPrice() + "\n";
		}
		return output;
	}

}
