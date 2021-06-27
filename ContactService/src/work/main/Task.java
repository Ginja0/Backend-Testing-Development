package work.main;




public class Task {


	private String taskID;
	private String name;
	private String description;
	
	public Task(String taskID, String name, String description) {
		
		//setting task id if length is 10 or less and not null.
		if(taskID.length() <= 10 && taskID != null) {
			this.taskID = taskID;
		}
		this.setName(name);
		this.setDescription(description);
				
		}
	//setting task name if length is 20 or less, and not null.
	public void setName(String name) {
		
		if (name.length() <= 20 && name != null) {
			
			this.name = name;
		}
	}
	
	//setting description if length is 50 or less, and not null
	public void setDescription(String description) {
		
		if (description.length() <= 50 && description != null) {
			this.description = description;
		}
	
	}
	
	//getters
	public String getTaskID() {
		return taskID;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
			
	}
		
		
		



