package codegnan;

public class Participant {
	String name;
	String Email;
	long phone;
	String city;
	String state;
	String country;
	int amount;
	/**
	 * @param name
	 * @param email
	 * @param phone
	 * @param city
	 * @param state
	 * @param country
	 */
	public Participant(String name, String email, long phone, String city, String state, String country) {
		super();
		this.name = name;
		Email = email;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
