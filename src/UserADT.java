/**
 * This is the UserADT interface.
 * 
 * @author Daniel Wester, Lei Zhang
 */

public interface UserADT {
	
	
	/**
	 * Sets a user name to the user.
	 * 
	 * @param userName input of the user name
	 */
	public void setUserName(String userName);
	
	/**
	 * Sets the real name of the user.
	 * 
	 * @param realName input of the real name
	 */
	public void setRealName(String realName);
	
	/**
	 * Sets the password of the user.
	 * 
	 * @param password input of the password
	 */
	public void setPassword(String password);
	
	/**
	 * Sets the email of the user.
	 * 
	 * @param email input of the email
	 */
	public void setEmail(String email);
	
	/**
	 * Returns the user's user name.
	 * 
	 * @return String The user's user name is returned.
	 */
	public String getUserName();
	
	/**
	 * Returns the user's real name.
	 * 
	 * @return String The user's real name is returned.
	 */
	public String getRealName();
	
	/**
	 * Returns the user's password, not sure this would be something that an auction site would want...
	 * 
	 * @return String The user's name is returned.
	 */
	public String getPassword();
	
	/**
	 * Returns the user's email.
	 * 
	 * @return String The user's email is returned.
	 */
	public String getEmail();
	
	/**
	 * Returns all the info about the user.
	 * 
	 * @return String representation of the user's info.
	 */
	public String printInfo();
	
	
}
