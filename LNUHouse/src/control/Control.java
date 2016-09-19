package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import logic.Guest;
import panels.AddGuestPanel;
import panels.MenuMe;
import panels.ViewGuestPanel;
import panels.ViewProfilePanel;



public class Control {
	private View view;
	private MenuMe menuMe;
	private AddGuestPanel addGuestPanel;
	private ViewGuestPanel viewGuestPanel;
	private ViewProfilePanel viewPanelProfile;

	private Guest[] guest;
	private int guestCount;
	public Control(View view){	
		this.view = view;
		guest = new Guest[10];
		for(int i =0;i<10;i++){
			guest[i] = new Guest();
		}
		guestCount = 0;
	}
	//firstcall this
	public void setAllPanels(){
		//unite panels here with view panels
		setPanelsToView();
		//initialize button listener for all panels
		initPanelsButtons();
	}
	public void setPanelsToView(){
		this.menuMe = view.getMenuMe();
		this.addGuestPanel = view.getAddGuestPanel();
		this.viewGuestPanel = view.getViewGuestPanel();
		this.viewPanelProfile = view.getViewProfilePanel();
	}
	public void initPanelsButtons(){
		this.menuMe.addListener(new ButtonListener());
		this.addGuestPanel.addListener(new ButtonListener());
		this.viewGuestPanel.addListener(new ButtonListener());
		this.viewPanelProfile.addListener(new ButtonListener());
	}
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			try{
				if(event.getSource() == menuMe.getAddGuestJB()){
					JOptionPane.showMessageDialog(null, "Reminder: Only 10 rooms can be occupied.");
					view.getAddGuestPanel().setGuestCurrCount(guestCount);
					view.getAddGuestPanel().setGuestArr(guest);
					view.getAddGuestPanel().setTFToNull();
					view.getAddGuestPanel().setTFEditable();
					JOptionPane.showMessageDialog(view.getAddGuestPanel(), "Press Enter after every input to finalize it.");
					view.Switch("AddGuestPanel");		
				}else if(event.getSource() == menuMe.getViewGuestJB()){
					view.getViewGuestPanel().setGuests(guest);
					view.getViewGuestPanel().setGuestNames();
					view.getViewGuestPanel().setDateIn();
					view.getViewGuestPanel().setDateOut();
					view.Switch("ViewGuestPanel");
				}else if(event.getSource() == addGuestPanel.getBack()){
					JOptionPane.showMessageDialog(addGuestPanel, "Input data here will be lost.", "Unsaved Input Data", 3 );
					guest = view.getAddGuestPanel().getGuestArr();
					view.getAddGuestPanel().setTFToNull();
					view.Switch("MenuPanel");
				}else if(event.getSource() == addGuestPanel.getSave()){
					guestCount = view.getAddGuestPanel().getGuestCurrCount() + 1;
					guest = view.getAddGuestPanel().getGuestArr();
					JOptionPane.showMessageDialog(addGuestPanel, "New guest added.", "Saved Guest Info", 2);
					view.Switch("MenuPanel");
				}else if(event.getSource() == viewGuestPanel.getBack()){
					view.Switch("MenuPanel");
				}else if(event.getSource() == viewGuestPanel.getProf0()){
					view.getViewProfilePanel().setFromGuest(guest[0]);
					view.getViewProfilePanel().setUnEditableAllTF();
					view.Switch("ViewProfilePanel");
				}else if(event.getSource() == viewGuestPanel.getProf1()){
					view.getViewProfilePanel().setFromGuest(guest[1]);
					view.getViewProfilePanel().setUnEditableAllTF();
					view.Switch("ViewProfilePanel");
				}else if(event.getSource() == viewGuestPanel.getProf2()){
					view.getViewProfilePanel().setFromGuest(guest[2]);
					view.getViewProfilePanel().setUnEditableAllTF();
					view.Switch("ViewProfilePanel");
				}else if(event.getSource() == viewGuestPanel.getProf3()){
					view.getViewProfilePanel().setFromGuest(guest[3]);
					view.getViewProfilePanel().setUnEditableAllTF();
					view.Switch("ViewProfilePanel");
				}else if(event.getSource() == viewGuestPanel.getProf4()){
					view.getViewProfilePanel().setFromGuest(guest[4]);
					view.getViewProfilePanel().setUnEditableAllTF();
					view.Switch("ViewProfilePanel");
				}else if(event.getSource() == viewGuestPanel.getProf5()){
					view.getViewProfilePanel().setFromGuest(guest[5]);
					view.getViewProfilePanel().setUnEditableAllTF();
					view.Switch("ViewProfilePanel");
				}else if(event.getSource() == viewGuestPanel.getProf6()){
					view.getViewProfilePanel().setFromGuest(guest[6]);
					view.getViewProfilePanel().setUnEditableAllTF();
					view.Switch("ViewProfilePanel");
				}else if(event.getSource() == viewGuestPanel.getProf7()){
					view.getViewProfilePanel().setFromGuest(guest[7]);
					view.getViewProfilePanel().setUnEditableAllTF();
					view.Switch("ViewProfilePanel");
				}else if(event.getSource() == viewGuestPanel.getProf8()){
					view.getViewProfilePanel().setFromGuest(guest[8]);
					view.getViewProfilePanel().setUnEditableAllTF();
					view.Switch("ViewProfilePanel");
				}else if(event.getSource() == viewGuestPanel.getProf9()){
					view.getViewProfilePanel().setFromGuest(guest[9]);
					view.getViewProfilePanel().setUnEditableAllTF();
					view.Switch("ViewProfilePanel");
				}else if(event.getSource() == viewPanelProfile.getBack()){
					view.Switch("ViewGuestPanel");
				}
				

			}catch(Exception e){
				e.printStackTrace();
				JOptionPane.showMessageDialog(menuMe, "Sorry something went wrong.");
			}
		}	
	}
}
