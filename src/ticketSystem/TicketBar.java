package ticketSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class TicketBar {
	ArrayList<Ticket> tickets = new ArrayList <Ticket>();
	public void addTicket(Ticket t1) {
		// TODO Auto-generated method stub
		tickets.add(t1);
	}
	public int getSize() {
		return this.tickets.size();
		
		
	}
	public void deleteTicket(Ticket t1) {
		// TODO Auto-generated method stub
		tickets.remove(t1);
		
	}
	public ArrayList<Ticket> getTickets() {
		// TODO Auto-generated method stub
		return tickets;
		
	}
	public Ticket getTicketAt(int i) {
		return tickets.get(i);
	}
	public void printTickets() {
		
		for(Ticket ticket : tickets){
			System.out.println("Ticket");
		    ticket.printTicket();
		}
	}
	public void deleteTicketAt(int selectedIndex) {
		// TODO Auto-generated method stub
		this.tickets.remove(selectedIndex);
		
	}
	

}
