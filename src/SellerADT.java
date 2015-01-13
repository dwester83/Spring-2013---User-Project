/**
 * This is the SellerADT Interface, it inherits the UserADT
 * 
 * @author Daniel Wester, Lei Zhang
 */

public interface SellerADT extends UserADT {
	
	/**
	 * Sets the preferred payment method of the seller's.
	 * 
	 * @param paymentMethod String representation of the preferred payment method.
	 */
	public void setPreferredPaymentMethod(String paymentMethod);
	
	/**
	 * Sets the auction store name of the seller's.
	 * 
	 * @param paymentMethod String representation of the auction store name.
	 */
	public void setAuctionStoreName(String storeName);
	
	/**
	 * Returns the preferred payment method of the seller's.
	 * 
	 * @return String representation of the seller's preferred payment method.
	 */
	public String getPreferredPaymentMethod();
	
	/**
	 * Returns the auction store name of the seller's.
	 * 
	 * @return String representation of the seller's auction store name.
	 */
	public String getAuctionStoreName();
	
	/**
	 * Builds an item and adds it to the sellers account.
	 * 
	 * @param name String representation of the item's name.
	 * @param description String representation of the item's description.
	 * @param highBid int representation of the item's highest bid.
	 * @param buyNow int representation of the item's buy it now price.
	 */
	public void addItem(String name, String description, int highBid, int buyNow);
	
	/**
	 * Adds an item to the sellers account.
	 * 
	 * @param item represents item being added to the seller's account.
	 */
	public void addItem(ItemADT item);
	
	/**
	 * Removes an item from the seller's account
	 * 
	 * @param num represents item number to be removed.
	 * @return ItemADT Item that has been removed the the seller's account.
	 */
	public ItemADT removeItem(int number);
	
}
