package project1;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
public class stop extends JFrame {
	public stop() {
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public void paint(Graphics g) {
	//	JButton a=new JButton();
		for(int c=0;c<500;c++) {
			g.setColor(Color.red);
			g.fillRect(0, 0, 1000, 1000);
			g.setColor(Color.green);
			g.fillRect(250,250,100,50);
			g.setColor(Color.black);
			g.fillOval(260, 300, 20, 20);
			g.fillOval(320, 300, 20, 20);	
try {
	Thread.sleep(5);
} catch (InterruptedException e) {
	e.printStackTrace();
}
		}
	}
	public static void main(String[] args) throws Exception {
		stop c=new stop();
		c.paint(null);
	}
}
class Cuts extends JFrame{
	public Cuts() {
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public void paint(Graphics g1) {
		for(int c=0;c<500;c++) {
			g1.setColor(Color.red);
			g1.fillRect(0, 0, 1000, 1000);
			g1.setColor(Color.green);
			g1.fillRect(250+c,250,100,50);
			g1.setColor(Color.black);
			g1.fillOval(260+c, 300, 20, 20);
			g1.fillOval(320+c, 300, 20, 20);	
try {
	Thread.sleep(7);
} catch (InterruptedException e) {
	e.printStackTrace();
}
	}
	}
	public static void main(String[] args) {
		Cuts c1=new Cuts();
		c1.paint(null);
	}
}
class Cartr extends JFrame{
	public Cartr() {
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public void paint(Graphics g) {
		for(int c=0;c<500;c++) {
			g.setColor(Color.red);
			g.fillRect(0, 0, 1000, 1000);
			g.setColor(Color.green);
			g.fillRect(250+c,250,100,50);
			g.setColor(Color.black);
			g.fillOval(260+c, 300, 20, 20);
			g.fillOval(320+c, 300, 20, 20);	
	try {
	Thread.sleep(10);
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
		}
	}
		public static void main(String[] args) {
	Cartr a=new Cartr();
	a.paint(null);
		}

}

