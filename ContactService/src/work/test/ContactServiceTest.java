package work.test;

import work.main.Contact;
import work.main.ContactService;



public class ContactServiceTest {
	public static void main(String[] args) {
		// Create contact service object
		ContactService contactService = new ContactService();

		//Create new contacts
		Contact c1 = new Contact("C1", "Josh", "Chinna", "6449971784", "Da Bronks, USA");
		Contact c2 = new Contact("C2", "Jeff", "Zappy", "6155202202", "Mi Barrio, USA");

		// Add contacts to service 
		if(contactService.addContact(c1)) {
			System.out.println("C1 added");
		}
		else {
			System.out.println("C1 NOT added");
		}

		if(contactService.addContact(c2)) {
			System.out.println("C2 added");
		}
		else {
			System.out.println("C2 NOT added");
		}

		// Try to add again C!, should not be added
		if(contactService.addContact(c1)) {
			System.out.println("C1 added");
		}
		else {
			System.out.println("C1 NOT added");
		}

		// Show all the contacts
		System.out.println();
		contactService.displayAllContacts();

		//Delete a contact
		System.out.println();
		if(contactService.deleteContact("C1")) {
			System.out.println("Deleted C1");
		}
		else {
			System.out.println("Deleted C1");
		}

		//Update C2 contact details
		contactService.updateContactFirstName("C2", "ZZZZZ");
		contactService.updateContactLastName("C2", "NotSilver");
		contactService.updateContactNumber("C2", "4123457653");
		contactService.updateContactAddress("C2", "Nashville, TN");

		// Show contact
		System.out.println();
		contactService.displayAllContacts();
	}

}
