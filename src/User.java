/**
 * This is the User class that uses the UserADT interface
 * 
 * @author Daniel Wester, Lei Zhang
 *
 */

public class User implements UserADT {
	
	private String userName;
	private String realName;
	private String password;
	private String email;
	
	/**
	 * Default constructor, sets the default values.
	 */
	public User(){
		setUserName("");
		setRealName("");
		setPassword("");
		setEmail("");
	}
	
	/**
	 * Constructor that sets all the variables that are passed.
	 * 
	 * @param userName String that represents the user name.
	 * @param realName String that represents the real name.
	 * @param password String that represents the password.
	 * @param email String that represents the email.
	 */
	public User(String userName, String realName, String password, String email){
		setUserName(userName);
		setRealName(realName);
		setPassword(password);
		setEmail(email);
	}
	
	/**
	 * Sets the user's user name.
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	/**
	 * Sets the user's real name.
	 */
	public void setRealName(String realName){
		this.realName = realName;
	}
	
	/**
	 * Sets the user's password.
	 */
	public void setPassword(String password){
		this.password = password;
	}
	
	/**
	 * Sets the user's email.
	 */
	public void setEmail(String email){
		this.email = email;
	}
	
	/**
	 * Returns a string representation of the user's user name.
	 */
	public String getUserName(){
		return userName;
	}
	
	/**
	 * Returns a string representation of the user's real name.
	 */
	public String getRealName(){
		return realName;
	}
	
	/**
	 * Returns a string representation of the user's password.
	 */
	public String getPassword(){
		return password;
	}
	
	/**
	 * Returns a string representation of the user's email.
	 */
	public String getEmail(){
		return email;
	}
	
	/**
	 * Returns a string representation of the user's info.
	 */
	public String printInfo(){
		return ("\nUser Name: " + getUserName() + "\nReal Name: " + getRealName() + "\nPassword:  " + getPassword() + "\nEmail:     " + getEmail() + "\n");
	}
	
}
