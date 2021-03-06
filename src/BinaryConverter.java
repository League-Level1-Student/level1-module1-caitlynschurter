import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;

import javax.swing.*;

public class BinaryConverter implements MouseListener {
JTextField inputText = null;
JLabel answerLabel = null;

public static void main(String[] args) throws Exception {
	new BinaryConverter().getGoing();
}


	private void getGoing() throws MalformedURLException{
	
JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,200);
	
	JPanel panel = new JPanel();
	frame.add(panel);
	
	inputText = new JTextField(20);
	panel.add(inputText);
	
	JButton button = new JButton();
	button.setText("Convert");
	button.setSize(150,30);
	button.addMouseListener(this);
	panel.add(button);
	
	answerLabel = new JLabel();
	panel.add(answerLabel);
	
	frame.pack();
	
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("mouse clicked");
		String input = inputText.getText();
		String result = convert(input);
		answerLabel.setText(result);
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	String convert(String input) {
          if(input.length() != 8){
               JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
               return "-";
          }
          String binary = "[0-1]+";    //must contain numbers in the given range
          if (!input.matches(binary)) {
               JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
               return "-";
          }
          try {
               int asciiValue = Integer.parseInt(input, 2);
               char theLetter = (char) asciiValue;
               return "" + theLetter;
          } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
               return "-";
          }
     }
}

