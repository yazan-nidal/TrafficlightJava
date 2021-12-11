import java.awt.*;

import javax.swing.*;

public class Trafficlight {

	public static void main(String[] args) throws InterruptedException {

		JFrame frame = initializeFrame();

		Light l1 = new Light();

		frame.add(l1);

		while (true) {
			l1.incrementValue();

			Thread.sleep(100);

			l1.swapEm();

		}

}

private static JFrame initializeFrame() {
	JFrame frame = new JFrame();
	frame.setTitle("Trafficligth");
	frame.setSize(800, 400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	return frame;
}

static class Light extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;



	private int iValue = 0;
	private int iDistance=90;
	private int topLightHeight=10;
	private Color iRed = Color.red;
	private Color iYellow = Color.white;
	private Color iGreen = Color.white;

	Light() {

	}

	public void paintComponent(Graphics g) {
		defineLight(g);

	}

	public int getValue() {
		return this.iValue;
	}

	public void setLighDistance(int distance) {

		this.iDistance = distance;
	}

	public void incrementValue() {
		if (this.iValue == 25) {
			this.iValue = -1;
		}

		this.iValue = this.iValue + 1;
	}

	public void swapEm() {
		if (this.iValue == 0) {
			this.iYellow = Color.white;
			this.iRed = Color.red;

		}

		if (this.iValue == 10) {
			this.iRed = Color.red
					;
			this.iYellow = Color.yellow;

		}



		if (this.iValue == 15) {
			this.iRed = Color.white;
			this.iYellow = Color.white;
			this.iGreen = Color.green;
		}
		if (this.iValue == 20) {
			this.iGreen = Color.white;
			this.iYellow = Color.yellow;

		}
		repaint();

	}

	public void defineLight(Graphics g) {


				g.setColor(this.iRed);
				g.fillOval(80, 10, 80, 80);




				g.setColor(this.iYellow);
				g.fillOval(80, 95, 80, 80);

				g.setColor(this.iGreen);
		        g.fillOval(80, 185, 80, 80);



          g.setColor( Color.black );
		  g.drawRect( 70, 5, 100, 270);


		  		g.setColor(Color.red);
		  		g.drawOval(80, 10, 80, 80);




		  		g.setColor(Color.yellow);
		  		g.drawOval(80, 95, 80, 80);

		  g.setColor(Color.green);
		g.drawOval(80, 185, 80, 80);








	}

}
}