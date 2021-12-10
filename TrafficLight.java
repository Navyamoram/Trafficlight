package project1;
import java.lang.Thread;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.*;
public class TrafficLight extends JFrame implements Runnable{
	Hint red=new Hint(Color.RED);
    Hint yellow=new Hint(Color.yellow);
	Hint green=new Hint(Color.green);
	public  TrafficLight() {
		super("java traffic light ");
		getContentPane().setLayout(new GridLayout(2,1));
		green.turnOn(false);
		red.turnOn(true);
		yellow.turnOn(false);
		
		JPanel Tpanel=new JPanel(new GridLayout(3,1));
		Tpanel.add(red);          
		Tpanel.add(yellow);
		Tpanel.add(green);
		getContentPane().add(Tpanel);
		pack();
	}
	public void TurnRed() {
		red.turnOn(true);
		yellow.turnOn(false);
		green.turnOn(false);
		repaint();
	}
	public void TurnYellow() {
		yellow.turnOn(true);
		red.turnOn(false);
		green.turnOn(false);
		repaint();
	}
	public void TurnGreen() {
		green.turnOn(true);
		red.turnOn(false);
		yellow.turnOn(false);
		repaint();
	}
public static void main(String[] args) throws Exception {
TrafficLight t=new TrafficLight();
t.setVisible(true);
Thread t1=new Thread();
Thread t2=new Thread();
DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime now=LocalDateTime.now();
System.out.println(dtf.format(now));
Calendar cal=Calendar.getInstance();
int a1=cal.get(Calendar.SECOND);
System.out.println("the seconds in system is"+cal.get(Calendar.SECOND));
try {
	Thread.sleep(5000);
	t.TurnRed();
	stop c1=new stop();
	c1.setVisible(true);
	System.out.println("present delayed time"+new Date());
}
catch(InterruptedException e1) {
	System.err.println(e1.getMessage());
}
try {
	Thread.sleep(7000);
	//t.TurnYellow();
	Anoyellow a4=new Anoyellow();
	a4.setVisible(true);
	Cartr c3=new Cartr();
	c3.setVisible(true);
		System.out.println("another try method"+new Date());
}
catch(InterruptedException e2) {
	System.err.println(e2.getMessage());
}
try {
	Thread.sleep(8000);
	//t.TurnGreen();
	greenlight a3=new greenlight();
	a3.setVisible(true);
	Cuts c2=new Cuts();
	c2.setVisible(true);
}
catch(InterruptedException e3) {
System.err.println(e3.getMessage());
}
}
	public synchronized void run() {}
}
class Hint extends JPanel{
	Color on;
	int r=40;
	int border=10;
	boolean changes;
	Hint(Color col){
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
public synchronized void run() {}

}


