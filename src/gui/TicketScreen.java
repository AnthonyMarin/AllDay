package gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import ticketSystem.TicketBar;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class TicketScreen extends JFrame {


	TicketBar ticketBar;
	public TicketScreen(TicketBar tBar) {
		ticketBar = tBar;
		setBackground(new Color(211, 211, 211));
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		setSize(1000,1000);
		setUpFrame();
		this.setVisible(true);
	}


	private void setUpFrame() {
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.8);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(splitPane);
		
		Tickets tickets = new Tickets( this.ticketBar);
		splitPane.setLeftComponent(tickets);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		//
		JButton bumpButton = new JButton("Bump");
		bumpButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(ticketBar.getSize() == 0) return;
				int selectedIndex = tickets.getSelectedTicketIndex();
				System.out.println(selectedIndex);
				ticketBar.deleteTicketAt(selectedIndex);
				//ticketBar.deleteTicket(ticketBar.getTicketAt(selectedIndex)); // this will delete multiple tickets if duplicates exist // use deleteAtIndex
				tickets.removeTaggedItems(selectedIndex);
				System.out.println(tickets.taggedItems);
				tickets.update();
				

			
				
			}
		});
		panel.setLayout(new GridLayout(0, 7, 0, 0));
		panel.add(bumpButton);
		
		JButton btnNewButton_2 = new JButton("Tag");
		panel.add(btnNewButton_2);
		
		JButton left_Button = new JButton("Left");
		left_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				tickets.decOffset();				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Rush Order");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Rush Item");
		panel.add(btnNewButton);
		JButton home_Button = new JButton("Home");
		panel.add(home_Button);
		panel.add(left_Button);
		
		JButton right_Button = new JButton("Right");
		right_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				tickets.incOffset();
			}
		});
		panel.add(right_Button);
		
		this.setVisible(true);
	
		
	}
}

