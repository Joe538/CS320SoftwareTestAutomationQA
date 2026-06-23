package contactservice;

// This is the Contact class which contains individual contact data.
public class Contact {
	// VARIABLES
	private String ID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	// CONSTRUCTOR
	public Contact (
			String ID, 
			String firstName, 
			String lastName, 
			String phone, 
			String address
			) {
		
		// ID must be present and less than 11 characters  
		if ( ID == null || ID.length() > 10 ) {
			throw new IllegalArgumentException("ID cannot be null or longer than 10 characters.");
		}
		else this.ID = ID;
		
		// First Name must be present and must be less than 11 characters
		if ( firstName == null || firstName.length() > 10 ) {
			throw new IllegalArgumentException("First Name cannont be null or longer than 10 characters.");
		}
		else this.firstName = firstName;
		
		// Last Name must be present and must be less than 11 characters
		if ( lastName == null || lastName.length() > 10 ) {
			throw new IllegalArgumentException("Last Name cannot be null or more than 10 characters.");
		}
		else this.lastName = lastName;
		
		// Phone Number must be present and must be equal to 10 characters
		if ( phone == null || phone.length() != 10 ) {
			throw new IllegalArgumentException("Phone Number cannot be null and must equal 10 digits.");
		}
		else this.phone = phone;
		
		// Address must be present and must be less than 31 characters
		if ( address == null || address.length() > 30 ) {
			throw new IllegalArgumentException("Address cannot be null or more than 30 characters");
		}
		else this.address = address;
	}
	
	// GETTERS
	public String getID() {
		return ID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	// SETTERS
	public void setFirstName(String firstName) {
		// First Name must be present and must be less than 11 characters
		if ( firstName == null || firstName.length() > 10 ) {
			throw new IllegalArgumentException("First Name cannont be null or longer than 10 characters.");
		}
		else this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		// Last Name must be present and must be less than 11 characters
		if ( lastName == null || lastName.length() > 10 ) {
			throw new IllegalArgumentException("Last Name cannot be null or more than 10 characters.");
		}
		else this.lastName = lastName;
	}

	public void setPhone(String phone) {
		// Phone Number must be present and must be equal to 10 characters
		if ( phone == null || phone.length() != 10 ) {
			throw new IllegalArgumentException("Phone Number cannot be null and must equal 10 digits.");
		}
		else this.phone = phone;
	}

	public void setAddress(String address) {
		// Address must be present and must be less than 31 characters
		if ( address == null || address.length() > 30 ) {
			throw new IllegalArgumentException("Address cannot be null or more than 30 characters");
		}
		else this.address = address;
	}
}
