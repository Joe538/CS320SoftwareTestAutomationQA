package contactservice;

import java.util.ArrayList;

// This is the class object that holds contacts and allows the user to interact with contacts.
public class ContactService {
	// Initialize the contacts list upon startup.
	private ArrayList<Contact> contacts = new ArrayList<>();
	
	public ArrayList<Contact> getContacts() {
		return contacts;
	}
	
	// This function adds a contact and ensures a unique ID.
	public void addContact( Contact contact ) {
		// If not contact exist then a contact can be added without check
		if (contacts.size() == 0) {
			contacts.add( contact );
		}
		// If its not empty then we must check to ensure that another contact doesn't have the same
		// ID.
		else {
			for ( int i = 0; i < contacts.size(); i++ ) {
				Contact contactTest = contacts.get(i); // This is the contact that is tested against.
				// If the test contact has an equal ID to contact being added.
				// Throw the illegal argument exception.
				// Inform the user why the contact adding was rejected.
				if ( contact.getID().equals(contact.getID()) ) {
					throw new IllegalArgumentException("Contact ids must be unique.");
				}
			}
			
			// If no exception is thrown, add the contact.
			contacts.add(contact);
			System.out.println("Contact added successfully.");
		}
	}
	
	// This function deletes a contact whose ID is equal to the ID given in the argument.
	public void deleteContact( String ID ) {
		for ( int i = 0; i < contacts.size(); i ++) {
			Contact contactTest = contacts.get(i); // This is the tested contact.
			// If ID is equal to test contact, delete the contact.
			if ( contactTest.getID().equals(ID) ) {
				contacts.remove( contacts.get(i) ); // This deletes the contact with the same index.
				return;
			}
		}
		
		// If no return was hit then no contact had that same id
		// Print a message informing the user that no contact had a matching ID.
		System.out.println("No contact in the list had an ID matching the requested ID.");
	}
	
	public void updateFirstName( String ID, String firstName ) {
		for ( int i = 0; i < contacts.size(); i ++) {
			Contact contactTest = contacts.get(i); // This is the tested contact.
			// If ID is equal to test contact, delete the contact.
			if ( contactTest.getID().equals(ID) ) {
				contacts.get(i).setFirstName(firstName);
				return;
			}
		}
		
		// If no return was hit then no contact had that same id
		// Print a message informing the user that no contact had a matching ID.
		System.out.println("No contact in the list had an ID matching the requested ID.");
	}
	
	public void updateLastName( String ID, String lastName ) {
		for ( int i = 0; i < contacts.size(); i ++) {
			Contact contactTest = contacts.get(i); // This is the tested contact.
			// If ID is equal to test contact, delete the contact.
			if ( contactTest.getID().equals(ID) ) {
				contacts.get(i).setLastName(lastName);
				return;
			}
		}
		
		// If no return was hit then no contact had that same id
		// Print a message informing the user that no contact had a matching ID.
		System.out.println("No contact in the list had an ID matching the requested ID.");
	}

	public void updatePhone( String ID, String phone ) {
		for ( int i = 0; i < contacts.size(); i ++) {
			Contact contactTest = contacts.get(i); // This is the tested contact.
			// If ID is equal to test contact, delete the contact.
			if ( contactTest.getID().equals(ID) ) {
				contacts.get(i).setPhone(phone);
				return;
			}
		}
		
		// If no return was hit then no contact had that same id
		// Print a message informing the user that no contact had a matching ID.
		System.out.println("No contact in the list had an ID matching the requested ID.");
	}

	public void updateAddress( String ID, String address ) {
		for ( int i = 0; i < contacts.size(); i ++) {
			Contact contactTest = contacts.get(i); // This is the tested contact.
			// If ID is equal to test contact, delete the contact.
			if ( contactTest.getID().equals(ID) ) {
				contacts.get(i).setAddress(address);
				return;
			}
		}
		
		// If no return was hit then no contact had that same id
		// Print a message informing the user that no contact had a matching ID.
		System.out.println("No contact in the list had an ID matching the requested ID.");
	}
}
