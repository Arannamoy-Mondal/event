package lib;
import java.util.*;
public class Event {
	public String title;
	public String id;
	public String customerContact;
	public String eventManager;
	public String status;
	public ArrayList<String> tasks;
//	=new ArrayList<String>()
	public Event(String title,String id,String customerContact,String eventManager){
		this.title=title;
		this.id=id;
		this.customerContact=customerContact;
		this.eventManager=eventManager;
		this.status="Scheduled";
		this.tasks=new ArrayList<String>();
	}
	
	public void addTask(String tsk) {
		tasks.add(tsk);
	}
	public boolean completeTask (String tsk) {
		for(int i=0;i<tasks.size();i++) {
			if (tsk.equals(tasks.get(i)))return true;
		}
		return false;
	}
	
	public void updateCustomerContact (String contact) {
		customerContact=contact;
	}
	
	public void updateManager (String mngr) {
		
		eventManager=mngr;
	}
	
	public void complete () {
		status="complete";
	}
	
	public String toString() {
		// String taskTotal="";
		// for(String it:tasks)taskTotal+=it;
		return "Name: "+title+", Id: "+id+", Customer Contact: "+customerContact+", Event Manager:"+eventManager+"Status: "+status+", Tasks:"+tasks;
	}
}
