package panels;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.Utilities;
import logic.Guest;

public class ViewGuestPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton back;
	private Utilities util;
	private JLabel roomJL;
	private JLabel guestNameJL;
	private JLabel dateInJL;
	private JLabel dateOutJL;
	private JLabel[] roomNoJL;
	private JTextField[] guestNoTF;
	private JTextField[] dateInTF;
	private JTextField[] dateOutTF;
	private JButton[] profileJB;
	private ImageIcon background;
	private int xJL;
	private int yJL;
	private int xGuestNoTF;
	private int yGuestNoTF;
	private int xProfileJB;
	private int yProfileJB;
	private int xDateInTF;
	private int yDateInTF;
	private int xDateOutTF;
	private int yDateOutTF;
	private Guest[] guestArr;
	private int guestCount;
	public ViewGuestPanel(){
		setLayout(null);
		setOpaque(false);
		setBounds(0,0,1000,700);
		setPreferredSize(new Dimension(1000, 700));
		util = new Utilities();
		back = new JButton("Back");
		util.buttonProperties(back, 30, 590, 80, 50, this);
		roomNoJL = new JLabel[10];
		guestNoTF = new JTextField[10];
		profileJB = new JButton[10];
		dateInTF = new JTextField[10];
		dateOutTF = new JTextField[10];
	
		guestArr = new Guest[10];
		xJL = 40;
		yJL = 10;
		xGuestNoTF = xJL+ 80;
		yGuestNoTF = yJL+17;
		xProfileJB = xJL +230;
		yProfileJB = yJL+8;
		xDateInTF = xGuestNoTF + 350;
		yDateInTF = yGuestNoTF;
		xDateOutTF = xDateInTF+ 180;
		yDateOutTF = yDateInTF;
		addLabels();
		addTextFields();
		addButtons();
	}
	public void addLabels(){
		roomJL = new JLabel();
		util.labelProperties(roomJL, 10, 20, 150, 50, "Room No.", this);
		guestNameJL = new JLabel();
		util.labelProperties(guestNameJL, 150, 20, 150, 50, "Guest Names ", this);
		dateInJL = new JLabel();
		util.labelProperties(dateInJL, 480, 20, 150, 50, "Date Checked In", this);
		dateOutJL = new JLabel();
		util.labelProperties(dateOutJL, 650, 20, 150, 50, "Date Checked Out", this);
		for(int i =0; i < 10; i++){
			roomNoJL[i] = new JLabel();
			int temp = i+1;
			util.labelProperties(roomNoJL[i], xJL, yJL+=40, 50, 50, ""+temp, this);
		}
	}
	public void addTextFields(){
		
		for(int i = 0; i < 10;i++){
			guestNoTF[i] = new JTextField();
			util.textFieldProperties(guestNoTF[i], xGuestNoTF, yGuestNoTF+= 40, 200, 25, this);
			dateInTF[i] = new JTextField();
			util.textFieldProperties(dateInTF[i], xDateInTF, yDateInTF+= 40, 150, 25, this);
			dateOutTF[i] = new JTextField();
			util.textFieldProperties(dateOutTF[i], xDateOutTF, yDateOutTF+= 40, 150, 25, this);
		}

	}
	public void addButtons(){
		for(int i =0; i <10; i++){
			profileJB[i] = new JButton("View Profile");
			util.buttonProperties(profileJB[i], xProfileJB+80, yProfileJB +=41, 100, 30, this);

		}
	}
	public void addListener(ActionListener listen){
		back.addActionListener(listen);
		for(int i =0; i < 10;i++){
			profileJB[i].addActionListener(listen);
		}
	}
	public void setGuestNames(){
		for(int i =0 ; i < 10;i++){
			if(guestArr[i].getFirstName() == null && guestArr[i].getLastName() == null){
				guestNoTF[i].setText("No occupant.");
			}else{
				guestNoTF[i].setText(guestArr[i].getFirstName() + " " + guestArr[i].getLastName());
			}
			
		}
	}
	public void setDateIn(){
		for(int i =0 ; i < 10;i++){
			if(guestArr[i].getDateIn() == null){
				dateInTF[i].setText("No entry.");
			}else{
				dateInTF[i].setText(guestArr[i].getDateIn());
			}
			
		}
	}
	public void setDateOut(){
		for(int i =0 ; i < 10;i++){
			if(guestArr[i].getDateOut() == null){
				dateOutTF[i].setText("No entry.");
			}else{
				dateOutTF[i].setText(guestArr[i].getDateOut());
			}
			
		}
	}
	public void setGuests(Guest[] guestMe){
		this.guestArr = guestMe;
	}
	public void setGuestCount(int i){
		guestCount = i;
	}
	public int getGuestCount(){
		return guestCount;
	}
	public Guest[] getGuestsArr(){
		return guestArr;
	}
	public JButton getBack(){
		return back;
	}
	public JButton getProf0(){
		return profileJB[0];
	}
	public JButton getProf1(){
		return profileJB[1];
	}
	public JButton getProf2(){
		return profileJB[2];
	}
	public JButton getProf3(){
		return profileJB[3];
	}
	public JButton getProf4(){
		return profileJB[4];
	}
	public JButton getProf5(){
		return profileJB[5];
	}
	public JButton getProf6(){
		return profileJB[6];
	}
	public JButton getProf7(){
		return profileJB[7];
	}
	public JButton getProf8(){
		return profileJB[8];
	}
	public JButton getProf9(){
		return profileJB[9];
	}
	public JButton[] getProfileJB(){
		return profileJB;
	}
	public void paintComponent(Graphics g){
		background = new ImageIcon(getClass().getResource("/love.jpg"));
		background.paintIcon(this,g,0,0);
	}
	
}
