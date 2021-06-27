package work.test;





import java.util.*;
import work.main.Appointment;
import work.main.AppointmentService;
import java.util.Date;


public class AppointmentTest {
	@SuppressWarnings("deprecation")
	public static void main (String[] args) {
		
		//creating appoint service object
		AppointmentService appointmentService = new AppointmentService();
		
		
		//Testing ID
		Appointment c1 = new Appointment("Test", new Date(2022, 9, 24), "I love this appointment!");

		Appointment c2 =  new Appointment("Testoooqoqoqoq", new Date(2022, 9, 24), "I love this appointment!");

		Appointment c3 =  new Appointment("", new Date(2022, 9, 24), "I love this appointment!");
		
		//Testing Date

		Appointment c4 =  new Appointment("Test", new Date(2022, 9, 24), "I love this appointment!");

		Appointment c5 = new Appointment("Test", new Date(2000, 9, 24), "I love this appointment!");

		Appointment c6 =  new Appointment("Test", new Date(2021, 6, 12), "I love this appointment!");
		
		//testings description

		Appointment c7 =  new Appointment("Test", new Date(2022, 9, 24), "I love this appointment!");

		Appointment c8 =  new Appointment("Test", new Date(2022, 9, 24), "I love this appointment!afsadfadsfadsfasdfasdfsdafasdfsdafadsfasdfasdfasdfasdfasfsadfasdfasdfasdfsadf");

		Appointment c9 =  new Appointment("Test", new Date(2022, 9, 24), "");
		
		
		// Add appointments to service 
		if(appointmentService.addAppointment(c1)) {
			System.out.println("C1 added");
		}
		else {
			System.out.println("C1 Test failed");
		}

		if(appointmentService.addAppointment(c2)) {
			System.out.println("C2 added");
		}
		else {
			System.out.println("C2 Test failed");
		}

		if(appointmentService.addAppointment(c3)) {
			System.out.println("C3 added");
		}
		else {
			System.out.println("C3 Test failed");
		}

		if(appointmentService.addAppointment(c4)) {
			System.out.println("C4 added");
		}
		else {
			System.out.println("C4 Test failed");
		}

		if(appointmentService.addAppointment(c5)) {
			System.out.println("C5 added");
		}
		else {
			System.out.println("C5 Test failed");
		}

		if(appointmentService.addAppointment(c6)) {
			System.out.println("C6 added");
		}
		else {
			System.out.println("C6 Test failed");
		}

		// Try to add again C!, should not be added
		if(appointmentService.addAppointment(c7)) {
			System.out.println("C7 added");
		}

		else {
			System.out.println("C7 NOT added");
		}

		if(appointmentService.addAppointment(c8)) {
			System.out.println("C8 added");
		}
		else {
			System.out.println("C8 Test failed");
		}

		if(appointmentService.addAppointment(c9)) {
			System.out.println("C9 added");
		}
		else {
			System.out.println("C9 Test failed");
		}
		
	}
	
	
}
