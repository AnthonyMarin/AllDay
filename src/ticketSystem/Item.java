package ticketSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class Item {
	String name;
	int id;
	List<String> mods = new ArrayList<String>();
	//get/set name
	public String getName() {
		return name;
	}
	public void setName(String str) {
		name = str;
	}
	//get/set id
	public int getId() {
		return id;
	}
	public void setId(int n) {
		id = n;
	}
	public void printItem() {
	
		System.out.println("\t"+name);
		
		for(String mod : mods){
			System.out.println("\t\t" + mod);
		}
	}
	public boolean modsExist() {
		if(mods.size() == 0) return false;
		return true;
	}
	public List<String> getMods() {
		return mods;
	}
	public void addMod(String str) {
		mods.add(str);
	}
	public void removeMod(String str) {
		mods.remove(str);
	}

}
