package project1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class greenlight extends JFrame{
	Hintss red=new Hintss(Color.RED);
    Hintss yellow=new Hintss(Color.yellow);
	Hintss green=new Hintss(Color.green);
	public greenlight() {
		super("java traffic ");
		getContentPane().setLayout(new GridLayout(2,1));
		green.turnOn(true);
		red.turnOn(false);
		yellow.turnOn(false);
		
		JPanel Tpanel=new JPanel(new GridLayout(3,1));
		Tpanel.add(red);           //signals
		Tpanel.add(yellow);
		Tpanel.add(green);
		getContentPane().add(Tpanel);
		//getContentPane().add(Lpanel);
		pack();
	}
	public void TurnonGreen() {
		green.turnOn(true);
		red.turnOn(false);
		yellow.turnOn(false);
		repaint();
	}
public static void main(String[] args) {
Anogreen s=new Anogreen();
s.TurnonGreen();
s.setVisible(true);

	}
}
class Anoyellow extends JFrame{
	Hintss red=new Hintss(Color.RED);
    Hintss yellow=new Hintss(Color.yellow);
	Hintss green=new Hintss(Color.green);
	public Anoyellow() {
		super("java traffic ");
		getContentPane().setLayout(new GridLayout(2,1));
		green.turnOn(false);
		red.turnOn(false);
		yellow.turnOn(true);
		
		JPanel Tpanel=new JPanel(new GridLayout(3,1));
		Tpanel.add(red);           //signals
		Tpanel.add(yellow);
		Tpanel.add(green);
		getContentPane().add(Tpanel);
		//getContentPane().add(Lpanel);
		pack();
	}
	public void TurnYellow() {
		yellow.turnOn(true);
		red.turnOn(false);
		green.turnOn(false);
		repaint();
	}
	public static void main(String[] args) {
		Anoyellow s1=new Anoyellow();
		s1.TurnYellow();
		s1.setVisible(true);
	}
}
class Hintss extends JPanel{
	Color on;
	int r=40;
	int border=10;
	boolean changes;
	//boolean redc;
	//boolean yellowc;
	//boolean greenc;
	Hintss(Color col){
		on=col;
		changes=true;
	}
	public void turnOn(boolean a) {
		if(changes) {
		changes=a;
		repaint();
		}
	}
	public Dimension getPreferredSize() {
		int size=(r+border)*2;
		return new Dimension(size,size);
	}
	public void paint(Graphics gr) {
		int r1 = 0;
		gr.setColor(Color.black);
		gr.fillRect(0, 0, getWidth(), getHeight());
		if(changes) {
			gr.setColor(on);
		}
		else {
			gr.setColor(on.darker().darker().darker());
		}
		gr.fillOval(border, border, 2*r, 2*r);
	}
}

