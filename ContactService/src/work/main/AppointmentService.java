package work.main;

import java.util.ArrayList;

public class AppointmentService {

	ArrayList<Appointment> appointments;

	public void appointmentService() {
		appointments = new ArrayList<>();
	}

	// The contact service shall be able to add contacts with a unique ID
	public boolean addAppointment(Appointment newAppointment) {
		boolean contains = false;
		for (Appointment c : appointments) {
			if (c.getAppointmentID().equalsIgnoreCase(newAppointment.getAppointmentID())) {
				contains = true;
				break;
			}
		}

		if (!contains) {
			appointments.add(newAppointment);
			return true;
		} else {
			return false;
		}
	}

	// The contact service shall be able to delete contacts per contact ID.
	public boolean deleteAppointment(String appointmentID) {
		boolean deleted = false;
		for (Appointment c : appointments) {
			if (c.getAppointmentID().equalsIgnoreCase(appointmentID)) {
				appointments.remove(c);
				deleted = true;
				break;
			}
		}
		return deleted;
	}

	// Print all the contacts
	public void displayAllAppointments() {
		for(Appointment c: appointments) {
			System.out.println(c.toString());
		}
	}
}