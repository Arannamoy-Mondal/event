package lib;
import java.util.*;
public class EventManagement {
	public String name;
	public ArrayList<Event> events;
	public EventManagement(String name){
		this.name=name;
		this.events=new ArrayList<Event>();
	}
	
	public Event findEvent(String id) {
		for(int i=0;i<events.size();i++) {
			if(events.get(i).id.equals(id)) {
				return events.get(i);
			}
		}
		return null;
	}
	
	public void addEvent (String title,String id,  String customerContact, String eventManager) {
		events.add(new Event(title,id,customerContact,eventManager));
	}
	
	public void addTask (String id, String tsk) {
		Event tmp=findEvent(id);
		if(tmp!=null)tmp.addTask(tsk);
		else System.out.println("Event not found");
	}
	
	public boolean completeTask(String id, String tsk) {
		Event tmp=findEvent(id);
		if (tmp!=null) return tmp.completeTask(tsk);
		else return false;
	}
	
	public void updateCustomerContact(String id, String contact) {
		Event tmp=findEvent(id);
		if (tmp!=null)tmp.updateCustomerContact(contact);
		else System.out.println("Event not found");
	}
	public void updateManager(String id, String manager) {
		Event tmp=findEvent(id);
		if (tmp!=null)tmp.updateManager(manager);
		else System.out.println("Event not found");
	}
	public void completeEvent(String id) {
		Event tmp=findEvent(id);
		if (tmp!=null)tmp.complete();
		else System.out.println("Event "+id+" not found");
	}
	
}