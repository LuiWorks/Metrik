import java.awt.*;
import java.awt.event.*;

public class MainMenuBar extends MenuBar implements ActionListener {
		
	private Menu _menu; 
	
	public MainMenuBar() {
		_menu = new Menu("Hintergrundfarbe"); 
		
		MenuItem schwarz = new MenuItem("Schwarz"); 
		schwarz.addActionListener(this);
		_menu.add(schwarz); 
		MenuItem weis = new MenuItem("Weis"); 
		weis.addActionListener(this);
		_menu.add(weis); 
		MenuItem grau = new MenuItem("Grau"); 
		grau.addActionListener(this);
		_menu.add(grau); 
		
		add(_menu); 
		
		
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand() == "Schwarz") {
			MainWindow.isSetColor.setBackgroundColor(Color.black); 

		}
		
		
		if (e.getActionCommand() == "Weis" ) {
			MainWindow.isSetColor.setBackgroundColor(Color.white); 

		}
		
		if (e.getActionCommand() == "Grau" ) {
			MainWindow.isSetColor.setBackgroundColor(Color.gray);  

		}
		
	}
}