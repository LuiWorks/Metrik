
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;

public class Drawing extends Canvas implements MouseListener {

	private float _x, _y;
	private int _canvasSize = 700; 
	private int count = 0;

	public Drawing() {
		_x = _y = 0;
		setSize(_canvasSize, _canvasSize);
		setBackground(Color.gray);
		addMouseListener(this);
	}

	@Override
	public void paint(Graphics g) {
		if (_x == 0 && _y == 0)
			return;

		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.green);
		g2d.setStroke(new BasicStroke(5));
		Rectangle2D rect = new Rectangle2D.Float(_x, _y, 100, 100);
		g2d.draw(rect);
		
		if (count % 3 == 0)
			g2d.clearRect(0, 0, _canvasSize, _canvasSize);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		_x = e.getX();
		_y = e.getY();
		paint(getGraphics());
		
		count++;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}