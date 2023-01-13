package gui;

import java.awt.GridLayout;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import ticketSystem.Item;
import ticketSystem.Ticket;
import ticketSystem.TicketBar;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Tickets extends JPanel {
	/**
	 * 
	 */

	
	SingleTicket selectedList = null; //selected visual ticket(list) 
	Ticket selectedTicket = null; //selected object ticket (from ticket bar)
	
	int selectedItemIndex;
	
	//List<List<Boolean>> taggedItems;

	TaggedItems taggedItems ;
	TicketBar tickets;
	ArrayList<SingleTicket> lists = new ArrayList <SingleTicket>(); //list of visual tickets(lists)
	
	int offset = 0;
	
	private static final long serialVersionUID = 1L;
	
	public Tickets(TicketBar tickets) {
		this.tickets =tickets;
		 //this.taggedItems = new ArrayList<>(this.tickets.getTickets().size());
		 //System.out.println(taggedItems);
		this.taggedItems= new TaggedItems(this.tickets.getTickets());
		this.setLayout(new GridLayout(2, 4, 0, 0));
		setUpLists(this);
		fillScreen();
		
		
		
	}
	//calls fillList function on every ticket slot as long as there are tickets
	private void fillScreen() {
		//fills lists
		
		for(int i = 0; i < 6 ; i++) {
			if(!(i+offset < tickets.getTickets().size())) continue;
			SingleTicket currentList = lists.get(i);
			Ticket currentTicket = tickets.getTicketAt(i+this.offset);
			
			fillList(currentList, currentTicket);
			currentList.setTaggedItems(this.taggedItems.getList(i+offset));
			currentList.updateTags();
		}	
	}
	public int getSelectedTicketIndex() {
		return lists.indexOf(selectedList);
	}
	private void fillList(SingleTicket list, Ticket ticket) {
	
		for(Item item : ticket.getItems()) {
			list.addItem(item.getName());
			
				for(String mod : item.getMods()) {
					String modItem = "<html> <pre>   " + mod +  "</pre></html>";
					list.addItem(modItem);
				}
		}
	}

	public Ticket getSelectedTicket() {
		//return selected ticket
		return selectedTicket;
		
	}
	public void incOffset() {
		if((tickets.getSize() <= 6 + offset)) return;
		this.offset++;
		update();
		
		
	}
	public void decOffset() {
		if(offset == 0) return;
		else offset--;
		update();
		
	}
	
	private void setSelectedList(SingleTicket list) {
		selectedList = list;
	}
	private void setSelectedItemIndex(int selectedIndex) {
		// 
		this.selectedItemIndex = selectedIndex;
		
	}
	public int getSelectedItemIndex() {
		return selectedItemIndex;
		
	}


	void update() {
		for(SingleTicket ticket : lists) {
			ticket.removeItems();
		}
		fillScreen();
		
	}
	

	private void setUpLists(JPanel panel) {
	
		
		for(int i = 0; i < 6 ; i++) {
			SingleTicket newList = new SingleTicket();
			newList.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					setSelectedList(newList);
					unselectOtherItems(selectedList);
					int selectedIndex = newList.getSelectedIndex();
					System.out.println(getSelectedTicketIndex());
					if(  selectedIndex == -1) return;
					setSelectedItemIndex(selectedIndex);
				
				}

				
				
			});
			newList.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2, true), null));
			panel.add(newList);
			this.lists.add(newList);
		}
}

		
		
	

private void unselectOtherItems(SingleTicket x) {
	for(SingleTicket list : lists) {
		if(x == list) continue;
		System.out.println(list.listModel);
		list.clearSelection();
	}
	
}



	
}
