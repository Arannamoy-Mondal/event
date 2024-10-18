// package event.app;
import java.util.*;
import lib.*;
public class EventApp {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Eventmangement Name:");
		String name=sc.next();
		EventManagement evm1 = new EventManagement(name);
		int option;
		while(true) {
			System.out.println("0 for exit");
			System.out.println("1 for show all event");
			System.out.println("2 for show specific event");
			System.out.println("3 for add event");
			System.out.println("4 for add task");
			System.out.println("5 for complete task");
			System.out.println("6 for update customer contact");
			System.out.println("7 for update manager");
			System.out.println("8 for complete event");
			System.out.print("Option:");
			option=sc.nextInt();
			if(option==0)break;
			else if(option==1) {
				if(evm1.events.isEmpty())System.out.println("No event");
				else {
					for(int i=0;i<evm1.events.size();i++)System.out.println(evm1.events.get(i));
				}
			}
			else if(option==2) {
				System.out.print("Id: ");
				String id=sc.next();
				if(evm1.events.isEmpty())System.out.println("No event");
				else {
					System.out.println(evm1.findEvent(id));
				}
			}
			else if(option==3) {
				System.out.print("Title:");
				String title=sc.next();
				System.out.print("Id:");
				String id=sc.next();
				System.out.print("Customer contact:");
				String customerContact=sc.next();
				System.out.print("Event manager:");
				String eventManager=sc.next();
				evm1.addEvent (title,id,customerContact,eventManager);
			}
			else if(option==4) {
				System.out.print("Id:");
				String id=sc.next();
				System.out.print("Task:");
				String tsk=sc.next();
				evm1.addTask(id, tsk);
			}
			else if(option==5) {
				System.out.print("Id:");
				String id=sc.next();
				System.out.print("Option:");
				String tsk=sc.next();
				evm1.completeTask(id,tsk);
			}
			else if(option==6) {
				System.out.print("Id:");
				String id=sc.next(); 
				System.out.print("Contact:");
				String contact=sc.next();
				evm1.updateCustomerContact(id,contact);
			}
			else if(option==7) {
				System.out.print("Id:");
				String id=sc.next(); 
				System.out.print("Manager:");
				String manager=sc.next(); 
				evm1.updateManager(id, manager);
			}
			else if(option==8) {
				System.out.print("Id:");
				String id=sc.next(); 
				evm1.completeEvent(id);
			}
		}
		sc.close();
	}
}
