package kaua.prj.animation;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TimerTask;

public class AnimaTask extends TimerTask{

	private MeuCanvas MCcomponente;
	
	public AnimaTask(MeuCanvas mc) {
		this.MCcomponente = mc;
	}

	@Override
	public void run() {
		MCcomponente.atualiza();
		MCcomponente.repaint();
		MCcomponente.getToolkit().sync();
	}
	

}
