package work.test;

import work.main.Task;
import work.main.TaskService;

public class TaskServiceTest {


	public static void main(String[] args) {
		// Create taskService object
		TaskService taskService = new TaskService();

		//Create new contacts
		Task c1 = new Task("FireFlamez", "SimpleAnswers", "Helpz me this is so long");
		Task c2 = new Task("FireFlamez", "SimpleAnswers", "Helpz me this is so long");

		// Add contacts to service 
		if(taskService.addTask(c1)) {
			System.out.println("C1 added");
		}
		else {
			System.out.println("C1 NOT added");
		}

		if(taskService.addTask(c2)) {
			System.out.println("C2 added");
		}
		else {
			System.out.println("C2 NOT added");
		}

		// Try to add again C!, should not be added
		if(taskService.addTask(c1)) {
			System.out.println("C1 added");
		}
		else {
			System.out.println("C1 NOT added");
		}

		// Show all the contacts
		System.out.println();
		taskService.displayAllTasks();

		//Delete a contact
		System.out.println();
		if(taskService.deleteTask("C1")) {
			System.out.println("Deleted C1");
		}
		else {
			System.out.println("Deleted C1");
		}

		//Update C2 contact details
		taskService.updateTaskName("C2", "ZZZZZ");
		taskService.updateTaskDescription("C2", "NotSilver");


		// Show contact
		System.out.println();
		taskService.displayAllTasks();
	}

}



