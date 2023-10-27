package model;

import java.util.Calendar;

public class Project {

    private boolean status; //active = true, inactive = false
    private String name;
	private String description;
	private Calendar initialDate;
	private Calendar finalDate;
	    
    public Project(boolean status, String name, String description, Calendar initialDate, Calendar finalDate) {
        this.status = status;
		this.name = name;
        this.description = description;
		this.initialDate = initialDate;
		this.finalDate = finalDate;
    }
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	

	
   

    

    
    
}
