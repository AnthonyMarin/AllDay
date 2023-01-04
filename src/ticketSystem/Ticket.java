package ticketSystem;

import java.util.ArrayList;

import java.util.List;


public class Ticket {
	List<Item> items = new ArrayList <Item>();
	int id;
	public Ticket(int x) {
		this.id = x;
	}
	public int getTicketId() {	
		return id;
	}
	public void addItem(Item item ) {
		items.add(item);
	}
	public List<Item> getItems() {
		return this.items;
	}
	public void removeItem(Item item) {
		items.remove(item);
	}
	public void printTicket() { //for testing purposes 
		for(Item item : items){
		    item.printItem();
		}
	}
}
