package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;


public class ContactServiceTest {
	
	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		ArrayList<Contact> contacts = contactService.getContacts();
		Contact contact = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		
		contactService.addContact(contact);
		
		assertEquals("1234", contacts.get(0).getID());
		assertEquals("John", contacts.get(0).getFirstName());
		assertEquals("Smith", contacts.get(0).getLastName());
		assertEquals("1234567890", contacts.get(0).getPhone());
		assertEquals("123 Street St", contacts.get(0).getAddress());
	}
	
	@Test
	void testDuplicateContactId() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		Contact contact2 = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		
		contactService.addContact(contact1);
		
		assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact(contact2);
	    });
		
	}
	
	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		ArrayList<Contact> contacts = contactService.getContacts();
		Contact contact = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		
		contactService.addContact(contact);
		contactService.deleteContact("1234");
		
		assertEquals(0, contacts.size());
		
	}
	
	@Test
	void testFirstNameSearchUpdate() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		contactService.addContact(contact);
		contactService.updateFirstName("1234", "James");
		
		assertEquals("James", contact.getFirstName());
	}
	
	@Test
	void testLastNameSearchUpdate() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		contactService.addContact(contact);
		contactService.updateLastName("1234", "Jones");
		
		assertEquals("Jones", contact.getLastName());
	}
	
	@Test
	void testPhoneSearchUpdate() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		contactService.addContact(contact);
		contactService.updatePhone("1234", "0987654321");
		
		assertEquals("0987654321", contact.getPhone());
	}
	
	@Test
	void testAddressSearchUpdate() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		contactService.addContact(contact);
		contactService.updateAddress("1234", "1234 Street St");
		
		assertEquals("1234 Street St", contact.getAddress());
	}
}
