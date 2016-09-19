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


public class ViewProfilePanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton back;
	private Utilities util;
	private ImageIcon background;
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
	public ViewProfilePanel(){
		setLayout(null);
		setOpaque(false);
		setBounds(0,0,1000,700);
		setPreferredSize(new Dimension(1000, 700));
		util = new Utilities();
		addButtons();
		addLabels();
		addTextFields();
	}
	/*Adds Labels*/
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
	/*Adds the textfields*/
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
		util.buttonProperties(back, 30,620, 80, 50, this);
	}
	public void addListener(ActionListener listen){
		back.addActionListener(listen);
	}
	
	public JButton getBack(){
		return back;
	}
	
	public void setFromGuest(Guest guestKo){
		reservationNumTF.setText(guestKo.getReservationNo()+ "");
		lastNameTF.setText(guestKo.getLastName()+ "");
		firstNameTF.setText(guestKo.getFirstName()+ "");
		addressTF.setText(guestKo.getAddress()+ "");
		countryTF.setText(guestKo.getCountry()+ "");
		companyTF.setText(guestKo.getCompany()+ "");
		idTypeTF.setText(guestKo.getIdType()+ "");
		idNumTF.setText(guestKo.getIdNum()+ "");
		vehicleMakerTF.setText(guestKo.getVehicleMaker()+ "");
		vehicleModelTF.setText(guestKo.getVehicleModel()+ "");
		plateNumTF.setText(guestKo.getPlateNum()+ "");
		roomNumTF.setText(guestKo.getRoomNum()+ "");
		dateInTF.setText(guestKo.getDateIn()+ "");
		dateOutTF.setText(guestKo.getDateOut()+ "");
		numOfDaysTF.setText(guestKo.getNumOfDays()+ "");
		numOfAdultsTF.setText(guestKo.getNumOfAdults()+ "");
		numOfChildrenTF.setText(guestKo.getNumOfChildren()+ "");
	}
	public void setUnEditableAllTF(){
		reservationNumTF.setEditable(false);
		lastNameTF.setEditable(false);
		firstNameTF.setEditable(false);
		addressTF.setEditable(false);
		countryTF.setEditable(false);
		companyTF.setEditable(false);
		idTypeTF.setEditable(false);
		idNumTF.setEditable(false);
		vehicleMakerTF.setEditable(false);
		vehicleModelTF.setEditable(false);
		plateNumTF.setEditable(false);
		roomNumTF.setEditable(false);
		dateInTF.setEditable(false);
		dateOutTF.setEditable(false);
		numOfDaysTF.setEditable(false);
		numOfAdultsTF.setEditable(false);
		numOfChildrenTF.setEditable(false);
	}
	public void paintComponent(Graphics g){
		background = new ImageIcon(getClass().getResource("/love.jpg"));
		background.paintIcon(this,g,0,0);
	}
	

}
