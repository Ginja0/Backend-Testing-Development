package work.main;



import java.util.ArrayList;


public class TaskService {


		ArrayList<Task> tasks;

		public TaskService() {
			tasks = new ArrayList<>();
		}

		// The contact service shall be able to add tasks with a unique ID
		public boolean addTask(Task newTask) {
			boolean contains = false;
			for (Task c : tasks) {
				if (c.getTaskID().equalsIgnoreCase(newTask.getTaskID())) {
					contains = true;
					break;
				}
			}

			if (!contains) {
				tasks.add(newTask);
				return true;
			} else {
				return false;
			}
		}

		// The task service shall be able to delete tasks per taskID.
		public boolean deleteTask(String taskID) {
			boolean deleted = false;
			for (Task c : tasks) {
				if (c.getTaskID().equalsIgnoreCase(taskID)) {
					tasks.remove(c);
					deleted = true;
					break;
				}
			}
			return deleted;
		}

		// Update name
		public boolean updateTaskName(String taskID, String newName) {
			boolean updated = false;
			for (Task c : tasks) {
				if (c.getTaskID().equalsIgnoreCase(taskID)) {
					c.setName(newName);
					updated = true;
					break;
				}
			}
			return updated;
		}

		// Update description for the given contact ID
		public boolean updateTaskDescription(String taskID, String newDescription) {
			boolean updated = false;
			for (Task c : tasks) {
				if (c.getTaskID().equalsIgnoreCase(taskID)) {
					c.setDescription(newDescription);
					updated = true;
					break;
				}
			}
			return updated;
		}

		// Print all the tasks
		public void displayAllTasks() {
			for(Task c: tasks) {
				System.out.println(c.toString());
			}
		}


	}