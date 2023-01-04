package gui;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import ticketSystem.Item;

public class SingleTicket extends JList {
	
	DefaultListModel<String> listModel = new DefaultListModel<>();
	
	public SingleTicket() {
		this.setModel(listModel);
	}
	public void addItem(String string) {
		this.listModel.addElement(string);
	}

	public void removeItems() {
		listModel.removeAllElements();
	}
}
