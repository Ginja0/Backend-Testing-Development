package work.test;


import java.util.Date;

import work.main.Appointment;
import work.main.AppointmentService;
import work.main.Task;
import work.main.TaskService;

public class AppointmentServiceTest {
	
	public static void main(String[] args) {
		// Create appointmentService object
		AppointmentService appointmentService = new AppointmentService();

		//Create new contacts
		Appointment c1 = new Appointment("Test", new Date(2022, 9, 24), "I love this appointment!");
		Appointment c2 = new Appointment("Test", new Date(2022, 9, 24), "I love this appointment!");

		// Add contacts to service 
		if(appointmentService.addAppointment(c1)) {
			System.out.println("C1 added");
		}
		else {
			System.out.println("C1 NOT added");
		}

		if(appointmentService.addAppointment(c2)) {
			System.out.println("C2 added");
		}
		else {
			System.out.println("C2 NOT added");
		}

		// Try to add again C!, should not be added
		if(appointmentService.addAppointment(c1)) {
			System.out.println("C1 added");
		}
		else {
			System.out.println("C1 NOT added");
		}

		// Show all the appointments
		System.out.println();
		appointmentService.displayAllAppointments();

		//Delete a appointment
		System.out.println();
		if(appointmentService.deleteAppointment("C1")) {
			System.out.println("Deleted C1");
		}
		else {
			System.out.println("Deleted C1");
		}



		// Show contact
		System.out.println();
		appointmentService.displayAllAppointments();
	}

}


	
	

