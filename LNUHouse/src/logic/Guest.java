package logic;

public class Guest {
	//guestInfo
	private String reservationNo;
	private String lastName;
	private String firstName;
	private String address;
	private String country;
	private String company;
	//id info
	private String idType;
	private String idNum;
	//vehicle info
	private String vehicleMaker;
	private String vehicleModel;
	private String plateNum;
	//rate info
	private String roomNum;
	private String dateIn;
	private String dateOut;
	private String numOfDays;
	private String numOfAdults;
	private String numOfChildren;
	private String notes;
	public Guest(){
		
	}
	//set elements
	public void setReservationNo(String num){	reservationNo = num;}
	public void setLastName(String str){	lastName = str;}
	public void setFirstName(String str){	firstName = str;}
	public void setAddress(String str){ address = str; }
	public void setCountry(String str){ country = str; }
	public void setCompany(String str){company = str;}
	public void setIdType(String str){ idType = str;}
	public void setIdNum(String str){ idNum = str;}
	public void setVehicleMaker(String str){ vehicleMaker = str;}
	public void setVehicleModel(String str){ vehicleModel = str;}
	public void setPlateNum(String str){ plateNum = str;}
	public void setRoomNum(String str){ roomNum = str;}
	public void setDateIn(String str){ dateIn = str;}
	public void setDateOut(String str){ dateOut = str;}
	public void setNumOfDays(String days){ numOfDays = days;}
	public void setNumOfAdults(String person){ numOfAdults = person;}
	public void setNumOfChildren(String person){ numOfChildren = person;}
	public void setNotes(String str){ notes = str;}
	//get elements
	public String getReservationNo(){ return reservationNo;}
	public String getLastName(){return lastName;}
	public String getFirstName(){return firstName;}
	public String getAddress(){return address;}
	public String getCountry(){return country;}
	public String getCompany(){return company;}
	public String getIdType(){return idType;}
	public String getIdNum(){return idNum;}
	public String getVehicleMaker(){return vehicleMaker;}
	public String getVehicleModel(){return vehicleModel;}
	public String getPlateNum(){return plateNum;}
	public String getRoomNum(){return roomNum;}
	public String getDateIn(){return dateIn;}
	public String getDateOut(){return dateOut;}
	public String getNumOfDays(){return numOfDays;}
	public String getNumOfAdults(){return numOfAdults;}
	public String getNumOfChildren(){return numOfChildren;}
	public String getNotes(){return notes;}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
