package work.test;

import work.main.Task;
import work.main.TaskService;

public class TaskTest {



	public static void main (String[] args) {
		// Create taskService object
		TaskService taskService = new TaskService();


		//First test should pass, second test should fail for length, third test should fail for null.
		//failed ID test

		//Testing ID
		Task c1 = new Task("FireFlamez", "SimpleAnswers", "Helpz me this is so long");

		Task c2 = new Task("FireFlamezzzzzzzzzzzzzz", "SimpleAnswers", "Helpz me this is so long");

		Task c3 = new Task("1", "SimpleAnswers", "Helpz me this is so long");

		//Testing name

		Task c4 = new Task("FireFlamez", "SimpleAnswers", "Helpz me this is so long");

		Task c5 = new Task("FireFlamez", "SimpleAnswerss15zzzzz21ormore", "Helpz me this is so long");

		Task c6 = new Task("FireFlamez", "", "Helpz me this is so long");

		//testings description

		Task c7 = new Task("FireFlamez", "SimpleAnswers", "Helpz me this is so long");

		Task c8 = new Task("FireFlamez", "SimpleAnswers", "Helpz me this is so long!!!!!!!!!!! 262020200202020020202002020202002020202022222222222222022222222222222222222222222222222222222222222222222222222222222fail");

		Task c9 = new Task("FireFlamez", "SimpleAnswers", "");



		// Add tasks to service 
		if(taskService.addTask(c1)) {
			System.out.println("C1 added");
		}
		else {
			System.out.println("C1 Test failed");
		}

		if(taskService.addTask(c2)) {
			System.out.println("C2 added");
		}
		else {
			System.out.println("C2 Test failed");
		}

		if(taskService.addTask(c3)) {
			System.out.println("C3 added");
		}
		else {
			System.out.println("C3 Test failed");
		}

		if(taskService.addTask(c4)) {
			System.out.println("C4 added");
		}
		else {
			System.out.println("C4 Test failed");
		}

		if(taskService.addTask(c5)) {
			System.out.println("C5 added");
		}
		else {
			System.out.println("C5 Test failed");
		}

		if(taskService.addTask(c6)) {
			System.out.println("C6 added");
		}
		else {
			System.out.println("C6 Test failed");
		}

		// Try to add again C!, should not be added
		if(taskService.addTask(c7)) {
			System.out.println("C7 added");
		}

		else {
			System.out.println("C7 NOT added");
		}

		if(taskService.addTask(c8)) {
			System.out.println("C8 added");
		}
		else {
			System.out.println("C8 Test failed");
		}

		if(taskService.addTask(c9)) {
			System.out.println("C9 added");
		}
		else {
			System.out.println("C9 Test failed");
		}

	}

}
