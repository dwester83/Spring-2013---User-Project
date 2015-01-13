/**
 * This is the ItemADT interface.
 * 
 * @author Daniel Wester, Lei Zhang
 */

public interface ItemADT {
	
	/**
	 * Sets a item name to the item.
	 * 
	 * @param String representation of the name.
	 */
	public void setName(String name);
	
	/**
	 * Sets a item description to the item.
	 * 
	 * @param String representation of the description.
	 */	
	public void setDescription(String description);

	/**
	 * Sets the highest bid on the item.
	 * 
	 * @param int representation of the highest bid.
	 */
	public void setHighBid(int highBid);

	/**
	 * Sets a user price to the item.
	 * 
	 * @param int representation of the buy it now price.
	 */
	public void setBuyNowPrice(int buyNowPrice);

	/**
	 * Returns the item's name.
	 * 
	 * @return String of the item.
	 */
	public String getName();

	/**
	 * Returns the item's description.
	 * 
	 * @return String The item's description is returned.
	 */
	public String getDescription();
	
	/**
	 * Returns the user's highbid.
	 * 
	 * @return int The user's highbid is returned.
	 */
	public int getHighBid();
	
	/**
	 * Returns the user's nowprice.
	 * 
	 * @return int The user's nowprice is returned.
	 */
	public int getBuyNowPrice();
	
	
	
	
	
}
