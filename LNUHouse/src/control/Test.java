package control;

public class Test {
	public static void main(String[] args) throws Exception{	
		
		View view = new View();
		Control control = new Control(view);
		control.setAllPanels();
		view.setVisible(true);	
		
	} 
}

