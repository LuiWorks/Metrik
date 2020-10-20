
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends Frame implements WindowListener {
	
	public MainWindow() {
		setTitle("Programm für Aufgabe 1 in Softwaretechnik Verison 1.0.1");
		setSize(700, 700); 
		addWindowListener(this);
		add(new Drawing()); 

	}
	
	public void openWindow() {
		setVisible(true);
	}

	
	
	
	
	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
		
	}

}