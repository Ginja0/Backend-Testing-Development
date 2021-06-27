package work.test;

import work.main.Contact;
import work.main.ContactService;

public class ContactTest {

	public static void main (String[] args) {
		// Create contact service object
		ContactService contactService = new ContactService();


		//First test should pass, second test should fail, third test should fail for null.
		//failed ID test
		
		//Testing ID
		Contact c1 = new Contact("Test", "J", "Chinna", "6449971784", "Da Bronks, USA");

		Contact c2 = new Contact("Test Failure", "ZZZZZZ", "Zappy", "6155202202", "Mi Barrio, USA");

		Contact c3 = new Contact("", "ZZZZZZ", "Zappy", "6155202202", "Mi Barrio, USA");
		
		//Testing firstName

		Contact c4 = new Contact("C2", "test", "Zappy", "6155202202", "Mi Barrio, USA");

		Contact c5 = new Contact("C2", "Test Failure", "Zappy", "6155202202", "Mi Barrio, USA");

		Contact c6 = new Contact("C2", "", "Zappy", "6155202202", "Mi Barrio, USA");
		
		//testings lastName

		Contact c7 = new Contact("C2", "ZZZZZZ", "Test", "6155202202", "Mi Barrio, USA");

		Contact c8 = new Contact("C2", "ZZZZZZ", "Test Failure", "6155202202", "Mi Barrio, USA");

		Contact c9 = new Contact("C2", "ZZZZZZ", "", "6155202202", "Mi Barrio, USA");
		
		//testing phoneNumber

		Contact c10 = new Contact("C2", "ZZZZZZ", "Zappy", "6155202202", "Mi Barrio, USA");

		Contact C11 = new Contact("C2", "ZZZZZZ", "Zappy", "615520", "Mi Barrio, USA");

		Contact c12 = new Contact("C2", "ZZZZZZ", "Zappy", "", "Mi Barrio, USA");
		
		//testing address

		Contact c13 = new Contact("C2", "ZZZZZZ", "Zappy", "6155202202", "Mi Barrio, USA");

		Contact c14 = new Contact("C2", "ZZZZZZ", "Zappy", "6155202202", "Test FailureTest FailureTest FailureTest FailureTest Failure");

		Contact c15 = new Contact("C2", "ZZZZZZ", "Zappy", "6155202202", "");

		// Add contacts to service 
		if(contactService.addContact(c1)) {
			System.out.println("C1 added");
		}
		else {
			System.out.println("C1 Test failed");
		}

		if(contactService.addContact(c2)) {
			System.out.println("C2 added");
		}
		else {
			System.out.println("C2 Test failed");
		}

		if(contactService.addContact(c3)) {
			System.out.println("C3 added");
		}
		else {
			System.out.println("C3 Test failed");
		}

		if(contactService.addContact(c4)) {
			System.out.println("C4 added");
		}
		else {
			System.out.println("C4 Test failed");
		}

		if(contactService.addContact(c5)) {
			System.out.println("C5 added");
		}
		else {
			System.out.println("C5 Test failed");
		}

		if(contactService.addContact(c6)) {
			System.out.println("C6 added");
		}
		else {
			System.out.println("C6 Test failed");
		}

		// Try to add again C!, should not be added
		if(contactService.addContact(c7)) {
			System.out.println("C7 added");
		}

		else {
			System.out.println("C7 NOT added");
		}

		if(contactService.addContact(c8)) {
			System.out.println("C8 added");
		}
		else {
			System.out.println("C8 Test failed");
		}

		if(contactService.addContact(c9)) {
			System.out.println("C9 added");
		}
		else {
			System.out.println("C9 Test failed");
		}

		if(contactService.addContact(c10)) {
			System.out.println("C10 added");
		}
		else {
			System.out.println("C10 Test failed");
		}

		if(contactService.addContact(C11)) {
			System.out.println("C11 added");
		}
		else {
			System.out.println("C11 Test failed");
		}

		if(contactService.addContact(c12)) {
			System.out.println("C12 added");
		}
		else {
			System.out.println("C12 Test failed");
		}

		if(contactService.addContact(c13)) {
			System.out.println("C13 added");
		}
		else {
			System.out.println("C13 Test failed");
		}
		if(contactService.addContact(c14)) {
			System.out.println("C14 added");
		}
		else {
			System.out.println("C14 Test failed");
		}
		if(contactService.addContact(c15)) {
			System.out.println("C15 added");
		}
		else {
			System.out.println("C15 Test failed");
		}
	}
}


