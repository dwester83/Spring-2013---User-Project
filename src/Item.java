/**
 * This is the Item class that uses the ItemADT interface.
 * 
 * @author Daniel Wester, Lei Zhang
 */

public class Item implements ItemADT {
	
	private String name;
	private String description;	
	private int highBid;
	private int buyNow;
	
	/**
	 * 
	 */
	public Item(){
		this.name = "";
		this.description = "";
		this.highBid = 0;
		this.buyNow = 0;
	}
	
	public Item(String name, String description, int highBid, int buyNow){
		this.name = name;
		this.description = description;
		this.highBid = highBid;
		this.buyNow = buyNow;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setHighBid(int highBid) {
		if (highBid < 0)
			throw new NumberFormatException("Value must be greater than or equal to 0");
		this.highBid = highBid;
	}

	public void setBuyNowPrice(int buyNowPrice) {
		if (buyNowPrice < 0)
			throw new NumberFormatException("Value must be greater than or equal to 0");
		if (buyNowPrice < this.highBid)
			throw new NumberFormatException("The high bid of the item must be greater than or equal to the high price.");
		this.buyNow = buyNowPrice;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHighBid() {
		return highBid;
	}

	public int getBuyNowPrice() {
		return buyNow;
	}
	
	

}
