package gui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import ticketSystem.Item;
import ticketSystem.Ticket;

public class SingleTicket extends JList {
	
	DefaultListModel<String> listModel = new DefaultListModel<>();
	
	ArrayList<Boolean> taggedItems = new ArrayList<>();
	public SingleTicket() {
		this.setModel(listModel);
		
		
	
	}
	public void setTaggedItems(ArrayList<Boolean> list) {
		this.taggedItems = list;
		
	}
	
	public void addItem(String string) {
		this.listModel.addElement(string);
	}

	public void removeItems() {
		listModel.removeAllElements();
		
	}
	public void updateTags() {
		for(int i = 0; i < listModel.size();i++) {
			if(taggedItems.get(i) == false) continue;
			this.setBackground("blue");
		}
		
	}
}
