/*
 * Test file for homework 1
 * 
 */

import java.io.*;

class Test
{

 public static void main(String[] arg) throws IOException
 {
  
  System.out.println("\nCREATING TEST USERS...");
  
  UserADT u1 = new User();   // Creates a user using the default constructor
  u1.setUserName("jdoe");
  u1.setRealName("Jane Doe");
  u1.setPassword("jane_password");
  u1.setEmail("jdoe@hotmail.com");
  
  UserADT u2 = new User("jsmith", "Joe Smith", "password", "jsmith@yahoo.com");
 
  SellerADT s1 = new Seller("rnelson", "Ron Nelson", "password", "rnelson@yahoo.com", "Visa", "Cool Stuff for Sale");
  s1.addItem("bike", "2006 Huffy", 0, 85);  

  System.out.println("Here is the info for " + u1.getUserName() + ": " + u1.printInfo());

  System.out.println("Here is the info for " + u2.getUserName() + ": " + u2.printInfo());
  System.out.println(u2.printInfo());

  System.out.println("Here is the info for " + s1.getUserName()  + "and their store" + s1.getAuctionStoreName() + ": \n" + s1.printInfo());

  ItemADT i1 = new Item("laptop", "MacBook Pro", 0, 400);
  s1.addItem(i1);

  
  //Adding items to seller's account to reach max.
  for (int i = 0; i < 8; i++){
	  i1 = new Item("test " + i, "This is a test", 0, 100);
	  s1.addItem(i1);
  }
  
  //Should print out a list of 10 items.
  System.out.println(s1.printInfo());
  
  //Should stop me from adding anymore items.
  try{
	  i1 = new Item("Another item", "This is a test", 0, 100);
	  s1.addItem(i1);
  } catch (ArrayIndexOutOfBoundsException aioob){
	  System.out.println(aioob.getMessage());
  }
  System.out.println(s1.printInfo());
  
  //Should remove item 5 from the list.
  s1.removeItem(5);
  System.out.println(s1.printInfo());
  
  //This should remove al1 items from list.
  for (int i = 9; i > 0; i--)
	  s1.removeItem(i);
  System.out.println(s1.printInfo());
  
  //Testing to see if I can still remove.
  try{
	  s1.removeItem(1);
  } catch (ArrayIndexOutOfBoundsException aioob){
	  System.out.println(aioob.getMessage());
  }
  System.out.println(s1.printInfo());
  
  //Testing the sets and gets of the itemADT I should throw an exception then contiune on.
  try{
  i1.setName("This is a name");
  i1.setDescription("This is a description");
  i1.setHighBid(20);
  i1.setBuyNowPrice(10);
  } catch (Exception e){
	  System.out.println(e.getMessage());
  }
  i1.setBuyNowPrice(50);
  System.out.println(i1.getName() + " | " + i1.getDescription() + " | " + i1.getHighBid() + " | " + i1.getBuyNowPrice());
  
  
  
  
  
 }
}
 

/********
Output may look as follows:

Here is the info for Jane Doe
----------------------------------
User Name: jdoe
Real Name: Jane Doe
Password:  jane_password
Email:     jdoe@hotmail.com

Here is the info for Joe Smith
----------------------------------
User Name: jsmith
Real Name: Joe Smith
Password:  password
Email:     jsmith@yahoo.com

Here is the info for Ron Nelson and their store Cool Stuff for Sale 
----------------------------------
User Name: rnelson
Real Name: Ron Nelson
Password:  password
Email:     rnelson@yahoo.com

Item 1 for sale
Item Name:     bike  
Description:   2006 huffy
High Bid:      0
Buy Now Price: 85

Here is the info for Ron Nelson and their store Cool Stuff for Sale 
----------------------------------
User Name: rnelson
Real Name: Ron Nelson
Password:  password
Email:     rnelson@yahoo.com

Item 1 for sale
Item Name:     bike  
Description:   2006 huffy
High Bid:      0
Buy Now Price: 85

Item 1 for sale
Item Name:     laptop 
Description:   MacBook Pro
High Bid:      0
Buy Now Price: 400

**/


