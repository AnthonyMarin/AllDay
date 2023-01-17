package gui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import ticketSystem.Item;
import ticketSystem.Ticket;

import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;

public class SingleTicket extends JList {
	
	DefaultListModel<String> listModel = new DefaultListModel<>();
	boolean selected = false;
	
	ArrayList<Boolean> taggedItems = new ArrayList<>();
	public SingleTicket() {
		setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2, true), null));

		this.setModel(listModel);	
	}
	public boolean isEmpty() {
		return listModel.isEmpty();
	}
	public boolean isSelected() {
		return selected;
	}
	public void toggleSeleted() {
		this.selected = !this.selected;		
		if(selected) {
			setBorder(new CompoundBorder(new LineBorder( new Color(255, 128, 255), 2, true), null));
			return;
		}
		setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2, true), null));
		
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
			//visually tag item
			
		}
		
	}
}
