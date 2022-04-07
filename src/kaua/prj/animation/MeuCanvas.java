package kaua.prj.animation;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MeuCanvas extends JPanel{

	JButton up = new JButton("");
	int act = 0;
	boolean somar = true;
	boolean subtrair = true;
	boolean size = true;
	private int x;
	private int y;
	int speed = 3;
	int square = 100;
	
	
	public MeuCanvas() {
		x=y=0;
		setPreferredSize(new Dimension(100,200));
		up.setBounds(0,0,10,10);
		add(up);
	}
	public void atualiza() {
		
		if(size) {
			if(square>=105) {
				size=false;
			}else {
				square+=1;
			}
		}else {
			if(square<=100) {
				size=true;
			}else {
				square-=1;
			}
		}
		
		if(somar) {
			if((x+square)>=getWidth()) {
				somar=false;
			}else {
				x+=speed;
			}
		}else{
			if(x==0) {
				somar=true;
			}else {
				x-=speed;
			}
		}
		if(subtrair) {
			if((y+square)>=getHeight()) {
				subtrair=false;
			}else {
				y+=speed;
			}
		}else{
			if(y==0) {
				subtrair=true;
			}else {
				y-=speed;
			}
		}
	}
	

	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.fillRect(x,y,square,square);
	}
}
