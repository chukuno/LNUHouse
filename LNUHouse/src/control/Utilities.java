package control;

import java.awt.Color;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Utilities {
	public void textAreaProperties( JTextArea area, int x, int y, int width, int height, JPanel panel){
		area.setBounds(x,y, width, height);
		area.setBackground(Color.WHITE);
		area.setForeground(Color.BLACK);
		area.setText(null);	
		area.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(area);
		scrollPane.setBounds(x, y, width, height);
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 50.0;
	    panel.add(scrollPane, c);
  }
	public void textFieldProperties(JTextField textField, int x, int y, int width, int height, JPanel panel){
		textField.setBounds(x, y, width, height);
		textField.setBackground(Color.WHITE);
		textField.setForeground(Color.BLACK);
		textField.setText(null);
		panel.add(textField);
	}
	public void buttonProperties(JButton button, int x, int y, int width, int height, JPanel panel){
		button.setBorder(null);
		button.setOpaque(false);
		button.setContentAreaFilled(true);
		button.setBorderPainted(false);//false dati
		button.setBounds(x, y, width, height);
		button.setFocusable(false);
		panel.add(button);
	}
	public void labelProperties(JLabel label, int x, int y, int width, int height, String text, JPanel panel){
		label.setForeground(Color.BLACK);
		label.setBounds(x, y, width, height);	
		if(label.getText() != null){
			label.setText(null);
			label.setText(text);
		}else{
			label.setText(text);
		}
		panel.add(label);
	}
	
}
