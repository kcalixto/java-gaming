package kaua.prj.animation;

import java.util.Timer;

import javax.swing.JFrame;

public class Principal{
	
	public Principal() {
		
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Animate");
		MeuCanvas mc = new MeuCanvas();
		frame.add(mc);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		Timer umTimer = new Timer();
		AnimaTask MeuLoop = new AnimaTask(mc);
		umTimer.scheduleAtFixedRate(MeuLoop, 0,25);
	}
}
