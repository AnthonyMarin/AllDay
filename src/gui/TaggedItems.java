package gui;

import java.util.ArrayList;

import ticketSystem.Ticket;

public class TaggedItems extends ArrayList<ArrayList<Boolean>> {


	
	TaggedItems(ArrayList<Ticket> arrayList){
		
		initTaggedItems(arrayList);
		
		
		System.out.println(this.get(0).set(1, true));
		
	
		System.out.println(this);
		
	}

	private void initTaggedItems(ArrayList<Ticket> arrayList) {
		for(Ticket ticket : arrayList) {
			ArrayList<Boolean> boolList = new ArrayList<>();
			for(int i = 0 ; i < ticket.numItems();i++) {
				boolList.add(false);
				for(int j = 0; j < ticket.getItems().get(i).numMods(); j++){
					boolList.add(false);
				}
			}
			this.add(boolList);
		}
		
	}
	public void removeItemAt(int i) {
		this.remove(i);
	}
	public void addItem(Ticket ticket) {
		ArrayList<Boolean> boolList = new ArrayList<>();
		for(int i = 0 ; i < ticket.numItems();i++) {
			boolList.add(false);
		}
		this.add(boolList);
	}
	public boolean isTagged(int indexTicket , int indexItem) {
	 return this.get(indexTicket).get(indexItem);
		
	}
	public void tagItem(int indexTicket , int indexItem) {
		this.get(indexTicket).set(indexItem, true) ;

	}
	public TaggedItems getAll() {
		return this;
		
	}
	public ArrayList<Boolean> getList(int x) {
		return this.get(x);
	}
}
