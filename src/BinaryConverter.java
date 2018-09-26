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
	
JFrame jf = new JFrame();
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel jp = new JPanel();
	jf.add(jp);
	//JLabel jl = new JLabel();
	//jl.setText("meh");
	//jf.add(jl);
	//jf.pack();
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
}

