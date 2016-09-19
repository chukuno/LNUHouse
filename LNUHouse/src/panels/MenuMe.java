package panels;
/*This is for the MENU BUTTONS.*/
import java.awt.*;

import javax.swing.*;

import control.Utilities;

import java.awt.event.ActionListener;


public class MenuMe extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ImageIcon background;
	private JButton addGuestJB;
	private JButton viewGuestJB;
	@SuppressWarnings("unused")
	private ImageIcon titleImage;
	private JLabel lnuHouse;
	private Utilities util;
	public MenuMe(){
		setLayout(null);
		setOpaque(false);
		setBounds(0,0,1000,700);
		setPreferredSize(new Dimension(1000, 700));
		util = new Utilities();
		addGuestJB = new JButton( "Add Guest");
		viewGuestJB = new JButton("Manage Guests");
		
		lnuHouse = new JLabel();
		util.buttonProperties(addGuestJB, 410, 260, 150, 70, this);
		util.buttonProperties(viewGuestJB, 410, 380,150, 70, this);
		util.labelProperties(lnuHouse, 450, 150, 200, 100, "LNU HOUSE", this);
		lnuHouse.setForeground(Color.WHITE);
		lnuHouse.setBackground(Color.black);
				
	}
	public void paintComponent(Graphics g){
		background = new ImageIcon(getClass().getResource("/love.jpg"));
		background.paintIcon(this,g,0,0);
	}
	public void addListener(ActionListener listen){
		addGuestJB.addActionListener(listen);
		viewGuestJB.addActionListener(listen);
	}
	public JButton getAddGuestJB(){ return addGuestJB; }
	public JButton getViewGuestJB(){ return viewGuestJB; }
	
}
