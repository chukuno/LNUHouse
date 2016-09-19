package panels;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.Utilities;
import logic.Guest;

public class AddGuestPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton back;
	private JButton saveJB;
	private Utilities util;
	private ImageIcon background;
	//labels
	private JLabel guestInfoJL;
	private JLabel idInfoJL;
	private JLabel vehicleInfoJL;
	private JLabel rateInfoJL;
	private JLabel reservationNumJL;
	private JLabel lastNameJL;
	private JLabel firstNameJL;
	private JLabel addressJL;
	private JLabel countryJL;
	private JLabel companyJL;
	private JLabel idTypeJL;
	private JLabel idNumJL;
	private JLabel vehicleMakerJL;
	private JLabel vehicleModelJL;
	private JLabel plateNumJL;
	private JLabel roomNumJL;
	private JLabel dateInJL;
	private JLabel dateOutJL;
	private JLabel numOfDaysJL;
	private JLabel numOfAdultsJL;
	private JLabel numOfChildrenJL;

	
	private JTextField reservationNumTF;
	private JTextField lastNameTF;
	private JTextField firstNameTF;
	private JTextField addressTF;
	private JTextField countryTF;
	private JTextField companyTF;
	private JTextField idTypeTF;
	private JTextField idNumTF;
	private JTextField vehicleMakerTF;
	private JTextField vehicleModelTF;
	private JTextField plateNumTF;
	private JTextField roomNumTF;
	private JTextField dateInTF;
	private JTextField dateOutTF;
	private JTextField numOfDaysTF;
	private JTextField numOfAdultsTF;
	private JTextField numOfChildrenTF;
	private Guest[] guest;
	private TextFieldHandler tfHandler;
	private int guestCurrCount;
	public AddGuestPanel(){
		setLayout(null);
		setOpaque(false);
		setBounds(0,0,1000,700);
		setPreferredSize(new Dimension(1000, 700));
		util = new Utilities();
		guest = new Guest[10];
		for(int i =0; i <10;i++){
			guest[i] = new Guest();
		}
		tfHandler = new TextFieldHandler();
		addButtons();
		addLabels();
		addTextFields();
		addTextFieldListener(tfHandler);
		guestCurrCount = 0;
	}
	public void addLabels(){
		guestInfoJL = new JLabel();
		util.labelProperties(guestInfoJL, 30, 30, 500, 50, "Guest Information", this);
		idInfoJL = new JLabel();
		util.labelProperties(idInfoJL, 30, 320, 500, 50, "Identification Information", this);
		vehicleInfoJL = new JLabel();
		util.labelProperties(vehicleInfoJL, 30, 440, 500, 50, "Vehicle Information", this);
		rateInfoJL = new JLabel();
		util.labelProperties(rateInfoJL, 450, 30, 500, 50, "Rate Information", this);
		reservationNumJL = new JLabel();
		util.labelProperties(reservationNumJL, 80, 70, 500, 50, "Reservation Number: ", this);
		lastNameJL = new JLabel();
		util.labelProperties(lastNameJL, 80, 110, 500, 50, "Last Name: ", this);
		firstNameJL = new JLabel();
		util.labelProperties(firstNameJL, 80, 150, 500, 50, "First Name: ", this);
		addressJL = new JLabel();
		util.labelProperties(addressJL, 80, 190, 500, 50, "Address: ", this);
		countryJL = new JLabel();
		util.labelProperties(countryJL, 80, 230, 500, 50, "Country: ", this);
		companyJL = new JLabel();
		util.labelProperties(companyJL, 80, 270, 500, 50, "Company: " , this);
		idTypeJL = new JLabel();
		util.labelProperties(idTypeJL, 80, 360, 500, 50, "ID Type: " , this);
		idNumJL = new JLabel();
		util.labelProperties(idNumJL, 80, 400, 500, 50, "ID Number: " , this);
		vehicleMakerJL = new JLabel();
		util.labelProperties(vehicleMakerJL, 80, 480, 500, 50, "Vehicle Maker: " , this);
		vehicleModelJL = new JLabel();
		util.labelProperties(vehicleModelJL, 80, 520, 500, 50, "Vehicle Model: " , this);
		plateNumJL = new JLabel();
		util.labelProperties(plateNumJL, 80, 560, 500, 50, "Plate Number: " , this);
		roomNumJL = new JLabel();
		util.labelProperties(roomNumJL, 500, 70, 500, 50, "Room Number: " , this);
		dateInJL = new JLabel();
		util.labelProperties(dateInJL, 500, 110, 500, 50, "Date In: " , this);
		dateOutJL = new JLabel();
		util.labelProperties(dateOutJL, 500, 150, 500, 50, "Date Out: " , this);
		numOfDaysJL = new JLabel();
		util.labelProperties(numOfDaysJL, 500, 190, 500, 50, "Number of Days: " , this);
		numOfAdultsJL = new JLabel();
		util.labelProperties(numOfAdultsJL, 500, 230, 500, 50, "Number of Adults: " , this);
		numOfChildrenJL = new JLabel();
		util.labelProperties(numOfChildrenJL, 500, 270, 500, 50, "Number of Children: " , this);
		
	}
	public void addTextFields(){
		reservationNumTF = new JTextField();
		util.textFieldProperties(reservationNumTF, 230, 80, 180, 33, this);
		lastNameTF = new JTextField();
		util.textFieldProperties(lastNameTF, 230, 120, 180, 33, this);
		firstNameTF = new JTextField();
		util.textFieldProperties(firstNameTF, 230, 160, 180, 33, this);
		addressTF = new JTextField();
		util.textFieldProperties(addressTF, 230, 200, 180, 33, this);
		countryTF = new JTextField();
		util.textFieldProperties(countryTF, 230, 240, 180, 33, this);
		companyTF = new JTextField();
		util.textFieldProperties(companyTF, 230, 280, 180, 33, this);
		idTypeTF = new JTextField();
		util.textFieldProperties(idTypeTF, 230, 370, 180, 33, this);
		idNumTF = new JTextField();
		util.textFieldProperties(idNumTF, 230, 410, 180, 33, this);
		vehicleMakerTF = new JTextField();
		util.textFieldProperties(vehicleMakerTF, 230, 490, 180, 33, this);
		vehicleModelTF = new JTextField();
		util.textFieldProperties(vehicleModelTF, 230, 530, 180, 33, this);
		plateNumTF = new JTextField();
		util.textFieldProperties(plateNumTF, 230, 570, 180, 33, this);
		roomNumTF = new JTextField();
		util.textFieldProperties(roomNumTF, 650, 80, 180, 33, this);
		dateInTF = new JTextField();
		util.textFieldProperties(dateInTF, 650, 120, 180, 33, this);
		dateOutTF = new JTextField();
		util.textFieldProperties(dateOutTF, 650, 160, 180, 33, this);
		numOfDaysTF = new JTextField();
		util.textFieldProperties(numOfDaysTF, 650, 200, 180, 33, this);
		numOfAdultsTF = new JTextField();
		util.textFieldProperties(numOfAdultsTF, 650, 240, 180, 33, this);
		numOfChildrenTF = new JTextField();
		util.textFieldProperties(numOfChildrenTF, 650, 280, 180, 33, this);
		
	}
	public void addButtons(){
		back = new JButton("Back");
		saveJB = new JButton("Save!");
		util.buttonProperties(back, 30,620, 80, 50, this);
		util.buttonProperties(saveJB, 640, 590, 120, 70, this);
	}
	public void addListener(ActionListener listen){
		back.addActionListener(listen);
		saveJB.addActionListener(listen);
	}
	public void addTextFieldListener(ActionListener listen){
		reservationNumTF.addActionListener(listen);;
		lastNameTF.addActionListener(listen);
		firstNameTF.addActionListener(listen);
		addressTF.addActionListener(listen);
		countryTF.addActionListener(listen);
		companyTF.addActionListener(listen);
		idTypeTF.addActionListener(listen);
		idNumTF.addActionListener(listen);
		vehicleMakerTF.addActionListener(listen);
		vehicleModelTF.addActionListener(listen);
		plateNumTF.addActionListener(listen);
		roomNumTF.addActionListener(listen);
		dateInTF.addActionListener(listen);
		dateOutTF.addActionListener(listen);
		numOfDaysTF.addActionListener(listen);
		numOfAdultsTF.addActionListener(listen);
		numOfChildrenTF.addActionListener(listen);
	}
	
	public JButton getBack(){
		return back;
	}
	public JButton getSave(){
		return saveJB;
	}
	
	private class TextFieldHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//1 -if bawal it letters 2- if bawal it numbers
			if(e.getSource() == reservationNumTF){
				errorTrapTF(reservationNumTF,1);
				String temp = reservationNumTF.getText();
				guest[guestCurrCount].setReservationNo(temp);
			}else if(e.getSource() == lastNameTF){
				errorTrapTF(lastNameTF,3);
				String temp = lastNameTF.getText();
				guest[guestCurrCount].setLastName(temp);
			}else if(e.getSource() == firstNameTF){
				errorTrapTF(firstNameTF,2);
				guest[guestCurrCount].setFirstName(firstNameTF.getText());
			}else if(e.getSource() == addressTF){
				errorTrapTF(addressTF,3);
				String temp = addressTF.getText();
				guest[guestCurrCount].setAddress(temp);

			}else if(e.getSource() == countryTF){
				errorTrapTF(countryTF,2);
				String temp = countryTF.getText();
				guest[guestCurrCount].setCountry(temp);
			}else if(e.getSource() == companyTF){
				errorTrapTF(companyTF,3);
				String temp = companyTF.getText();
				guest[guestCurrCount].setCompany(temp);
			}else if(e.getSource() == idTypeTF){
				errorTrapTF(idTypeTF,2);
				String temp = idTypeTF.getText();
				guest[guestCurrCount].setIdType(temp);
			}else if(e.getSource() == idNumTF){
				errorTrapTF(idNumTF,1);
				String temp = idNumTF.getText();
				guest[guestCurrCount].setIdNum(temp);
			}else if(e.getSource() == vehicleMakerTF){
				errorTrapTF(vehicleMakerTF,2);
				String temp = vehicleMakerTF.getText();
				guest[guestCurrCount].setVehicleMaker(temp);
			}else if(e.getSource() == vehicleModelTF){
				errorTrapTF(vehicleModelTF,3);
				String temp = vehicleModelTF.getText();
				guest[guestCurrCount].setVehicleModel(temp);
			}else if(e.getSource() == plateNumTF){
				errorTrapTF(plateNumTF,3);
				String temp = plateNumTF.getText();
				guest[guestCurrCount].setPlateNum(temp);
			}else if(e.getSource() == roomNumTF){
				errorTrapTF(roomNumTF,1);
				String temp = roomNumTF.getText();
				guest[guestCurrCount].setRoomNum(temp);
			}else if(e.getSource() == dateInTF){
				errorTrapTF(dateInTF,3);
				String temp = dateInTF.getText();
				guest[guestCurrCount].setDateIn(temp);
			}else if(e.getSource() == dateOutTF){
				errorTrapTF(dateOutTF,3);
				String temp =dateOutTF.getText();
				guest[guestCurrCount].setDateOut(temp);
			}else if(e.getSource() == numOfDaysTF){
				errorTrapTF(numOfDaysTF,1);
				String temp =numOfDaysTF.getText();
				guest[guestCurrCount].setNumOfDays(temp);
			}else if(e.getSource() == numOfAdultsTF){
				errorTrapTF(numOfAdultsTF,1);
				String temp = numOfAdultsTF.getText();
				guest[guestCurrCount].setNumOfAdults(temp);
			}else if(e.getSource() == numOfChildrenTF){
				errorTrapTF(numOfChildrenTF,1);
				String temp =numOfChildrenTF.getText();
				guest[guestCurrCount].setNumOfChildren(temp);
			}
		}
	}
	public void errorTrapTF(JTextField field, int type){
		boolean done = false;
		if(type == 1){
			String expression = field.getText();
			char[] array = new char[100];
			array = expression.toCharArray();
			for(int i =0; i< array.length ;i++){
				if( (array[i] >= 'a') && (array[i] <= 'z') || ( (array[i] >= 'A') && (array[i] <= 'Z'))){
					JOptionPane.showMessageDialog(this, "You can't write or mix letters in input field.");
					done = false;
					break;
				}
				else{
					done = true;
				}
			}
			if(!done){
				expression = null;
				field.setText(null);
				field.setEditable(true);		
			}else{
				field.setEditable(false);
				done = false;
				field.requestFocus();
			}
		}else if(type == 2){
			String expression = field.getText();
			char[] array = new char[100];
			array = expression.toCharArray();
			for(int i =0; i< array.length ;i++){
				if(  ( (array[i] >= '0') && (array[i] <= '9'))){
					JOptionPane.showMessageDialog(this, "You can't write or mix numbers in input field.");
					done = false;
					break;
				}
				else{
					done = true;
				}
			}
			if(!done){
				expression = null;
				field.setText(null);
				field.setEditable(true);		
			}else{
				field.setEditable(false);
				done = false;
				field.requestFocus();
			}
		}else{
			done = false;
			field.setEditable(false);
			field.requestFocus();
		}
	}
	public void setTFToNull(){
		reservationNumTF.setText(null);
		lastNameTF.setText(null);
		firstNameTF.setText(null);
		addressTF.setText(null);
		countryTF.setText(null);
		companyTF.setText(null);
		idTypeTF.setText(null);
		idNumTF.setText(null);
		vehicleMakerTF.setText(null);
		vehicleModelTF.setText(null);
		plateNumTF.setText(null);
		roomNumTF.setText(null);
		dateInTF.setText(null);
		dateOutTF.setText(null);
		numOfDaysTF.setText(null);
		numOfAdultsTF.setText(null);
		numOfChildrenTF.setText(null);
	}
	public void setTFEditable(){
		reservationNumTF.setEditable(true);
		lastNameTF.setEditable(true);
		firstNameTF.setEditable(true);
		addressTF.setEditable(true);
		countryTF.setEditable(true);
		companyTF.setEditable(true);
		idTypeTF.setEditable(true);
		idNumTF.setEditable(true);
		vehicleMakerTF.setEditable(true);
		vehicleModelTF.setEditable(true);
		plateNumTF.setEditable(true);
		roomNumTF.setEditable(true);
		dateInTF.setEditable(true);
		dateOutTF.setEditable(true);
		numOfDaysTF.setEditable(true);
		numOfAdultsTF.setEditable(true);
		numOfChildrenTF.setEditable(true);
	}
	public void setGuestCurrCount(int i){
		guestCurrCount = i;
	}
	public int getGuestCurrCount(){
		return guestCurrCount;
	}
	public void setGuestArr(Guest[] arr){
		guest = arr;
	}
	public Guest[] getGuestArr(){
		return guest;
	}
	public void paintComponent(Graphics g){
		background = new ImageIcon(getClass().getResource("/love.jpg"));
		background.paintIcon(this,g,0,0);
	}
	
		
}
