package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

	@Test
	void testCreateValidContact() {
		Contact contact = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		
		assertEquals("1234", contact.getID());
		assertEquals("John", contact.getFirstName());
		assertEquals("Smith", contact.getLastName());
		assertEquals("1234567890", contact.getPhone());
		assertEquals("123 Street St", contact.getAddress());
	}
	
	@Test
	void testNullContactID() {
		assertThrows(IllegalArgumentException.class, () -> {

	        new Contact(
	            null,
	            "John",
	            "Smith",
	            "1234567890",
	            "123 Main St"
	        );

	    });
	}
	
	@Test
	void testNullFirstName() {
		assertThrows(IllegalArgumentException.class, () -> {

	        new Contact(
	            "1234",
	            null,
	            "Smith",
	            "1234567890",
	            "123 Main St"
	        );

	    });
	}
	
	@Test
	void testNullLastName() {
		assertThrows(IllegalArgumentException.class, () -> {

	        new Contact(
	            "1234",
	            "John",
	            null,
	            "1234567890",
	            "123 Main St"
	        );

	    });
	}
	
	@Test
	void testNullPhone() {
		assertThrows(IllegalArgumentException.class, () -> {

	        new Contact(
	            "1234",
	            "John",
	            "Smith",
	            null,
	            "123 Main St"
	        );

	    });
	}
	
	@Test
	void testNullAddress() {
		assertThrows(IllegalArgumentException.class, () -> {

	        new Contact(
	            "1234",
	            "John",
	            "Smith",
	            "1234567890",
	            null
	        );

	    });
	}
	
	@Test
	void testTooManyCharContactID() {
		assertThrows(IllegalArgumentException.class, () -> {

	        new Contact(
	            "12345678901234567890",
	            "John",
	            "Smith",
	            "1234567890",
	            "123 Main St"
	        );

	    });
	}
	
	@Test
	void testTooManyCharFirstName() {
		assertThrows(IllegalArgumentException.class, () -> {

	        new Contact(
	            "1234",
	            "JohnJamesJoe",
	            "Smith",
	            "1234567890",
	            "123 Main St"
	        );

	    });
	}
	
	@Test
	void testTooManyCharLastName() {
		assertThrows(IllegalArgumentException.class, () -> {

	        new Contact(
	            "1234",
	            "John",
	            "SmithDoeSmidley",
	            "1234567890",
	            "123 Main St"
	        );

	    });
	}
	
	@Test
	void testTooManyCharPhone() {
		assertThrows(IllegalArgumentException.class, () -> {

	        new Contact(
	            "1234",
	            "John",
	            "Smith",
	            "12345678901234567890",
	            "123 Main St"
	        );

	    });
	}
	
	@Test
	void testTooFewCharPhone() {
		assertThrows(IllegalArgumentException.class, () -> {

	        new Contact(
	            "1234",
	            "John",
	            "Smith",
	            "12345",
	            "123 Main St"
	        );

	    });
	}
	
	@Test
	void testTooManyCharAddress() {
		assertThrows(IllegalArgumentException.class, () -> {

	        new Contact(
	            "1234",
	            "John",
	            "Smith",
	            "1234567890",
	            "123 Not Really Suree What To Write For An Address With More Than 30 Char's But This Should Work Ave"
	        );

	    });
	}
	
	@Test
	void testValidFirstNameChanged() {
		Contact contact = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		
		contact.setFirstName("James");
		
		assertEquals("James", contact.getFirstName());
	}
	
	@Test
	void testValidLastNameChanged() {
		Contact contact = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		
		contact.setLastName("Jones");
		
		assertEquals("Jones", contact.getLastName());
	}
	
	@Test
	void testValidPhoneChanged() {
		Contact contact = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		
		contact.setPhone("0987654321");
		
		assertEquals("0987654321", contact.getPhone());
	}
	
	@Test
	void testValidAddressChanged() {
		Contact contact = new Contact("1234", "John", "Smith", "1234567890", "123 Street St");
		
		contact.setAddress("1234 Street St");
		
		assertEquals("1234 Street St", contact.getAddress());
	}
}
