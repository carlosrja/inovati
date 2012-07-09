package com.inovati.threads;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Slider implements Runnable {
	
	private JPanel panel;
	public Slider(JPanel panel){
		this.panel = panel;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		JButton b = new JButton("Xinto Button Test");
		b.setBounds(0, 100, 90, 25);
		panel.add(b);
		panel.updateUI();
		for(int i = 0; i < 400 ; i++){

			try {
				Thread.sleep(1);
			} catch (Exception e2) {
				// TODO: handle exception
			}
			b.setBounds(i, 100, 90, 25);
			panel.updateUI();
		}
	}

}
