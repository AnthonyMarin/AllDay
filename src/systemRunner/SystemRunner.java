package systemRunner;


import gui.TicketScreen;
import ticketSystem.Entree;
import ticketSystem.Item;
import ticketSystem.Ticket;
import ticketSystem.TicketBar;

public class SystemRunner {

	public static void main(String[] args) {
	
				TicketBar tBar = new TicketBar();
				Ticket t1 = new Ticket(1);
				
				Entree entree1 = new Entree("Lasagna");
				Entree entree2 = new Entree("Meatballs");
				Entree entree3 = new Entree("Shrimp");
				
				t1.addItem(entree1);
				t1.addItem(entree2);
					entree3.addMod("+ crispy");
				t1.addItem(entree3);
				t1.addItem(entree2);
					
				
				tBar.addTicket(t1);
				
				
				
				Ticket t2 = new Ticket(2);
		
				t2.addItem(entree1);
				t2.addItem(entree2);
				t2.addItem(entree1);

					
				
				tBar.addTicket(t2);
				//tBar.printTickets();
				
				Ticket t3 = new Ticket(3);
				t3.addItem(entree2);
				t3.addItem(entree3);
				tBar.addTicket(t3);
			
				tBar.addTicket(t3);
				tBar.addTicket(t1);
				tBar.addTicket(t3);
				tBar.addTicket(t1);
				tBar.addTicket(t2);
				tBar.addTicket(t3);
				tBar.addTicket(t1);
				tBar.addTicket(t2);
			    TicketScreen ticketBar = new TicketScreen(tBar);
			
			  
	}
}
