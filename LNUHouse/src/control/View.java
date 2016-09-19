package control;
import java.awt.*;

import javax.swing.*;

import panels.AddGuestPanel;
import panels.MenuMe;
import panels.ViewGuestPanel;
import panels.ViewProfilePanel;



public class View extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private CardLayout layout;
	private JPanel panel;
	private AddGuestPanel addGuestPanel;
	private ViewGuestPanel viewGuestPanel;
	private MenuMe menuMe;
	private ViewProfilePanel viewProfilePanel;
	public View(){
		
		super("LNU House");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		initializePanels();
		
		panelProperties(menuMe);
		layout = new CardLayout();
		panel = new JPanel();
		panel.setBounds(0,0,1000,700);
		panel.setLayout(layout);
		addToMainPanel();
		add(panel);
		setVisible(true);
	}
	public void initializePanels(){
		menuMe = new MenuMe();
		addGuestPanel = new AddGuestPanel();
		viewGuestPanel = new ViewGuestPanel();
		viewProfilePanel = new ViewProfilePanel();
	}
	public void addToMainPanel(){
		panel.add(menuMe, "MenuPanel");
		panel.add(addGuestPanel, "AddGuestPanel");
		panel.add(viewGuestPanel, "ViewGuestPanel");
		panel.add(viewProfilePanel, "ViewProfilePanel");
	}
	public void panelProperties(JPanel panelMe){
		panelMe.setBounds(0,0,1000,700);
		panelMe.setFocusable(false);
	}
	public void Switch(String str){
		layout.show(panel, str);
	}
	
	public MenuMe getMenuMe(){	return menuMe; }
	public AddGuestPanel getAddGuestPanel() { return addGuestPanel; }
	public ViewGuestPanel getViewGuestPanel() { return viewGuestPanel;}
	public ViewProfilePanel getViewProfilePanel(){ return viewProfilePanel;}
	
}

