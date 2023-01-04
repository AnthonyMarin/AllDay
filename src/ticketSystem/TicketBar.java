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
		System.out.println("Ticket");
		for(Ticket ticket : tickets){
		    ticket.printTicket();
		}
	}
	

}
